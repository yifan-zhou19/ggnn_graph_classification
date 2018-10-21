package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] m = new int[5][2]; //???????
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
		for (A = 0;A < 5;A++)
		{
			for (B = 0;B < 5;B++)
			{
				for (C = 0;C < 5;C++)
				{
					for (D = 0;D < 5;D++)
					{
						for (E = 0;E < 5;E++)
						{ //????????
							if ((A == B) || (A == C) || (A == D) || (A == E) || (B == C) || (B == D) || (B == E) || (C == D) || (C == E) || (D == E) || (E == 1) || (E == 2))
							{
								continue; //???????E??2???3??????
							}
								a = (E == 0); //A????????????
								b = (B == 1); //B????????????
								c = (A == 4); //C????????????
								d = (C != 0); //D????????????
								e = (D == 0); //E????????????
								m[A][0] = A;
								m[A][1] = a;
								m[B][0] = B;
								m[B][1] = b;
								m[C][0] = C;
								m[C][1] = c;
								m[D][0] = D;
								m[D][1] = d;
								m[E][0] = E;
								m[E][1] = e; //??????
								if ((m[0][0] + m[0][1] == 1) && (m[1][0] + m[1][1] == 2) && (m[2][0] + m[2][1] == 2) && (m[3][0] + m[3][1] == 3) && (m[4][0] + m[4][1] == 4))
								{ //?????????????????????????????
									   System.out.print(A + 1);
									   System.out.print(" ");
									   System.out.print(B + 1);
									   System.out.print(" ");
									   System.out.print(C + 1);
									   System.out.print(" ");
									   System.out.print(D + 1);
									   System.out.print(" ");
									   System.out.print(E+1);
									   System.out.print("\n");
									   break; //????
								}
						}
					}
				}
			}
		}
		return 0;
	}
}
