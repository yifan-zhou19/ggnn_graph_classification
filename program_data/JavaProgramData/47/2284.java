package <missing>;

public class GlobalMembers
{
	/*
	 * 12.24.2.cpp
	 *
	 *  Created on: 2012-12-11
	 *      Author: slkingxr
	 */
	public static int Main()
	{
		int[] a = new int[101];
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a,q = a + n - 1;p < q;p++,q--)
		{
			t = p;
			*p = q;
			*q = t;
		}
		for (p = a;p < a + n - 1;p++)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}


}

