package <missing>;

public class GlobalMembers
{
	/*
	 * 01.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: 1100012797
	 */
	public static int Main()
	{
		int n;
		int a100;
		int k;
		int a50;
		int a20;
		int a10;
		int a5;
		int a1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a100 = (n - n % 100) / 100;
		k = n - a100 * 100;
		a50 = (k - k % 50) / 50;
		k = k - a50 * 50;
		a20 = (k - k % 20) / 20;
		k = k - a20 * 20;
		a10 = (k - k % 10) / 10;
		k = k - a10 * 10;
		a5 = (k - k % 5) / 5;
		k = k - a5 * 5;
		a1 = k;
		System.out.print(a100);
		System.out.print("\n");
		System.out.print(a50);
		System.out.print("\n");
		System.out.print(a20);
		System.out.print("\n");
		System.out.print(a10);
		System.out.print("\n");
		System.out.print(a5);
		System.out.print("\n");
		System.out.print(a1);
		return 0;
	}

}

