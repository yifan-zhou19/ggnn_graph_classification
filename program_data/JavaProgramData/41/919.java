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
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
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
							a = (E == 1);
							b = (B == 2);
							c = (A == 5);
							d = (C != 1);
							e = (D == 1);
							a1 = (a == 1 && (A == 1 || A == 2));
							b1 = (b == 1 && (B == 1 || B == 2));
							c1 = (c == 1 && (C == 1 || C == 2));
							d1 = (d == 1 && (D == 1 || D == 2));
							e1 = (e == 1 && (E == 1 || E == 2));
							if (a1 + b1 + c1 + d1 + e1 == 2 && a + b + c + d + e == 2 && A != B && A != C && A != D && A != E && B != C && B != D && B != E && C != D && C != E && D != E && E != 2 && E != 3)
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
