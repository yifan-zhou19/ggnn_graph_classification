package <missing>;

public class GlobalMembers
{
	/*
	 * 3.15.cpp
	 *
	 *  Created on: 2013-10-17
	 *      Author: st
	 */
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		for (A = 1;A <= 3;A++) //3???
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					if (A > B && B > C) //???????????????????????
					{
							if (((B > A) + (C == A)) < ((A> B) + (A > C)) && ((A > B) + (A > C)) < ((C> B) + (B > A)))
							{
							System.out.print("CBA");
							System.out.print("\n");
							}
					}
					else if (A > C && C > B)
					{
							if (((B > A) + (C == A)) < ((C> B) + (B > A)) && ((C > B) + (B > A)) < ((A> B) + (A > C)))
							{
							System.out.print("BCA");
							System.out.print("\n");
							}
					}
					else if (B > A && A > C)
					{
							if (((A > B) + (A > C)) < ((B> A) + (C == A)) && ((B > A) + (C == A)) < ((C> B) + (B > A)))
							{
						System.out.print("CAB");
						System.out.print("\n");
							}
					}
					else if (B > C && C > A)
					{
							if (((A > B) + (A > C)) < ((C> B) + (B > A)) && ((C > B) + (B > A)) < ((B> A) + (C == A)))
							{
						System.out.print("ACB");
						System.out.print("\n");
							}
					}
					else if (C > A && A > B)
					{
							if (((C > B) + (B > A)) < ((B> A) + (C == A)) && ((B > A) + (C == A)) < ((A> B) + (A > C)))
							{
							System.out.print("BAC");
							System.out.print("\n");
							}
					}
					else if (C > B && B > A)
					{
							if (((C > B) + (B > A)) < ((A> B) + (A > C)) && ((A > B) + (A > C)) < ((B> A) + (C == A)))
							{
						System.out.print("ABC");
						System.out.print("\n");
							}
					}
				}
			}
		}
		return 0;

	}

}
