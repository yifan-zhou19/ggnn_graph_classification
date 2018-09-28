package <missing>;

public class GlobalMembers
{
	/*
	 * xunhuanyidong.cpp
	 *
	 *  Created on: 2012-12-14
	 *      Author: asus
	 */

	public static int Main()
	{
		int n = 0;
		int m = 0;
		int[] a = new int[205];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = m + n; i >= m + 1; i--) //??
		{
			a[i] = (a + i - m);
		}
		for (int i = 1; i <= m ; i++)
		{
			a[i] = (a + i + n);
		}
		for (int i = 1; i < n; i++)
		{
			System.out.print((a + i));
			System.out.print(" ");
		}
		System.out.print((a + n));
		System.out.print("\n");
		return 0;
	}
}

