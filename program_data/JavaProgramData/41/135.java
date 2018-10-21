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
		int z;
		for (A = 1; A <= 5; A++)
		{
			for (B = 1; B <= 5; B++)
			{
				for (C = 1; C <= 5; C++)
				{
					for (D = 1; D <= 5; D++)
					{
						for (E = 1; E <= 5; E++)
						{
							a = (E == 1);
							b = (B == 2);
							c = (A == 5);
							d = (C != 1);
							e = (D == 1);
							x = a * A + b * B + c * C + d * D + e * E;
							y = A + B + C + D + E;
							z = A * B * C * D * E;
							if ((E != 3) && (E != 2) && (x == 3) && (y == 15) && (z == 120) && ((a * A) != 3) && ((b * B) != 3) && ((c * C) != 3) && ((d * D) != 3) && ((e * E) != 3))
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
							}
						}
					}
				}
			}
		}



		return 0;
	}


}
