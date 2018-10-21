package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //????
		int B;
		int C;
		int D;
		int E;
	for (A = 1;A < 6;A++)
	{
		for (B = 1;B < 6;B++)
		{
			for (C = 1;C < 6;C++)
			{
				for (D = 1;D < 6;D++)
				{
					for (E = 1;E < 6;E++)
					{
						if ((E == 1) + (B == 2) + (A == 5) + (C != 1) + (D == 1) == 2 && (A == B) + (A == C) + (A == D) + (A == E) + (B == C) + (B == D) + (B == E) + (C == D) + (C == E) + (D == E) == 0 && (E != 2) + (E != 3) == 2 && A == 5 && B != 1)
						{

												System.out.print(A);
												System.out.print(' ');
												System.out.print(B);
												System.out.print(' ');
												System.out.print(C);
												System.out.print(' ');
												System.out.print(D);
												System.out.print(' ');
												System.out.print(E);
												System.out.print("\n");
						}
					}
				}
			}
		}
	} //??????????


	return 0;
	}


}
