package <missing>;

public class GlobalMembers
{
	/*
	 * fib.cpp
	 *
	 *  Created on: 2012-10-21
	 *      Author: Administrator
	 */

	public static int fib(int i)
	{ //?????????????
		if (i == 1 || i == 2)
		{
			return 1;
		}
		else
		{
			return (fib(i - 1)) + fib((i - 2));
		}
	} //???????????????????
	public static int Main()
	{
		int n; //??????????
		int i;
		int[] a = new int[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(fib(a[i]));
			System.out.print("\n");
		}
		return 0;
	}
}

