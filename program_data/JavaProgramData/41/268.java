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
		int[] rank = new int[6];
		for (A = 1;A < 6;A++)
		{
			for (B = 1;B < 6;B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 1;C < 6;C++)
				{
					if (A == C || B == C)
					{
						continue;
					}
					for (D = 1;D < 6;D++)
					{
						if (A == D || B == D || C == D)
						{
							continue;
						}
						for (E = 1;E < 6;E++)
						{
							if (A == E || B == E || C == E || D == E || E == 2 || E == 3)
							{
								continue;
							}
							else
							{
								word[A] = (E == 1);
							word[B] = (B == 2);
							word[C] = (A == 5);
							word[D] = (C != 1);
							word[E] = (D == 1);
							if (((word[1] + word[2]) == 2) && ((word[3] + word[4] + word[5]) == 0))
							{
								rank[0] = A;
								rank[1] = B;
								rank[2] = C;
								rank[3] = D;
								rank[4] = E;
								break;
							}
							}
						}
					}
				}
			}
		}
		for (int i = 0;i < 4;i++)
		{
			System.out.print(rank[i]);
			System.out.print(" ");
		}
				  System.out.print(rank[4]);
		return 0;
	}

}
