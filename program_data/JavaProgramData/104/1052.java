package <missing>;

public class GlobalMembers
{
	/*
	 *  ???.cpp
	 *  Created on: 2012-11-19
	 *  Author:???
	 */
	public static int f(int a, int b)
	{
		if (a == b)
		{
			return a;
		}
		if (a > b)
		{
			a = a % 2 == 0 ? a / 2 : (a - 1) / 2;
			return f(a, b);
		}
		else
		{
			b = b % 2 == 0 ? b / 2 : (b - 1) / 2;
			return f(a, b);
		}
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(a, b));
		System.out.print("\n");
		return 0;
	}

}

