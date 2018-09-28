package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] word = new int[6];
		for (int A = 1 ; A <= 5 ; A++)
		{
			for (int B = 1 ; B <= 5 ; B++)
			{
				if (A == B)
				{
					continue;
				}
				for (int C = 1 ; C <= 5 ; C++)
				{
					if (C == B || C == A)
					{
						continue;
					}
					for (int D = 1 ; D <= 5 ; D++)
					{
						if (D == A || D == B || D == C)
						{
							continue;
						}
						for (int E = 1 ; E <= 5 ; E++)
						{
							if (E == A || E == B || E == C || E == D || E == 2 || E == 3)
							{
								continue;
							}
							word[A] = (E == 1);
							word[B] = (B == 2);
							word[C] = (A == 5);
							word[D] = (C != 1);
							word[E] = (D == 1);
							if (word[1] == 1 && word[2] == 1 && word[3] == 0 && word[4] == 0 && word[5] == 0)
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
						}
					}
				}
			}
		}
		return 0;
	}

}
