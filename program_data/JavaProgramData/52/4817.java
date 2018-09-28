package <missing>;

public class GlobalMembers
{
	/*
	 * 11.1.cpp
	 *
	 *  Created on: 2011-12-10
	 *      Author: Administrator
	 */
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,a[203],i,n,m;
		int p;
		int[] a = new int[203];
		int i;
		int n;
		int m;
		p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n;i >= 1;i--) //???????m???
		{
			p[i + m] = p[i];
		}
		for (i = 1;i <= m;i++) //?????????
		{
			p[i] = p[i + n];
		}
		for (i = 1;i <= n - 1;i++)
		{
			System.out.print(p[i]);
			System.out.print(" ");
		}
		System.out.print(p[n]);
		return 0;
	}

}

