#include "splaytree.h"

template <typename T>
class SplaytreePrivate
{
    struct Node
    {
        T key;
        Node *left;
        Node *right;
        Node *parent;
    };
public:
    
    Node* add(T key);
    void remove(T key);
    bool search(T key);
    void splay(Node *n);
    void leftRotate(Node *n);
    void rightRotate(Node *n);    

	SplaytreePrivate()
        :root(0)
    {
    }

private:
    Splaytree<T> *q_ptr;
    Node *root;
};

/**
 * Rotates subtree located at n to left.
 *
*/
template <typename T> 
void SplaytreePrivate<T>::leftRoate(Node *n)
{
}

/**
 * Rotates subtree located at n to right.
 *
*/
template <typename T> 
void SplaytreePrivate<T>::rightRoate(Node *n)
{
}


template <typename T>
typename SplaytreePrivate<T>::Node* SplaytreePrivate<T>::add(T key)
{
    Node *p = 0;
    Node *n = root;
    while (n) {
        p = n;
        if(n->key == key)
            return n;
        else if (n->key < key) {
            n = n->right;
        } else {
            n = n->left;
        }
    }

    Node *new_node = new Node();
    new_node->left = new_node->right = 0;
    new_node->key = key;
    new_node->parent = p;

    if (!p)
    {
        root = new_node;
    }
    else
    {
        if (p->key < key) {
            p->right = new_node;
        } else {
            p->left = new_node;
        }
    }

    return new_node;
}

template <typename T>
void SplaytreePrivate<T>::remove(T key)
{
}


template <typename T>
void SplaytreePrivate<T>::splay(Node *n)
{
}

template <typename T>
bool SplaytreePrivate<T>::search(T key)
{
    Node *n = root;
    while (n) {
        if(n->key == key)
            return true;
        else if (n->key < key) {
            n = n->right;
        } else {
            n = n->left;
        }
    }
    return false;
}


template <typename T>
Splaytree<T>::Splaytree()
    :d_ptr(new SplaytreePrivate<T>()), root(0)
{
}

template <typename T>
void Splaytree<T>::add(T key)
{
    Node *new_node = d_ptr->add(d_ptr->root, key);
    // splay the newly added node
    // to make it the top element.
    d_ptr->splay(new_node);
}


template <typename T>
void Splaytree<T>::remove(T value)
{

}

template <typename T>
bool Splaytree<T>::search(T value)
{

}
