package <missing>;

public class GlobalMembers
{
	/*
	 * 05.cpp
	 *??? ???
	 *  Created on: 2012-10-18
	 *      Author: ???
	 */
	public static int Main()
	{
		int A;
		int B;
		int C;
		int p;
		int m;
		int n;
		A = 3;
		B = 2;
		C = 1;
			p = (A < B) + (A == C);
			m = (A > B) + (A > C);
			n = (C > B) + (B > A);
			if (p == 0 && m == 1 && n == 2)
			{
				System.out.print("CBA");
				System.out.print("\n");
			}
		A = 3;
		B = 1;
		C = 2;
			p = (A < B) + (A == C);
			m = (A > B) + (A > C);
			n = (C > B) + (B > A);
			if (p == 0 && m == 2 && n == 1)
			{
				System.out.print("BCA");
				System.out.print("\n");
			}
		A = 2;
		B = 3;
		C = 1;
			p = (A < B) + (A == C);
			m = (A > B) + (A > C);
			n = (C > B) + (B > A);
			if (p == 1 && m == 0 && n == 2)
			{
				System.out.print("CAB");
				System.out.print("\n");
			}
		A = 1;
		B = 3;
		C = 2;
			p = (A < B) + (A == C);
			m = (A > B) + (A > C);
			n = (C > B) + (B > A);
			if (p == 2 && m == 0 && n == 1)
			{
				System.out.print("ACB");
				System.out.print("\n");
			}
		A = 1;
		B = 2;
		C = 3;
			p = (A < B) + (A == C);
			m = (A > B) + (A > C);
			n = (C > B) + (B > A);
			if (p == 2 && m == 1 && n == 0)
			{
				System.out.print("ABC");
				System.out.print("\n");
			}
		A = 2;
		B = 1;
		C = 3;
			p = (A < B) + (A == C);
			m = (A > B) + (A > C);
			n = (C > B) + (B > A);
			if (p == 1 && m == 2 && n == 0)
			{
				System.out.print("BAC");
				System.out.print("\n");
			}
		return 0;
	}

}
