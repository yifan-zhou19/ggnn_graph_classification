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
		for (A = 1; A <= 5; A++)
		{
			for (B = 1; B <= 5; B++)
			{
				if (B != A)
				{
					for (C = 1; C <= 5; C++)
					{
						if (C != A && C != B)
						{
							for (D = 1; D <= 5;D++)
							{
								if (D != A && D != B && D != C)
								{
									E = 15 - A - B - C - D;
									if (E != 2 && E != 3)
									{
										a = (E == 1);
										b = (B == 2);
										c = (A == 5);
										d = (C != 1);
										e = (D == 1);
										if (a * A + B * b + C * c + D * d + E * e == 3 && a + b + c + d + e == 2)
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
			}
		}
		return 0;
	}
}
