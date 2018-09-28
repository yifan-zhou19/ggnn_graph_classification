package <missing>;

public class GlobalMembers
{
	/*
	 * five.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: b
	 */
	public static int Main() //?????
	{ //?????
		int A; //????
		int B;
		int C;
		int D;
		int E;
		for (A = 1;A <= 5;A++)
		{
			for (B = 1;B <= 5;B++)
			{
				for (C = 1;C <= 5;C++)
				{
					for (D = 1;D <= 5;D++)
					{
						for (E = 1;E <= 5;E++) //??
						{
								if ((A == B) || (A == C) || (A == D) || (A == E) || (B == C) || (B == D) || (B == E) || (C == D) || (C == E) || (D == E))
								{
									continue;
								}
							if ((E != 2) && (E != 3) && ((E == 1) + (B == 2) + (A == 5) + (C != 1) + (D == 1)) == 2 && ((((A == 1) + (A == 2) + (E == 1)) == 0) || ((A == 1) + (A == 2) + (E == 1)) == 2) && ((((B == 1) + (B == 2) + (B == 2)) == 0) || ((B == 1) + (B == 2) + (B == 2)) == 2) && ((((C == 1) + (C == 2) + (A == 5)) == 0) || ((C == 1) + (C == 2) + (A == 5)) == 2) && ((((D == 1) + (D == 2) + (C != 1)) == 0) || ((D == 1) + (D == 2) + (C != 1)) == 2) && ((((E == 1) + (E == 2) + (D == 1)) == 0) || ((E == 1) + (E == 2) + (D == 1)) == 2)) //??????
							{
								System.out.print(A);
								System.out.print(" ");
								System.out.print(B);
								System.out.print(" ");
								System.out.print(C);
								System.out.print(" ");
								System.out.print(D);
								System.out.print(" ");
								System.out.print(E);
								System.out.print("\n");
							}
						} //??
					}
				}
			}
		}
		return 0; //???????????????????
	} //????

}
