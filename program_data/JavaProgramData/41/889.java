package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int A;
		int B;
		int C;
		int D;
		int E;
		int cnt;
		for (a = 1; a <= 5; a++)
		{
			for (b = 1; b <= 5; b++)
			{
				for (c = 1; c <= 5; c++)
				{
					for (d = 1; d <= 5; d++)
					{
						for (e = 1; e <= 5; e++)
						{
							A = (e == 1);
							B = (b == 2);
							C = (a == 5);
							D = (c != 1);
							E = (d == 1);
							if (A + B + C + D + E == 2 && e != 2 && e != 3)
							{
								cnt = 0;
								if (A == 1 && (a == 1 || a == 2))
								{
									cnt++;
								}
								if (B == 1 && (b == 1 || b == 2))
								{
									cnt++;
								}
								if (C == 1 && (c == 1 || c == 2))
								{
									cnt++;
								}
								if (D == 1 && (d == 1 || d == 2))
								{
									cnt++;
								}
								if (E == 1 && (e == 1 || e == 2))
								{
									cnt++;
								}
								if (cnt == 2 && a * a + b * b + c * c + d * d + e * e == 55)
								{
									System.out.print(a);
									System.out.print(" ");
									System.out.print(b);
									System.out.print(" ");
									System.out.print(c);
									System.out.print(" ");
									System.out.print(d);
									System.out.print(" ");
									System.out.print(e);
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
