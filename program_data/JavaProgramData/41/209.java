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
		int i;
		int j;
		int k;
		int m;
		int l;
		int p;
		String ci = new String(new char[6]);
		String T = new String(new char[6]);
		for (i = 1 ; i <= 5 ; i++)
		{
			A = i;
			ci = tangible.StringFunctions.changeCharacter(ci, i, 'A');
			for (j = 1 ; j <= 5 ; j++)
			{
				if (A != j)
				{
					B = j;
					ci = tangible.StringFunctions.changeCharacter(ci, j, 'B');
					for (k = 1 ; k <= 5 ; k++)
					{
						if (A != k && B != k)
						{
							C = k;
							ci = tangible.StringFunctions.changeCharacter(ci, k, 'C');
							for (m = 1 ; m <= 5 ; m++)
							{
								if (m != A && m != B && m != C)
								{
									D = m;
									ci = tangible.StringFunctions.changeCharacter(ci, m, 'D');
									for (l = 1 ; l <= 5 ; l++)
									{
										if (l != A && l != B && l != C && l != D && l != 2 && l != 3)
										{
											E = l;
											ci = tangible.StringFunctions.changeCharacter(ci, l, 'E');
											T = tangible.StringFunctions.changeCharacter(T, 1, (E == 1));
											T = tangible.StringFunctions.changeCharacter(T, 2, (B == 2));
											T = tangible.StringFunctions.changeCharacter(T, 3, (A == 5));
											T = tangible.StringFunctions.changeCharacter(T, 4, (C != 1));
											T = tangible.StringFunctions.changeCharacter(T, 5, (D == 1));
											if (T.charAt(ci.charAt(1) - 'A' + 1) == 1 && T.charAt(ci.charAt(2) - 'A' + 1) == 1 && T.charAt(ci.charAt(3) - 'A' + 1) == 0 && T.charAt(ci.charAt(4) - 'A' + 1) == 0 && T.charAt(ci.charAt(5) - 'A' + 1) == 0)
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
					}
				}
			}
		}
		return 0;






	}





}

