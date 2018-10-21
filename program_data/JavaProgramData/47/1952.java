package <missing>;

public class GlobalMembers
{
	/*
	 *???redo.cpp
	 *????????
	 *????: 2012-12-10
	 *?????1200012825
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null,a[100],*q=null;
		int p = null;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;
		for (q = a;q <= a + n - 1;q++)
		{
			*q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print((p = a + n - 1));
		for (p = a + (n - 2);p >= a;p--)
		{
			System.out.print(" ");
			System.out.print(p);
		}
		return 0;
	}

}

