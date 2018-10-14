// Gokhan Arik
//
// Stack Implementation

public class Stack<T>{

    private StackNode<T> node;
    private StackNode<T> lastNode;
    private int nOfElements;

    public Stack(){
        node = null;  
        nOfElements = 0;
    }
    
    public void push(T data){
        if( isEmpty() ){
            node = new StackNode<T>(data);
            lastNode = node;
        }
        else{
            StackNode<T> newNode = new StackNode<T>(data);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        nOfElements++;
        System.out.println( data + " added to Stack.\n");
    }
    
    public T top(){
        return lastNode.getData();
    }
    public T pop(){
    	
    	StackNode<T> removedNode = null;
    	
        if( isEmpty() ){
            System.out.println("The Stack is empty");
            return null;
        }
        else{
            StackNode<T> currentNode = node;
            do{
                currentNode = currentNode.getNext();
            }while( ( removedNode = currentNode.getNext() ) != lastNode);
            
            currentNode.setNext(null);
            lastNode = currentNode;
            nOfElements--;
            System.out.println( removedNode.getData() + " popped from Stack.\n");

            return removedNode.getData();
        }
    }

    public void print(){
        
        StackNode<T> currentNode = node;
        System.out.println("\tStack Contains");
        System.out.println("\t---------------");

        while( currentNode!= null ){
            System.out.println("\t" +currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();

    }

    public boolean isEmpty(){
        return nOfElements == 0;    
    }
}
