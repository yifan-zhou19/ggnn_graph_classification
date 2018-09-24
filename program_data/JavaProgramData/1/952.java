package <missing>;

public class GlobalMembers
{
	/*
	 * 1118-4.cpp
	 *
	 *  Created on: 2011-11-29
	 *      Author: Administrator
	 */
	public static int divide(int n,int a)
	{
		int s = 0;
		int t = 0;
		int i;
		if (n == 1)
		{
			return 1;
		}
		for (i = a;i > 1;i--)
		{
			if (n % i == 0)
			{
				s += divide(n / i, i);
				t++;
			}
		}
		if (t == 0)
		{
			return 0;
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(divide(n, n));
		System.out.print("\n");
		k--;
		}

		return 0;
	}

}

