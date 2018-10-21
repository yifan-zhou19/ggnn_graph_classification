package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2012-11-9
	 *      Author: AK
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 1;c <= 5;c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					for (d = 1;d <= 5;d++)
					{
						if (d == a || d == b || d == c)
						{
							continue;
						}
						for (e = 1;e <= 5;e++)
						{
							if (e == a || e == b || e == c || e == d || e == 2 || e == 3)
							{
								continue;
							}
							if (a <= 2 && e != 1)
							{
								continue;
							}
							if (a > 2 && e == 1)
							{
								continue;
							}
							if (b <= 2 && b != 2)
							{
								continue;
							}
							if (b > 2 && b == 2)
							{
								continue;
							}
							if (c <= 2 && a != 5)
							{
								continue;
							}
							if (c > 2 && a == 5)
							{
								continue;
							}
							if (d <= 2 && c == 1)
							{
								continue;
							}
							if (d > 2 && c != 1)
							{
								continue;
							}
							if (e <= 2 && d != 1)
							{
								continue;
							}
							if (e > 2 && d == 1)
							{
								continue;
							}
							System.out.print(a);
							System.out.print(' ');
							System.out.print(b);
							System.out.print(' ');
							System.out.print(c);
							System.out.print(' ');
							System.out.print(d);
							System.out.print(' ');
							System.out.print(e);
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}
