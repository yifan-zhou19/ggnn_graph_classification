package <missing>;

public class GlobalMembers
{
	/*
	 * move.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: Administrator
	 */
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null,*q = null;
		int p = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = null;
		int q = null;
		int n;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		q = a + n;
		for (i = 0;i < n - m;i++)
		{
			*(q + i) = *(p + i);
		}
		p = a + n - m;
		for (i = 0;i < n - 1;i++)
		{
			System.out.print((p++));
			System.out.print(" ");
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}


}

