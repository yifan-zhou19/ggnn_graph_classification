/*
 * ����Ĳ���
 * ���ֲ��� �����ҷ�
 */

package JavaStudy;

import java.util.Arrays;

public class JavaBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,7,8,9};
		//int index = getIndex(arr,9);
		//System.out.println("Element="+arr[index]);
		selectSort_2(arr);
		int index1 = Arrays.binarySearch(arr,1);//������ڷ��ص�������λ�ã���������򷵻ص��ǡ��Ĳ����λ��-1
		int mid = halfSearch(arr,1);
		System.out.println("Element="+mid+index1);
		printArray(arr);

	}
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
	public static void selectSort_2(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			int element = arr[x];
			int index = x;
			
			for(int y=x+1; y<arr.length; y++)
			{
				if(element>arr[y])
				{
					element = arr[y];
					index = y;
					if(index!=x)
					{
						swap(arr,x,index);
					}
				}
			}
		}
	}
	public static void swap(int[] arr,int x,int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
		if(x!=arr.length-1)
			System.out.print(arr[x]+",");
		else
			System.out.print(arr[x]+"]");
		}
			
	}
	/*
	 * ���ֲ��ҷ�
	 */
	public static int binarySearch(int[] arr,int key)
	{
		int max, min, mid;
		min = 0;
		max = arr.length-1;
		mid = (max + min )/2;
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max =mid-1;
			if(max<min)
				return -1;
			mid = (max+min)/2;
		}
		return mid;
	}
	public static int halfSearch(int[] arr, int key)
	{
		int max=arr.length,min = 0,mid;
		while(min<=max)
		{
			mid = (max+min)>>1;
		if(key>arr[mid])
			min = mid + 1;
		else if(key<arr[mid])
			max = mid - 1;
		else 
			return mid;
		
		}
		return min;
	}
	/*
	 * ������ ����һ��Ԫ�� ʹ���������� ��������
	 */

}
