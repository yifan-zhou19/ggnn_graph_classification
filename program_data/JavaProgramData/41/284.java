package <missing>;

public class GlobalMembers
{
	/*
	 * 01.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: ???
	 */

	public static int Main() //?????
	{
		int A; //????
		int B;
		int C;
		int D;
		int E;
		int cc1;
		int cc2;
		int cc3;
		int cc4;
		int cc5;
		for (A = 1;A <= 5;A++)
		{
			for (B = 1;B <= 5;B++)
			{
			if (A != B)
			{
				for (C = 1;C <= 5;C++)
				{
				if (C != A && C != B)
				{
					for (D = 1;D <= 5;D++)
					{
					if (D != A && D != B && D != C)
					{
						E = 15 - A - B - C - D; //A?B,C,D,E????
						cc1 = (E == 1);
						cc2 = (B == 2);
						cc3 = (A == 5);
						cc4 = (C != 1);
						cc5 = (D == 1); //A?B?C?D?E????

						if (((A + cc1) * (B + cc2) * (C + cc3) * (D + cc4) * (E + cc5) == 360) && ((A - cc1) * (B - cc2) * (C - cc3) * (D - cc4) * (E - cc5) == 0) && (cc1 + cc2 + cc3 + cc4 + cc5 == 2) && ((A - cc1) + (B - cc2) + (C - cc3) + (D - cc4) + (E - cc5) == 13) && (E != 2) && (E != 3))
						{
								//?????????????
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
