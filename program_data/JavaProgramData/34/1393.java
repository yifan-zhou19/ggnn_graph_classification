package <missing>;

public class GlobalMembers
{
	/*
	 * jiaogu.cpp
	 *
	 *  Created on: 2012-11-26
	 *      Author: dell
	 */
	public static void solve(int n)
	{
		if (n % 2 == 1 && n != 1)
		{
			System.out.print(n);
			System.out.print("*");
			System.out.print(3);
			System.out.print("+");
			System.out.print(1);
			System.out.print("=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
			n = n * 3 + 1;
		}
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/");
			System.out.print(2);
			System.out.print("=");
			System.out.print(n / 2);
			System.out.print("\n");
			n = n / 2;
		}
		if (n != 1)
		{
			solve(n);
		}
		if (n == 1)
		{
			System.out.print("End");
		} //????????
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		solve(n);
		return 0;
	} //??n?????????????

}

