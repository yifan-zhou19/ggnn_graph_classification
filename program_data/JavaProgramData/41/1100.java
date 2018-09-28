package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 2;
		int C = 0;
		int D = 0;
		int E = 0;
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		for (A = 1; A <= 5; A++)
		{
			for (B = 1; B <= 2; B++)
			{
				for (C = 1; C <= 5; C++)
				{
					for (D = 1; D <= 5; D++)
					{
						for (E = 1; E <= 5; E++)
						{
							a = (E == 1);
							b = 1;
							c = (A == 5);
							d = (C != 1);
							e = (D == 1);
							int[] m = {a, b, c, d, e};
							int[] n = {A, B, C, D, E};
							for (i = 0; i < 5; i++)
							{
								if (((B == 1 && A == 2 && a == 1 && c + d + e == 0) || (B == 1 && C == 2 && c == 1 && a + d + e == 0) || (B == 0 && D == 2 && d == 1 && c + a + e == 0) || (B == 2 && A == 1 && a == 1 && c + d + e == 0) || (B == 2 && C == 1 && c == 1 && a + d + e == 0) || (B == 2 && D == 1 && d == 1 && c + a + e == 0) || (B == 2 && E == 1 && e == 1 && c + d + a == 0)) && (A * B * C * D * E == 120) && D != 4)
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
									break;
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
