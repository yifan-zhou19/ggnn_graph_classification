package <missing>;

public class GlobalMembers
{
	/*
	 * shuzunixu.cpp
	 *????
	 *  Created on: 2012-12-11
	 *      Author: ???
	 */
	public static int Main()
	{
		int n; //?????????
		int i;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{ //??
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = a[n - 1]; //??????????????
		do
		{
			System.out.print(p);
			System.out.print(" ");
			p--;
		}while (p > a);
		System.out.print(a);
		return 0;
	}
}

