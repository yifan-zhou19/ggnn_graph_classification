package <missing>;

public class GlobalMembers
{
	 /*
	 * 10.11???.cpp
	 *
	 *  Created on: 2013-10-11
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int A;
		int B;
		int C;
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int flag = 0;
	for (A = 0;A <= 2;A++)
	{
		for (B = 0;B <= 2;B++)
		{
			if (B != A)
			{
			for (C = 0;C <= 2;C++)
			{
				 a1 = a2 = b1 = b2 = c1 = c2 = 0;
				if ((C != B) && (C != A))
				{
				   if (B > A)
				   {
					 a1 = 1;
				   }
				 if (A > B)
				 {
					 b1 = 1;
				 }
				 if (A > C)
				 {
					 b2 = 1;
				 }
				 if (C > B)
				 {
					 c1 = 1;
				 }
				 if (B > A)
				 {
					 c2 = 1;
				 }
				 if ((A + a1 + a2 == 2) && (B + b1 + b2 == 2) && (C + c1 + c2 == 2))
				 {
					 flag = 1;
					 break;
				 }
				}
			}
			}
		 if (flag != 0)
		 {
			 break;
		 }
		}
	if (flag != 0)
	{
		break;
	}
	}
	if (A == 0)
	{
		System.out.print('A');
	}
	if (B == 0)
	{
		System.out.print('B');
	}
	if (C == 0)
	{
		System.out.print('C');
	}
	if (A == 1)
	{
		System.out.print('A');
	}
	if (B == 1)
	{
		System.out.print('B');
	}
	if (C == 1)
	{
		System.out.print('C');
	}
	if (A == 2)
	{
		System.out.print('A');
	}
	if (B == 2)
	{
		System.out.print('B');
	}
	if (C == 2)
	{
		System.out.print('C');
	}
	return 0;
	}


}
