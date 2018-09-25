package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-12-1
	 *      Author: ???
	 *        ??? ????
	 */



	public static int g(int x,int j)
	{
		for (j++;j <= x;j++)
		{
			if (x == j)
			{
				return 1;
			}
			if (x % j == 0 && x / j >= j)
			{
				return g(x / j, j - 1) + g(x, j);
			}
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(g(a, 1));
			System.out.print("\n");
		}
		return 0;
	}
}

