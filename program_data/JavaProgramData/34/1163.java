package <missing>;

public class GlobalMembers
{
	/*
	 * WhatFuck.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: ???
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			else if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/");
				System.out.print(2);
				System.out.print("=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
			}
			else
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
		}
		return 0;
	}

}

