package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2010-11-30
	 *      Author: ???
	 *        ??? ???
	 */



	public static int k(int m,int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (m >= n)
		{
			return k(m - n, n) + k(m, n - 1);
		}
		else
		{
			return k(m, n - 1);
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int zu;
		zu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= zu;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(k(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

