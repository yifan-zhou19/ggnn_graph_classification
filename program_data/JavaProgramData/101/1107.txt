package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2013-10-19
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					A = (b > a) + (a == c);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);

						if (A > B && B > C && a < b && b < c)
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
							System.out.print("\n");
						}
						if (A > C && C > B && a < c && c < b)
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
							System.out.print("\n");

						}
						if (B > A && A > C && b < a && a < c)
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
							System.out.print("\n");

						}
						if (B > C && C > A && b < c && c < a)
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
							System.out.print("\n");

						}
						if (C > B && B > A && c < b && b < a)
						{
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
							System.out.print("\n");
						}
						if (C > A && A > B && c < a && a < b)
						{
							System.out.print("C");
							System.out.print("A");
							System.out.print("B");
							System.out.print("\n");

						}

				}
			}
		}
		return 0;
	}

}
