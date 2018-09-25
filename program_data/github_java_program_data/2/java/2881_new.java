import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class BubbleSortTest {

	@Test
	public void test() {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = {1, 5, 3};
		int[] result = {1, 3, 5};
		
		bubbleSort.sort(arr);

		assertTrue("testBubbleSort", Arrays.equals(arr, result));
	}

	@Test
	public void test2() {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = {1, 5, 3, 7, 9, 4, 2, 10, 8, 6};
		int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		bubbleSort.sort(arr);

		assertTrue("testBubbleSort2", Arrays.equals(arr, result));
	}

	@Test
	public void testBoundary() {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = {};
		int[] result = {};
		
		bubbleSort.sort(arr);

		assertTrue("testBoundary", Arrays.equals(arr, result));
	}
}