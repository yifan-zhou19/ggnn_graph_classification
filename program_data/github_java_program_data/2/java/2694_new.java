package arrays;

public class BubbleSort {
	/*
	 * TASK: Implement BubbleSort for a static array of integers.
	 */
	
	private int[] _array;
	
	public BubbleSort() {}
	
	public void bubbleSort(int[] array) {
		_array = array;
		
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swap(j, (j + 1));
				}
			}
		}
	}
	
	private void swap(int source, int destination) {
		int temp = _array[source];
		_array[source] = _array[destination];
		_array[destination] = temp;
	}
	
	public void display() {
		for (int i = 0; i < _array.length; i++) {
			System.out.print(_array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr = {3, 2, 4, 0, 1, 2, -1, 22};
		bs.bubbleSort(arr);
		bs.display();
	}
}
