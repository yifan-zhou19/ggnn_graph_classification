package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *?????A,B,C???
	 *  Created on: 2012-10-4
	 *  Author:???
	 */


	public static int Main()
	{
		int A = 2; //??????C<B<A
		int B = 1;
		int C = 0;
		int a;
		int b;
		int c;
		a = (B > A) + (C == A); //a??????
		b = (A > B) + (A > C); //b??????
		c = (C > B) + (B > A); //c??????
		if (a < b && b < c) //???
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		else
		{
			;
		}
		A = 2,C = 1,B = 0; //ACB
		a = (B > A) + (C == A);
		b = (A > B) + (A > C);
		c = (C > B) + (B > A);
		if (a < c && c < b)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		else
		{
			;
		}
		B = 2,A = 1,C = 0; //CAB
		a = (B > A) + (C == A);
		b = (A > B) + (A > C);
		c = (C > B) + (B > A);
		if (b < a && a < c)
		{
		System.out.print("CAB");
		System.out.print("\n");
		}
		else
		{
			;
		}
		B = 2,C = 1,A = 0; //ACB
		a = (B > A) + (C == A);
		b = (A > B) + (A > C);
		c = (C > B) + (B > A);
		if (b < c && c < a)
		{
		System.out.print("ACB");
		System.out.print("\n");
		}
		else
		{
			;
		}
		C = 2,B = 1,A = 0; //ABC
		a = (B > A) + (C == A);
		b = (A > B) + (A > C);
		c = (C > B) + (B > A);
		if (c < b && b < a)
		{
		System.out.print("ABC");
		System.out.print("\n");
		}
		else
		{
			;
		}
		C = 2,A = 1,B = 0; //BAC
		a = (B > A) + (C == A);
		b = (A > B) + (A > C);
		c = (C > B) + (B > A);
		if (c < a && a < b)
		{
		System.out.print("BAC");
		System.out.print("\n");
		}
		else
		{
			;
		}
		return 0;
	}

}
