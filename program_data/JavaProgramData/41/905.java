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
		for (e = 1; e <= 5; e++)
		{
			if (e != 2 && e != 3)
			{
				for (a = 1; a <= 5; a++)
				{
					if (a != e)
					{
						for (b = 1; b <= 5; b++)
						{
							if (b != a && b != e)
							{
								for (c = 1; c <= 5; c++)
								{
									if (c != a && c != b && c != e)
									{
										for (d = 1; d <= 5; d++)
										{
											if (d != a && d != b && d != c && d != e)
											{
												A = (e == 1);
												B = (b == 2);
												C = (a == 5);
												D = (c != 1);
												E = (d == 1);
												if ((a <= 2 && b <= 2 && A != 0 && B != 0 && C == 0 && D == 0 & E == 0) || (a <= 2 && c <= 2 && A != 0 && C != 0 && B == 0 && D == 0 & E == 0) || (a <= 2 && d <= 2 && A != 0 && D != 0 && C == 0 && B == 0 & E == 0) || (a <= 2 && e <= 2 && A != 0 && E != 0 && C == 0 && D == 0 & B == 0) || (c <= 2 && b <= 2 && C != 0 && B != 0 && A == 0 && D == 0 & E == 0) || (d <= 2 && b <= 2 && D != 0 && B != 0 && C == 0 && A == 0 & E == 0) || (e <= 2 && b <= 2 && E != 0 && B != 0 && C == 0 && D == 0 & A == 0) || (c <= 2 && d <= 2 && C != 0 && D != 0 && A == 0 && B == 0 & E == 0) || (c <= 2 && e <= 2 && C != 0 && E != 0 && A == 0 && D == 0 & B == 0) || (d <= 2 && e <= 2 && D != 0 && E != 0 && C == 0 && A == 0 & B == 0))
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
												}
											}
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
