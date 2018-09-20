package tests;

import static org.junit.Assert.*;
import java.util.Comparator;

import org.junit.Test;

public class MergeSort {

	@Test
	public void mergeSort() 
	{
		Character[] inputArray = {'p', 'm', 'a', 'z', 'f', 't', 'o', 's'};
		
		Character[] expectedOutput = {'a', 'f', 'm', 'o', 'p', 's', 't', 'z'};
		
		Comparator<Character> comp = (i1, i2) -> {return i1.compareTo(i2);};
		
		algo.MergeSort.mergeSort(inputArray, 0, inputArray.length - 1, comp);
				
		assertArrayEquals(expectedOutput, inputArray);
		
	}

}
