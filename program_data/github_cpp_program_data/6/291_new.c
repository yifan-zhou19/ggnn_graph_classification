#include <iostream>

using namespace std;

typedef struct node {
    int val;
    struct node *next;
} Node;

class LinkedList {
  private:
    int size;
    Node *root;

    void destroy();
    void copy(LinkedList &other);

  public:
    LinkedList();
    LinkedList(LinkedList &other);
    ~LinkedList();
    LinkedList& operator=(LinkedList &other);

    void insert(int val);
    void remove(int val);
    bool find(int val);
    void print();
};

LinkedList::LinkedList() {
    size = 0;
    root = NULL;
}

LinkedList::LinkedList(LinkedList &other) {
    copy(other);
}

LinkedList& LinkedList::operator=(LinkedList &other) {
    if (this != &other) {
        destroy();
        copy(other);
    }
    return *this;
}

LinkedList::~LinkedList() {
    destroy();
}

void LinkedList::copy(LinkedList &other) {
    root = NULL;
    Node *current = other.root;
    while (current != NULL) {
        insert(current->val);
        current = current->next;
    }
}

void LinkedList::destroy() {
    Node *prev;
    Node *current = root;
    while (current != NULL) {
        prev = current;
        current = current->next;
        delete prev;
    }
}

void LinkedList::insert(int val) {
    Node *n = new Node();
    n->val = val;
    n->next = root;
    root = n;
    size++;
}

// Removes only the first element with the given value.
void LinkedList::remove(int val) {
    Node *prev = NULL;
    Node *current = root;
    while (current != NULL && current->val != val) {
        prev = current;
        current = current->next;
    }

    if (current == NULL) {
        // Element not in the list.
        return;
    }
    
    if (prev == NULL) {
        root = current->next;
    } else {
        prev->next = current->next;
    }

    size--;

    delete current;
}

void LinkedList::print() {
    Node *current = root;
    cout << "{";
    while (current != NULL) {
        cout << current->val << " ";
        current = current->next;
    }
    cout << "}" << endl;
}

bool LinkedList::find(int val) {
    for (Node *current = root; current != NULL; current = current->next) {
        if (current->val == val) {
            return true;
        }
    }
    return false;
}

int main(void) {
    LinkedList l;
    l.insert(3);
    l.insert(5);
    l.insert(77);
    l.remove(3);
    l.print();

    LinkedList l2 = l;
    l2.print();

    LinkedList *l3 = new LinkedList();
    l3.insert(33);
    delete l3;

    return 0;
}
