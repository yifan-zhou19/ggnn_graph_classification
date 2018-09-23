package <missing>;

public class GlobalMembers
{
	/*
	 * eatingamount.cpp
	 *
	 *  Created on: 2013-11-3
	 *      Author: ???
	 */
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 1;C <= 3;C++)
				{
					if (A == C || B == C)
					{
						continue;
					}
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
						if (a > b && b > c && A < B && B < C)
						{
							System.out.print("ABC");
							break;
						}
						if (a > c && c > b && A < C && C < B)
						{
							System.out.print("ACB");
							break;
						}
						if (b > a && a > c && B < A && A < C)
						{
							System.out.print("BAC");
							break;
						}
						if (b > c && c > a && B < C && C < A)
						{
							System.out.print("BCA");
							break;
						}
						if (c > a && a > b && C < A && A < B)
						{
							System.out.print("CAB");
							break;
						}
						if (c > b && b > a && C < B && B < A)
						{
							System.out.print("CBA");
							break;
						}
				}

			}
		}
			return 0;
	}

}
