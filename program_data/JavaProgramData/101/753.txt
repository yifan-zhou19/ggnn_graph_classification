package <missing>;

public class GlobalMembers
{
	/*
	 * 20.cpp
	 *???
	 *  Created on: 2012-10-17
	 *      Author: ???
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
						int sum1 = (b > a) + (a == c);
						int sum2 = (a > b) + (a > c);
						int sum3 = (c > b) + (c > a);
						if (((sum1 > sum2) && (a < b) || (sum1 < sum2) && (a> b)) && ((sum1> sum3) && (a < c) || (sum1 < sum3) && (a> c)) && ((sum2> sum3) && (b < c) || (sum2 < sum3) && (b> c)))
						{
							if ((sum1 > sum2) && (sum1 > sum3))
							{
								System.out.print("A");
							}
							if ((sum2 > sum3) && (sum2 > sum1))
							{
								System.out.print("B");
							}
							if ((sum3 > sum2) && (sum3 > sum1))
							{
								System.out.print("C");
							}
							if (((sum1 > sum2) && (sum3 > sum1)) || ((sum1 > sum3) && (sum2 > sum1)))
							{
								System.out.print("A");
							}
							if (((sum2 > sum1) && (sum3 > sum2)) || ((sum2 > sum3) && (sum1 > sum2)))
							{
								System.out.print("B");
							}
							if (((sum3 > sum2) && (sum1 > sum3)) || ((sum3 > sum1) && (sum2 > sum3)))
							{
								System.out.print("C");
							}
							if ((sum1 < sum2) && (sum1 < sum3))
							{
														System.out.print("A");
							}
							if ((sum2 < sum1) && (sum2 < sum3))
							{
														System.out.print("B");
							}
							if ((sum3 < sum2) && (sum3 < sum1))
							{
														System.out.print("C");
							}
						}

				}
			}
		}
	}

}
