package <missing>;

public class GlobalMembers
{
	/*
	 * bifanliang.cpp
	 *
	 *  Created on: 2010-11-17
	 *      Author: Administrator
	 *      ???????
	 */
	public static int Main()
	{
		int A;
		int B;
		int C;
		int As;
		int Bs;
		int Cs;
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++)
			{
				for (C = 0; C <= 2; C++)
				{

					As = (B > A) + (A == C);
					Bs = (A > B) + (A > C);
					Cs = (C > B) + (B > A);
					if ((A + As == 2) && (B + Bs == 2) && (C + Cs == 2))
					{
						if ((A < B) && (B < C))
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
						else if ((A < C) && (C < B))
						{
							System.out.print("ACB");
							System.out.print("\n");
						}
						else if ((B < A) && (A < C))
						{
							System.out.print("BAC");
							System.out.print("\n");
						}
						else if ((B < C) && (C < A))
						{
							System.out.print("BCA");
							System.out.print("\n");
						}
						else if ((C < B) && (B < A))
						{
							System.out.print("CBA");
							System.out.print("\n");
						}
						else if ((C < A) && (A < B))
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}

}
