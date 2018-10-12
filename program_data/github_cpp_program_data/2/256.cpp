#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
#include <cassert>

// 说明 : 第level层的节点需要level+1个m_nexts
class Node
{
public:
    Node(int level, int key, int value)
            : m_level(level), m_key(key), m_value(value)
    {
        m_nexts.resize(m_level+1); //
    }
    int m_key, m_value;
    int m_level;
    std::vector<Node *> m_nexts;
};

// 说明 : 整个SkipList共计m_maxLevel层 [0, m_maxLevel)
class SkipList
{
public:
    explicit SkipList(int level);
    ~SkipList();

    bool Insert(int key, int value);
    bool Remove(int key);
    bool Find(int key, int &value);
    int  GetSize();
    bool DebugPrint();

private:
    int m_maxLevel; // Num of levels
    int m_currentLevel;
    std::vector<Node *> m_levels;
    int m_size;

private:
    static bool s_isInitialized;

};

SkipList::SkipList(int level)
        : m_maxLevel(level), m_currentLevel(-1), m_size(0)
{
    assert(m_maxLevel>0);
    if(s_isInitialized == false)
    {
        s_isInitialized = true;
        srand((unsigned int)time(nullptr));
    }

    m_levels.resize(m_maxLevel);

    for(auto it=m_levels.begin(); it!=m_levels.end(); it++)
    {
        *it = nullptr;
    }
}

SkipList::~SkipList()
{
    if(m_currentLevel >= 0)
    {
        auto start = m_levels[0];
        while(start)
        {
            auto temp = start->m_nexts[0];
            delete start;
            start = temp;
            m_size --;
        }
    }
    assert(!m_size);
}

bool SkipList::s_isInitialized = false;

bool SkipList::Insert(int key, int value)
{
    // Node layer num  [0, m_maxLevel)
    int nodeLevel = 0;
    {
        while(rand()%2)
        {
            nodeLevel ++;
        }
        nodeLevel = (nodeLevel>=m_maxLevel)?(m_maxLevel-1):nodeLevel;
    }
    // for debug
    //nodeLevel = value;

    std::vector<Node *> updateLists;
    for(int i=m_currentLevel; i>=0; i--)
    {
        auto start = m_levels[i];
        if(start->m_key == key)
        {
            start->m_value = value;
            return true;
        }
        else if(start->m_key > key)
        {
            updateLists.insert(updateLists.begin(), nullptr);
        }
        else
        {
            while( start->m_nexts[i] != nullptr && start->m_nexts[i]->m_key < key)
            {
                start = start->m_nexts[i];
            }
            if(start->m_nexts[i]!=nullptr && start->m_nexts[i]->m_key == key)
            {
                start->m_nexts[i]->m_value = value;
                return true;
            }
            updateLists.insert(updateLists.begin(), start);
        }
    }

    auto insertNode = new Node(nodeLevel, key, value);
    m_size ++;

    auto lineIt = m_levels.begin();

    for(int i=0; i<=nodeLevel; i++)
    {
        if(i>=0 && i<=m_currentLevel)
        {
            // 根据updateLists更新跳表
            if(updateLists[i] == nullptr)
            {
                auto temp = m_levels[i];
                m_levels[i] = insertNode;
                insertNode->m_nexts[i] = temp;
            }
            else
            {
                auto temp = updateLists[i]->m_nexts[i];
                updateLists[i]->m_nexts[i] = insertNode;
                insertNode->m_nexts[i] = temp;
            }
        }
        else
        {
            m_levels[i] = insertNode;
            insertNode->m_nexts[i] = nullptr;
        }
    }

    if(m_currentLevel < nodeLevel)
    {
        m_currentLevel = nodeLevel;
    }

    return true;
}

bool SkipList::Remove(int key)
{
    if(m_currentLevel<0)
    {
        std::cout << "Not Exists" << std::endl;
        return false;
    }

    std::vector<Node *> updateLists;

    for(int i=m_currentLevel; i>=0; i--)
    {
        auto start = m_levels[i];
        if(start->m_key >= key)
        {
            updateLists.insert(updateLists.begin(), nullptr);
        }
        else
        {
            while( start->m_nexts[i] != nullptr && start->m_nexts[i]->m_key < key)
            {
                start = start->m_nexts[i];
            }
            updateLists.insert(updateLists.begin(), start);
        }
    }

    Node *deleteNode;
    if(updateLists[0])
    {
        deleteNode = updateLists[0]->m_nexts[0];
    }
    else
    {
        deleteNode = m_levels[0];
    }

    if(!deleteNode || deleteNode->m_key != key)
    {
        std::cout << "Not Exists" << std::endl;
        return false;
    }

    bool updateLevel = false;

    for(int i=0; i<=deleteNode->m_level; i++)
    {
        if(updateLists[i])
        {
            updateLists[i]->m_nexts[i] = deleteNode->m_nexts[i];
        }
        else
        {
            m_levels[i] = deleteNode->m_nexts[i];
            if(!updateLevel && deleteNode->m_nexts[i] == nullptr)
            {
                updateLevel  = true;
                m_currentLevel = i-1;
            }
        }
    }

    delete deleteNode;
    m_size --;

    return true;
}

bool SkipList::Find(int key, int &value)
{
    if(m_currentLevel<0)
    {
        std::cout << "Not Exists" << std::endl;
        return false;
    }

    std::vector<Node *> updateLists;

    for(int i=m_currentLevel; i>=0; i--)
    {
        auto start = m_levels[i];
        if(start->m_key >= key)
        {
            updateLists.insert(updateLists.begin(), nullptr);
        }
        else
        {
            while( start->m_nexts[i] != nullptr && start->m_nexts[i]->m_key < key)
            {
                start = start->m_nexts[i];
            }
            updateLists.insert(updateLists.begin(), start);
        }
    }

    Node *findNode;
    if(updateLists[0])
    {
        findNode = updateLists[0]->m_nexts[0];
    }
    else
    {
        findNode = m_levels[0];
    }

    if(!findNode || findNode->m_key != key)
    {
        std::cout << "Not Exists" << std::endl;
        return false;
    }

    value = findNode->m_value;

    return true;
}

bool SkipList::DebugPrint()
{
    std::cout << "Total layers : " << m_maxLevel << " Current Layers : " << m_currentLevel << std::endl;
    for(int i=m_currentLevel; i>=0; i--)
    {
        std::cout << "Layer " << i << ": ";
        auto head = m_levels[i];
        while(head)
        {
            std::cout << " " << head->m_key;
            head = head->m_nexts[i];
        }
        std::cout << std::endl;
    }

    return true;
}

int SkipList::GetSize()
{
    return m_size;
}

int main()
{
    // 4 layers skip list
    auto sl = new SkipList(4);

    for(int i=0; i<20; i++)
    {
        sl->Insert(rand()%20, rand()%4);
    }

    sl->DebugPrint();

    for(int i=0; i<5; i++)
    {
        sl->Remove(rand()%20);
    }

    sl->DebugPrint();

    int value = -1;
    sl->Find(10, value);
    std::cout << value << std::endl;

    std::cout << "size " << sl->GetSize() << std::endl;

    delete sl;

    return 0;
}

// 参考
// https://github.com/ustcdane/skiplist/
// https://www.cnblogs.com/learnhow/p/6749648.html