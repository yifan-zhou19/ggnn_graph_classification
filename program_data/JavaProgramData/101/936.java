package <missing>;

public class GlobalMembers
{
	/*
	 * 20.cpp
	 *
	 *  Created on: 2012-10-17
	 *      Author: AK
	 */
	public static int Main()
	{
		int A;
		int B;
		int C;
		int c1;
		int c2;
		int c3;
		int p;
		int d;
		int f;
		for (A = 1;A <= 3;A++) //?????????????
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
				   if (!((A == B) || (A == C) || (B == C))) //??A?B?C???????????
				   {
					   c1 = (B > A) + (C == A); //?c1,c2,c3?????????????
					   c2 = (A > B) + (A > C);
					   c3 = (C > B) + (B > A);
					   p = (((c1 > c2) + (A < B)) != 1); //?????????????????p=1?????
					   d = (((c1 > c3) + (A < C)) != 1);
					   f = (((c3 > c2) + (C < B)) != 1);
					   if (p != 0 && d != 0 && f != 0) //??p?d?f??1???????
					   {
						   for (p = 1;p <= 3;p++) //??3????????2???1
						   {
								 if (A == p)
								 {
									 System.out.print('A');
								 }
								 if (B == p)
								 {
									 System.out.print('B');
								 }
								 if (C == p)
								 {
									 System.out.print('C');
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
