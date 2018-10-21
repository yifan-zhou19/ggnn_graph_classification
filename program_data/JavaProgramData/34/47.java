package <missing>;

public class GlobalMembers
{
	/*
	 * 206.cpp
	 *
	 *  Created on: 2011-12-4
	 *      Author: think
	 */
	public static void print(int n)
	{
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
		}
		else
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
		}
	}
	public static int cal(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		}
		print(n);
		if (n % 2 == 0)
		{
			return cal(n / 2);
		}
		else
		{
			return cal(n * 3 + 1);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cal(n);
		return 0;
	}

}

