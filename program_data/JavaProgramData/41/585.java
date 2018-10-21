package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int E;
		int[] word = new int[6];
		for (A = 1;A <= 5;A++)
		{
			for (B = 1;B <= 5;B++)
			{
				if (B == A)
				{
					continue; //?continue??A,B,C,D,E??????
				}
				for (C = 1;C <= 5;C++)
				{
					if (C == A || C == B)
					{
						continue;
					}
					for (D = 1;D <= 5;D++)
					{
						if (D == A || D == B || D == C)
						{
							continue;
						}
						for (E = 1;E <= 5;E++)
						{
							if (E == A || E == B || E == C || E == D)
							{
								continue;
							}
							word[A] = (E == 1);
							word[B] = (B == 2);
							word[C] = (A == 5);
							word[D] = (C != 1);
							word[E] = (D == 1); //?word[A]????????
							if (word[1] != 0 && word[2] != 0 && word[3] == 0 && word[4] == 0 && word[5] == 0 && E != 2 && E != 3)
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
		}

			return 0;
	}

}
