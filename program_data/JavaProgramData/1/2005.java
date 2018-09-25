package <missing>;

public class GlobalMembers
{
	/*
	 * ways.cpp
	 *
	 *  Created on: 2013-11-24
	 *      Author: Mac
	 */


	public static int factor(int a, int f)
	{
		if (a == f)
		{
			return 1;
		}
		if (a < f)
		{
			return 0;
		}
		if (a % f == 0)
		{
			return factor(a, f + 1) + factor(a / f, f);
		}
		else
		{
			return factor(a, f + 1);
		}
	}

	public static int Main()
	{
		int x;
		int a;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x > 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(factor(a, 2));
			System.out.print("\n");
			x--;
		}
	}

}

