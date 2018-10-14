package arrays;

public class Stack {

    private int[] allElements;
    private int top=-1;

    public Stack(int size) {
        allElements=new int[size];
    }

    public void push(int data){
        if (top<(allElements.length-1)){
            allElements[++top]=data;
        }
    }

    public int pop(){
        if (top<0){
            throw new IllegalStateException("Stack is empty");
        }
        return allElements[top--];
    }

    public int peek(){
        if ((top-1) >= 0){
            return allElements[top-1];
        }else{
            throw new IllegalStateException("Can not peek");
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==allElements.length-1;
    }

    public String displayStack(){
        boolean firstElement=false;
        StringBuffer stringBuffer=new StringBuffer();
        if (isEmpty() ){
            return "NIL";
        }else{
            stringBuffer.append(allElements[0]);
            for (int i=1;i<=top;i++){
                stringBuffer.append(" ").append(allElements[i]);
            }
        }
        return stringBuffer.toString();
    }
}
