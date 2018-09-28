package <missing>;

public class GlobalMembers
{
	/*
	 * nb.cpp
	 *
	 *  Created on: 2013-12-5
	 *      Author: de
	 */
	public static int Main()
	{
	int n;
	int i;
	int t;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[n];
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * q = null;
	p = a;
	for (p = a,q = a + n - 1;p < q;p++,q--)
	{
	t = p;
	*p = q;
	*q = t;
	}
	p = a;
	System.out.print(p);
	for (p = a + 1;p < a + n;p++)
	{
	System.out.print(" ");
	System.out.print(p);
	}
	return 0;
	}

}

