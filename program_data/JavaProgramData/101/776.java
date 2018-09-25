package <missing>;

public class GlobalMembers
{
	/*
	 * 40.cpp
	 *
	 *  Created on: 2012-10-20
	 *      Author: zhuyongfu
	 */



	public static int Main()
	{
		int a; //????
		int b;
		int c;
		for (a = 0;a <= 2;a++) //????
		{
			for (b = 0;b <= 2;b++) //????
			{
				for (c = 0;c <= 2;c++) //????
				{
					if (((b > a) + (c == a) + a == 2) && ((a > b) + (a > c) + b == 2) && ((c > b) + (b > a) + c == 2)) //????????
					{
							if ((a > b) && (b > c))
							{
								System.out.print('C');
								System.out.print('B');
								System.out.print('A');
								System.out.print("\n");
							}
							if ((a > c) && (c > b))
							{
								System.out.print('B');
								System.out.print('C');
								System.out.print('A');
								System.out.print("\n");
							}
							if ((b > a) && (a > c))
							{
								System.out.print('C');
								System.out.print('A');
								System.out.print('B');
								System.out.print("\n");
							}
							if ((b > c) && (c > a))
							{
								System.out.print('A');
								System.out.print('C');
								System.out.print('B');
								System.out.print("\n");
							}
							if ((c > a) && (a > b))
							{
								System.out.print('B');
								System.out.print('A');
								System.out.print('C');
								System.out.print("\n");
							}
							if ((c > b) && (b > a))
							{
								System.out.print('A');
								System.out.print('B');
								System.out.print('C');
								System.out.print("\n");
							}
					}
				}
			}
		}
		return 0;
	}
}
