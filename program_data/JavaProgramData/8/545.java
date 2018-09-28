package <missing>;

public class GlobalMembers
{
	public static int[] ary1 = new int[30];
	public static int[] ary2 = new int[30];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt1,*pt2;
	public static int pt1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt2;
	public static int pt2;



	public static void input(int[] array, int num)
	{
		 int i;
		 for (i = 0; i < num; i++)
		 {
				  array[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	public static void sort(tangible.RefObject<Integer> ptr, int num)
	{
		 int i;
		 int j;
		 int temp;
		 for (i = num - 1; i >= 0; i--)
		 {
				 for (j = 0; j < i; j++)
				 {
						  if (*(ptr.argValue + j) > *(ptr.argValue + j + 1))
						  {
							  swap(*(ptr.argValue + j),*(ptr.argValue + j + 1));
						  }
				 }
		 }
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'ptr1', so pointers on this parameter are left unchanged:
	public static void combine(int * ptr1, tangible.RefObject<Integer> ptr2, int num1, int num2)
	{
		 int i;
		 ptr1 += num1;
		 for (i = 0; i < num2; i++)
		 {
				  *(ptr1 + i) = *(ptr2.argValue + i);
		 }
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'pointer', so pointers on this parameter are left unchanged:
	public static void demo(int * pointer, int sum)
	{
		 int count = 0;
		 while (count != sum)
		 {
					 System.out.print(pointer);
					 if (count++ !=sum - 1)
					 {
						 System.out.print(" ");
					 }
					 pointer++;
		 }
	}


	public static int Main(String[] args)
	{
		pt1 = ary1[0];
		pt2 = ary2[0];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		input(ary1, m);
		input(ary2, n);
	tangible.RefObject<Integer> tempRef_ary1 = new tangible.RefObject<Integer>(ary1);
		sort(tempRef_ary1, m);
		ary1 = tempRef_ary1.argValue;
	tangible.RefObject<Integer> tempRef_ary2 = new tangible.RefObject<Integer>(ary2);
		sort(tempRef_ary2, n);
		ary2 = tempRef_ary2.argValue;
	tangible.RefObject<Integer> tempRef_pt2 = new tangible.RefObject<Integer>(pt2);
		combine(pt1, tempRef_pt2, m, n);
		pt2 = tempRef_pt2.argValue;
		demo(pt1, m + n);


		return EXIT_SUCCESS;
	}

}

