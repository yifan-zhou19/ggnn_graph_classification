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
							if (E != 2 && E != 3 && A != B && A != C && A != D && B != C && B != D && C != D && (A - a == 0 || B - b == 0 || C - c == 0 || D - d == 0) && (A - a == 1 || B - b == 1 || C - c == 1 || D - d == 1) && A - a + B - b + C - c + D - d + E - e == 13 && A + a + B + b + C + c + D + d + E + e == 17 && (A + a == 2 || B + b == 2 || C + c == 2 || D + d == 2 || E + e == 2) && (A + a == 3 || B + b == 3 || C + c == 3 || D + d == 3 || E + e == 3))
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
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
