package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		int i;
		int As;
		int Bs;
		int Cs;
		String s = new String(new char[3]);
		for (A = 0; A < 3; A++)
		{
			for (B = 0; B < 3; B++)
			{
				for (C = 0; C < 3; C++)
				{
								   As = (B > A) + (C == A);
								   Bs = (A > B) + (A > C);
								   Cs = (C > B) + (B > A);
					a = (A > B && As < Bs) || (A == B && As == Bs) || (A < B && As > Bs);
					b = (A > C && As < Cs) || (A == C && As == Cs) || (A < C && As > Cs);
					c = (B > C && Bs < Cs) || (B == C && Bs == Cs) || (B < C && Bs > Cs);
					if (a + b + c == 3)
					{
						s = tangible.StringFunctions.changeCharacter(s, A, 'A');
						s = tangible.StringFunctions.changeCharacter(s, B, 'B');
						s = tangible.StringFunctions.changeCharacter(s, C, 'C');
						for (i = 0; i < 3; i++)
						{
							System.out.print(s.charAt(i));
						}
						System.out.print("\n");
					}
				}
			}
		}
				return 0;
	}

}

