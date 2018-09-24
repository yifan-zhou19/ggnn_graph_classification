package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *
	 *  Created on: 2012-11-1
	 *      Author: ??
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 0; c < 3; c++)
				{
					if (c == a || c == b)
					{
						continue; //???????2??????0???
					}
					if ((((b > a) + (c == a)) == (2 - a)) && (((a > b) + (a > c)) == (2 - b)) && (((c > b) + (c > a)) == (2 - c)))
					{ //????
						if (a == 0)
						{
							System.out.print('A');
						}
						if (b == 0)
						{
							System.out.print('B');
						}
						if (c == 0)
						{
							System.out.print('C');
						}
						if (a == 1)
						{
							System.out.print('A');
						}
						if (b == 1)
						{
							System.out.print('B');
						}
						if (c == 1)
						{
							System.out.print('C');
						}
						if (a == 2)
						{
							System.out.print('A');
						}
						if (b == 2)
						{
							System.out.print('B');
						}
						if (c == 2)
						{
							System.out.print('C');
						}
					}
				}
			}
		}
		return 0;
	}

}
