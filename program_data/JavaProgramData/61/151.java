package <missing>;

public class GlobalMembers
{
	/*
	 * Filename:parctice_fibonacciarray.cpp
	 * Author: Wu Yiming
	 *  Created on: 2011-11-2
	 *  Function: find certain number in Fibonacii array
	 */



	public static int Main()
	{
		int n;
		int pos;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] fib = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		while (n != 0)
		{
			pos = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 2;i < pos;i++)
			{
				fib[i] = fib[i - 1] + fib[i - 2];
			}
			System.out.print(fib[i - 1]);
			System.out.print("\n");
			n--;
		}
		return 0;
	}

}

