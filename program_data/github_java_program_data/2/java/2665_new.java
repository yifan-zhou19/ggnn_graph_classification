package fxc.sort;

public class BubbleSort {

    public void bubbleSort(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=array.length-1;j>i;j--){
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int array[] = {9,5,2,4,7,1,3,2,6};
        new BubbleSort().bubbleSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
