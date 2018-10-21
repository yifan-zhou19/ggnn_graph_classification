package <missing>;

public class GlobalMembers
{
	/*
	 * 01.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: ???
	 */

	public static int Main() //?????
	{
		int n; //????
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 100; //??100????
		if (n % 100 != 0)
		{
			b = ((n % 100) / 50); //50????
		if ((n - 100 * a) % 50 != 0)
		{
			c = (((n - 100 * a - 50 * b) % 50) / 20); //20????
					if ((n - 100 * a - 50 * b) % 20 != 0)
					{
						d = (((n - 100 * a - 50 * b) % 20) / 10); //10???
						if ((n - 100 * a - 50 * b - 20 * c) % 10 != 0)
						{
							e = ((n - a * 100 - 50 * b - 20 * c - 10 * d) % 10) / 5; //5???
						}
						{
						if ((n - 100 * a - 50 * b - 20 * c - 10 * d) % 5 != 0)
						{
							f = (((n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e) % 5) / 1);
						}
				}
					}
		}
		}
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		System.out.print(d);
		System.out.print("\n");
		System.out.print(e);
		System.out.print("\n");
		System.out.print(f);
		System.out.print("\n");
		return 0;
	}

}

