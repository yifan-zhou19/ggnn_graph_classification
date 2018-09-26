package <missing>;

public class GlobalMembers
{
	/*
	 * duanwenpaixu.cpp
	 *
	 *  Created on: 2013-12-5
	 *      Author: ???
	 */
	public static int Main()
	{
		int[] a = new int[100];
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = a;p <= a[n - 1];p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (;p > a + 1;)
		{
			System.out.print(--p);
			System.out.print(' ');
		}
		System.out.print(--p);
		return 0;


	}

}

