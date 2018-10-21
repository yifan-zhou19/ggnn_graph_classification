package <missing>;

public class GlobalMembers
{
	/*
	 * shit.cpp
	 *
	 *  Created on: 2012-10-15
	 *      Author: Administrator
	 */


	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					if (a != b && b != c && a != c)
					{
						d = (b > a) + (c == a);
						e = (a > b) + (a > c);
						f = (c > b) + (b > a);
						if ((a + d) == (b + e) && (a + d) == (c + f) && (b + e) == (c + f))
						{
							if (a > b && b > c)
							{
								System.out.print("CBA");
							}
							else if (a > c && c > b)
							{
								System.out.print("BCA");
							}
							else if (b > a && a > c)
							{
								System.out.print("CAB");
							}
							else if (b > c && c > a)
							{
								System.out.print("ACB");
							}
							else if (c > b && b > a)
							{
								System.out.print("ABC");
							}
							else if (c > a && a > b)
							{
								System.out.print("BAC");
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
