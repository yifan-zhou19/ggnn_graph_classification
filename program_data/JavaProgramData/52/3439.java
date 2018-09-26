package <missing>;

public class GlobalMembers
{
	/*
	 * zhizhen2.cpp
	 *
	 *  Created on: 2010-12-8
	 *      Author: l
	 */
	public static int Main()
	{
		int n;
		int i;
		int t;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=null;
		int b = null; //????
	b = a;
	for (int j = 1;j <= t;j++)
	{ //????????????????????????
	c = a[n - 1];
	for (i = n - 1;i > 0;i--)
	{
		*(b + i) = a[i - 1]; //????
	}
	b = c;
	} //?????????

		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");

		return 0;
	}

}

