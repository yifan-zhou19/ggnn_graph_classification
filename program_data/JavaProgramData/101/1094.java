package <missing>;

public class GlobalMembers
{
	/*
	 * bifanliang.cpp
	 *
	 *  Created on: 2013-10-14
	 *      Author: ???1300012996
	 */
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (A = 1;A <= 3;A++)
		{ //????????
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					a = (B > A) + (C == A); //??????????????
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if (a < b && b < c && A> B && B> C)
					{
						System.out.print("CBA");
						System.out.print("\n");
					}
					if (a < c && c < b && A> C && C> B)
					{
						System.out.print("BCA");
						System.out.print("\n");
					}
					if (b < a && a < c && B> A && A> C)
					{
						System.out.print("CAB");
						System.out.print("\n");
					}
					if (b < c && c < a && B> C && C> A)
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					if (c < a && a < b && C> A && A> B)
					{
						System.out.print("BAC");
						System.out.print("\n");
					}
					if (c < b && b < a && C> B && B> A)
					{
						System.out.print("ABC");
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}
