package <missing>;

public class GlobalMembers
{
	/*
	 * Fib.cpp
	 *
	 *  Created on: 2013-10-1
	 *      Author: KEVIN
	 */


	public static int[] fibs = new int[19]; //????????????????????
	public static int Fib(int i)
	{
		if (fibs[i - 1] != 0)
		{
			return fibs[i - 1]; //????????????
		}
		else
		{
					//?????????????
			if (i == 1 || i == 2)
			{
				fibs[i - 1] = 1;
				return 1;
			}
			else
			{
				fibs[i - 1] = Fib(i - 1) + Fib(i - 2);
				return fibs[i - 1];
			}
		}
	}
	public static int Main()
	{
		for (int i = 0;i <= 19;i++)
		{
			fibs[i] = 0; //???0
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(Fib(a));
			System.out.print("\n");
			n--;
		}
		return 0;
	}
}

