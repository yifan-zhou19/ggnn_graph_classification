/* cpp for linkedlist.h
* supporting files
*LINKEDLIST_H
*main.cpp
*aurthor wimansha wijekoon
*/

#include<iostream>
#include "linkedlist.h"
using namespace std;

//default constructor
linkedlist::linkedlist()
{
  m_head = NULL;
  cout << "constructor called" <<endl;
}
//destructor for linklist
linkedlist::~linkedlist()
{
  cout <<"linkedlist distructor called"<<endl;
  Node *ptr =m_head;
  while (ptr != NULL) {
    Node *temp;
    ptr =ptr->m_next;
    delete temp;
  }
}

void linkedlist::insert(int value)
{
  m_head = new Node(value,m_head);
}

void linkedlist::print()
   {
     cout << "list = " << endl << "{" << endl;
     cout << "    m_head = " << m_head << endl;
     Node *ptr =m_head;
     while (ptr!= NULL)
     {
       cout << "    ptr = " << ptr << ", ptr->m_value = ";
        cout << ptr->m_value;
        cout << ", ptr->m_next = " << ptr->m_next;
        cout << endl;

       ptr=ptr->m_next;
     }
     cout << "}" << endl;  // end of list
   }

bool linkedlist::isEmpty()
{
return(m_head== NULL);
}

void linkedlist::addAtEnd(int value)
{
  Node *ptr=m_head;
  Node *new_ptr;
  Node *temp;
  if(!isEmpty())
  {
    while (ptr->m_next!=NULL)
    {
      ptr=ptr->m_next;
    }
    new_ptr= new Node(value,NULL);
    cout<<"new pointer"<<ptr<<endl;
    ptr->m_next=new_ptr;
  //  ptr = temp->m_next;
  //  delete temp;

  }
  else
  {
      m_head = new Node(value,m_head);
  }
}
