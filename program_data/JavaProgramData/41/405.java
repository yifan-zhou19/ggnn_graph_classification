package <missing>;

public class GlobalMembers
{
	/*
	 * ranking air-conditioner.cpp
	 *
	 *  Created on: 2011-11-15
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		for (a = 1;a <= 5;a++) //??????????
		{
			for (b = 1;b <= 5;b++)
			{
				for (c = 1;c <= 5;c++)
				{
					for (d = 1;d <= 5;d++)
					{
						for (e = 1;e <= 5;e++)
						{
							if ((a != b) * (a != c) * (a != d) * (a != e) == 1) //????????
							{
							if ((b != c) * (b != d) * (b != e) == 1)
							{
							if ((c != d) * (c != e) == 1)
							{
							if ((d != e) == 1)
							{
							if ((e != 2) + (e != 3) == 2) //E?????????
							{
							if ((e == 1) == (a <= 2)) //???????
							{
							if ((b <= 2) == (b == 2))
							{
							if ((c <= 2) == (a == 5))
							{
							if ((d <= 2) == (c != 1))
							{
							if ((e <= 2) == (d == 1))
							{
								System.out.print(a);
								System.out.print(" ");
								System.out.print(b);
								System.out.print(" ");
								System.out.print(c);
								System.out.print(" ");
								System.out.print(d);
								System.out.print(" ");
								System.out.print(e);
							}
							}
							}
							}
							}
							}
							}
							}
							}
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
