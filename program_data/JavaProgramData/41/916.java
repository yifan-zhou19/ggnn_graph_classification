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
		for (E = 1;E <= 5;E++)
		{
			for (A = 1;A <= 5;A++)
			{
				for (B = 1;B <= 5;B++)
				{
					for (C = 1;C <= 5;C++)
					{
						for (D = 1;D <= 5;D++)
						{
							if ((A != B) && (A != C) && (A != D) && (A != E) && (B != C) && (B != D) && (B != E) && (C != D) && (C != E) && (D != E) && (E != 2) && (E != 3))
							{
								a = (E == 1);
								b = (B == 2);
								c = (A == 5);
								d = (C != 1);
								e = (D == 1);
								if (((A + a <= 3) + (B + b <= 3) + (C + c <= 3) + (D + d <= 3) + (E + e <= 3) == 3) && (a + b + c + d + e == 2) && ((A + a <= 2) + (B + b <= 2) + (C + c <= 2) + (D + d <= 2) + (E + e <= 2) == 1) && ((A == a) + (B == b) + (C == c) + (D == d) + (E == e) == 1))
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
		}
							return 0;
	}

}
