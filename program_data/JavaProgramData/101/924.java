package <missing>;

public class GlobalMembers
{
	/*
	 * 12.10.28.cpp
	 *Created on: 2012-10-28
	 *Author: ???
	 *??:???
	 */

	public static int comp(int a, int b)
	{
		if (a > b)
		{
			return 1;
		}
		if (a == b)
		{
			return 0;
		}
		return -1;
	}
	public static int Main()
	{
		int A;
		int B;
		int C;
		int nA;
		int nB;
		int nC;
		char ret;
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++)
			{
				for (C = 0; C <= 2; C++)
				{
					nA = (B > A) + (C == A);
					nB = (A > B) + (A > C);
					nC = (C > B) + (B > A);
					ret = true;
					if (comp(nA, nB) != comp(B, A))
					{
						ret = false;
					}
					if (comp(nA, nC) != comp(C, A))
					{
						ret = false;
					}
					if (comp(nC, nB) != comp(B, C))
					{
						ret = false;
					}
					if (ret == true)
					{
						if (A < B && A < C)
						{
							System.out.print('A');
							if (B < C)
							{
								System.out.print("BC");
							}
							else
							{
								System.out.print("CB");
							}
						}
						else if (B < C)
						{
							System.out.print('B');
							if (A < C)
							{
								System.out.print("AC");
							}
							else
							{
								System.out.print("CA");
							}
						}
						else
						{
							System.out.print("CBA");
						}
					}

				}
			}
		}
		return 0;
	}
}
