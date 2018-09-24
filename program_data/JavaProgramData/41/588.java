package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;
		int[] word = new int[6];
		for (A = 1;A <= 5;A++)
		{
			for (B = 1;B <= 5;B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 1;C <= 5;C++)
				{
					if (A == C || B == C)
					{
						continue;
					}
					for (D = 1;D <= 5;D++)
					{
						if (A == D || B == D || C == D)
						{
							continue;
						}
						E = 15 - A - B - C - D;
						word[A] = (E == 1);
						word[B] = (B == 2);
						word[C] = (A == 5);
						word[D] = (C != 1);
						word[E] = (D == 1);
						if (word[1] == 1 && word[2] == 1 && word[3] == 0 && word[4] == 0 && word[5] == 0 && E != 2 && E != 3)
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
				return 0;
	}

}
