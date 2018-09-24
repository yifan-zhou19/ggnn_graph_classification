#include <iostream>
#include "LinkedList.h"

<<<<<<< HEAD
LinkedList::LinkedList(){
=======
LinkedList::LinkedList(void)
{
>>>>>>> 53d7f4d442a08ce056d356024b20b12ee5efca7e
	head = NULL;
	last = NULL;
	count = 0;
}

<<<<<<< HEAD
LinkedList::LinkedList const LinkedList &list)
  :head(0), last(0), count(0)
{
  for(iterator i = list.Begin() ; i!=list.End() ; i++) push(*i);
}


LinkedList::~LinkedList(void)
{

    while(head.next != &head){
      Node* old = head.next;
      head.next = head.next->next;
      --count;
      delet old;
    }
=======
LinkedList::~LinkedList(void)
{
	node *current = head;
	node *next;

	while(current){
		next = current->pointee;
		delete current;
		current = next;
	}
>>>>>>> 53d7f4d442a08ce056d356024b20b12ee5efca7e
}

/*
	To be replaced with an iterator and an overloaded print operator for output
*/
void LinkedList::traverseList(){
	for(node *iterator = LinkedList::head ; iterator ; iterator = iterator->pointee)
	{
		std::cout << iterator->data << std::endl;
	}
}

<<<<<<< HEAD
void LinkedList::insert(int data){
}

int LinkedList::length(){
	return LinkedList::count;
}

=======
int LinkedList::length(){
	return LinkedList::count;
}

>>>>>>> 53d7f4d442a08ce056d356024b20b12ee5efca7e
/*
	Adds a new node onto the end of the list
*/
void LinkedList::push(int data){
<<<<<<< HEAD

	node *newNode = new node(data, NULL);
	
	if(!head){
		head = newNode;
		last = newNode;
	} else {
		last->pointee = newNode;
		last = newNode;
	}

	++count;
}

int main(){

	LinkedList list;

	for(int i=1 ; i<4 ; i++)
	{
		list.push(i);
	}

=======

	node *newNode = new node(data, NULL);
	
	if(!head){
		head = newNode;
		last = newNode;
	} else {
		last->pointee = newNode;
		last = newNode;
	}

	++count;
}

int main(){

	LinkedList list;

	for(int i=1 ; i<4 ; i++)
	{
		list.push(i);
	}

>>>>>>> 53d7f4d442a08ce056d356024b20b12ee5efca7e
	int length = list.length();
	std::cout << length << std::endl;
	list.traverseList();
	return 0;
}

