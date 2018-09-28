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
		for (a = 3 ; a <= 5 ; a++)
		{
			for (b = 1 ; b <= 5 ; b++)
			{
				for (c = 1 ; c <= 5 ; c++)
				{
					for (d = 1 ; d <= 5 ; d++)
					{
						for (e = 4 ; e <= 5 ; e++)
						{
							if (a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e)
							{
								continue;
							}
							A = (e == 1);
							B = (b == 2);
							C = (a == 5);
							D = (c != 1);
							E = (d == 1);
							if (A + B + C + D + E == 2)
							{
								if ((b == 1 || b == 2) && B == 1)
								{
								if (c != b && c <= 2 && C == 1)
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
								if (d != b && d <= 2 && D == 1)
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
		}
		return 0;
	}


}
