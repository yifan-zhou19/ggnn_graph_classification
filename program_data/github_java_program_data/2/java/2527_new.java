package algorithm;
/**
 * �򵥵�ð������
 * @author Rodriguez-xin
 *
 */
public class BubbleSort {

	private int[] data={3,5,16,8,25,4,26,15,18,45,24,56,27,28,9,65};
	
	public void sort(){
		int temp;
		for(int j=data.length;j>0;j--){
			for(int i=0;i<j-1;i++){
				if(data[i]>data[i+1]){
					temp=data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSort bubbleSort=new BubbleSort();
		bubbleSort.sort();
		for(int i=0;i<bubbleSort.data.length;i++){
			System.out.println(bubbleSort.data[i]);
		}
	}

}
