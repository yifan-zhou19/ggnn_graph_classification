package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int A = 1;
		int B = 1;
		int C = 1;
		int t = 0;
		int judge1;
		int judge2;
		int judge3;
		int[] q = new int[3];
		String name = new String(new char[3]);
		char p;
		for (A = 1;A <= 3;A++) //?A,B,C??????????1?3?????
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					a = ((B > A) + (C == A)); //?a,b,c???????????
					b = ((A > B) + (A > C));
					c = ((C > B) + (B > A));
					judge1 = ((A > B && a < b) || (A < B && a> b) || (A == B && a == b)); //?judge???????????????
					judge2 = ((B > C && b < c) || (B < C && b> c) || (B == C && b == c));
					judge3 = ((A > C && a < c) || (A < C && a> c) || (A == C && a == c));
					if ((judge1 + judge2 + judge3) == 3)
					{
						name = tangible.StringFunctions.changeCharacter(name, 0, 'A');
						name = tangible.StringFunctions.changeCharacter(name, 1, 'B');
						name = tangible.StringFunctions.changeCharacter(name, 2, 'C'); //????????????
						q[0] = 3;
						q[1] = 1;
						q[2] = 2;
						for (int i = 0;i < 2;i++)
						{
							for (int j = 0;j < 2 - i;j++)
							{
								if (q[j] > q[j + 1])
								{
									t = q[j];
									q[j] = q[j + 1];
									q[j + 1] = t;
									p = name.charAt(j);
									name = tangible.StringFunctions.changeCharacter(name, j, name.charAt(j + 1));
									name = tangible.StringFunctions.changeCharacter(name, j + 1, p);
								}
							}
						}
						System.out.print(name.charAt(0));
						System.out.print(name.charAt(1));
						System.out.print(name.charAt(2));
					}
				}
			}
		}
				return 0;
	}
}

