package <missing>;

public class GlobalMembers
{
	/*
	 * 00090.cpp
	 *???11.1
	 *  Created on: 2011-12-6
	 *      Author:???
	 */


	public static int Main()
	{
		int n;
		int m;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + m];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1 = a + n - 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2 = a + n + m - 1;
		for (;p1 >= a;p1--,p2--)
		{
			*p2 = p1;
		}
		for (p1 = a + n + m - 1;p2 >= a;p1--,p2--)
		{
			*p2 = p1;
		}
		for (p1 = a;p1 < a + n - 1;p1++)
		{
			System.out.print(p1);
			System.out.print(' ');
		}
		System.out.print(p1);
		return 0;
	}
}

