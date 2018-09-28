package <missing>;

public class GlobalMembers
{
	/*
	 * zhizheng.cpp
	 *?? - ????
	 *  Created on: 2012-12-11
	 *      Author: ???
	 */
	public static int n;
	public static int N;
	public static int temp;
	public static int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * q = null;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int N = n;
		int[] a = new int[N];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a,q = a + n - 1;p < q;p++,q--)
		{
			temp = p;
			*p = q;
			*q = temp;
		}
		for (p = a;p < a + n - 1;p++)
		{
			System.out.print(p);
			System.out.print(' ');
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

