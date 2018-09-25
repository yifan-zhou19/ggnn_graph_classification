package <missing>;

public class GlobalMembers
{
	/*
	 * fengjie.cpp
	 *
	 *  Created on: 2013-11-23
	 *      Author: sony
	 */

	public static int sum;

	public static void f(int x,int i)
	{
		if (x == 1)
		{
			sum++;
		}
		for (;i <= x;i++)
		{
			if (x % i == 0)
			{
				f(x / i, i);
			}
		}
		return;
	}

	public static int Main()
	{
		int t;
		int a;
		int i = 2;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 0; a < t ; a++)
		{
			int x;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int ans = 1;
			for (i = 2; i < Math.sqrt(x) ; i++)
			{
				sum = 0;
				if (x % i == 0)
				{
					f(x / i, i);
				}
				ans = ans + sum;
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

}

