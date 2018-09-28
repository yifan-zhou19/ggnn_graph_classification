package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2010-11-28
	 *      Author: Administrator
	 */

	public static int f(int n)
	{
		int m = 1;
		for (int i = 0;i < n;i++)
		{
			m = m * n;
		}
		return m; //????
	}
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 2)
		{
			System.out.print((3 + 4 * k));
		}
		else
		{
			System.out.print(f(n) - k * (n - 1));
		}
		return 0;

	}

}

