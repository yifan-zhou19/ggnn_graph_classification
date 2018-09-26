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
		int x;
		int y;
		for (A = 1;A <= 5;A++)
		{
			for (B = 1;B <= 5;B++)
			{
				for (C = 1;C <= 5;C++)
				{
					for (D = 1;D <= 5;D++)
					{
						for (E = 1;E <= 5;E++)
						{
							x = (((A - B) * (B - C) * (C - D) * (D - E) * (E - A) * (A - C) * (A - D) * (B - D) * (B - E) * (C - E)) != 0);
							y = ((E != 2) && (E != 3));
							a = (E == 1);
							b = (B == 2);
							c = (A == 5);
							d = (C != 1);
							e = (D == 1);
							if (((A * a + B * b + C * c + D * d + E * e) == 3) && (((A - a) * (B - b) * (C - c) * (D - d) * (E - e)) == 0) && x != 0 && y != 0)
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
		}
		return 0;
	}

}
