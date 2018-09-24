package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *  Created on: 2012-10-19
	 *      Author: ???  1200012899
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		int CC1;
		int CC2;
		int CC3;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					A = (b > a) + (a == c); //A???
					B = (a > b) + (a > c); //B???
					C = (c > b) + (b > a); //C???
					CC1 = (A > B && a < b) || (A < B && a> b); //A?B????????????
					CC2 = (A > C && a < c) || (A < C && a> c); //A?C????????????
					CC3 = (B > C && b < c) || (B < C && b> c); //C?B????????????
					if (CC1 != 0 && CC2 != 0 && CC3 != 0)
					{
						//cout<<a<<b<<c;
						if (a > b && b > c)
						{
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
							System.out.print("\n");
						}
						else if (a > b && a > c && c > b)
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
							System.out.print("\n");
						}
						else if (b > a && a > c)
						{
							System.out.print("C");
							System.out.print("A");
							System.out.print("B");
							System.out.print("\n");
						}
						else if (b > a && c > a && b > c)
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
							System.out.print("\n");
						}
						else if (c > b && b > a)
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
							System.out.print("\n");
						}
						else if (c > b && a > b && c > a)
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
							System.out.print("\n");
						}
					} //???????????????
				}
			}
		}
		return 0;
	}

}
