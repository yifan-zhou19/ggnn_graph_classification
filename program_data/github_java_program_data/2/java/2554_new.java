public class BubbleSort {

    int [] arr;
    public  BubbleSort(){}

    public static void main  (String args[])
    {
        int [] arr = {10, 9 ,8 , 7 ,6 ,5,4 ,3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        for ( int i:arr){
            System.out.println(i);}
    }

    public void sort(int[] arr) {
        this.arr = arr;
        int n = this.arr.length;
        for ( int i=0; i < n-1;i ++)
        {
            for ( int j =0; j < n-1-i; j++)
            {
                if ( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
