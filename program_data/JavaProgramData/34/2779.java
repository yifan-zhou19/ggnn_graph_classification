package <missing>;

public class GlobalMembers
{
	/*
	 * qimolianxi_3.cpp
	 * Name:????
	 *  Created on: 2010-12-24
	 *      Author: ??
	 */

	public static void os(int o)
	{
		int m = o / 2;
		System.out.print(o);
		System.out.print("/");
		System.out.print(2);
		System.out.print("=");
		System.out.print(m);
		System.out.print("\n");
		if (m % 2 == 0)
		{
			os(m);
		}
		else
		{
			if (m != 1)
			{
				js(m);
			}
			else
			{
				System.out.print("End");
				System.out.print("\n");
			}
		}
	}
	public static void js(int j)
	{
		int n = j * 3 + 1;
		System.out.print(j);
		System.out.print("*");
		System.out.print(3);
		System.out.print("+");
		System.out.print(1);
		System.out.print("=");
		System.out.print(n);
		System.out.print("\n");
		if (n % 2 == 0)
		{
			os(n);
		}
		else
		{
			if (n != 1)
			{
				js(n);
			}
			else
			{
				System.out.print("End");
				System.out.print("\n");
			}
		}
	}
	public static void progress(int t)
	{
		if (t == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		}
		if (t != 1 && t % 2 == 1)
		{
		js(t);
		}
		if (t % 2 == 0)
		{
		os(t);
		}
	}
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		progress(t);
		return 0;
	}

}

