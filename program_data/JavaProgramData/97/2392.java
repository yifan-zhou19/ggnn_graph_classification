package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: b
	 */
	public static int Main()
	{
		int n;
		int r;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r = n % 100;
		m = (n - r) / 100;
		System.out.print(m);
		System.out.print("\n");
		n = r;
		r = n % 50;
		m = (n - r) / 50;
		System.out.print(m);
		System.out.print("\n");
		n = r;
		r = n % 20;
		m = (n - r) / 20;
		System.out.print(m);
		System.out.print("\n");
		n = r;
		r = n % 10;
		m = (n - r) / 10;
		System.out.print(m);
		System.out.print("\n");
		n = r;
		r = n % 5;
		m = (n - r) / 5;
		System.out.print(m);
		System.out.print("\n");
		n = r;
		r = n % 1;
		m = (n - r) / 1;
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}

}

