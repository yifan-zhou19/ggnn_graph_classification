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
		int a;
		int b;
		int c;
		int d;
		int e;
		for (A = 1;A <= 5; A++)
		{
			for (B = 1;B <= 5; B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 1;C <= 5; C++)
				{
					if (C == B || C == A)
					{
						continue;
					}
					for (D = 1;D <= 5; D++)
					{
						if (D == B || D == A || D == C)
						{
							continue;
						}
						for (E = 1;E <= 5; E++)
						{
							if (E == B || E == A || E == C || E == D || E == 2 || E == 3)
							{
								continue;
							}
							a = (E == 1);
							b = (B == 2);
							c = (A == 5);
							e = (D == 1);
							d = (C != 1);
							if (a + b + c + d + e == 2 && A * a + B * b + C * c + D * d + E * e == 3)
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
								break;
							}
						}
					}
				}
			}
		}
			return 0;
	}
}
