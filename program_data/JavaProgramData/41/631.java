package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-11-09
	 *      Author: 12162
	 *      Function:????
	 */



	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int E;
		int[] rank = new int[6]; //ABCDE???
		int[] words = new int[6]; //????????
		for (A = 1; A <= 5; A++)
		{ //????
			for (B = 1; B <= 5; B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 1; C <= 5; C++)
				{
					if (A == C || B == C)
					{
						continue;
					}
					for (D = 1; D <= 5; D++)
					{
						if (A == D || B == D || C == D)
						{
							continue;
						}
						E = 15 - A - B - C - D;
						words[1] = (E == 1);
						words[2] = (B == 2);
						words[3] = (A == 5);
						words[4] = (C != 1);
						words[5] = (D == 1);
						rank[A] = 1; //?????????????
						rank[B] = 2;
						rank[C] = 3;
						rank[D] = 4;
						rank[E] = 5;
						if (words[rank[3]] == 0 && words[rank[4]] == 0 && words[rank[5]] == 0 && words[rank[1]] == 1 && words[rank[2]] == 1 && E != 2 && E != 3)
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
						}
					}
				}
			}
		}
		return 0;
	}


}
