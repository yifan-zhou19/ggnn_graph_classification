package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int As;
		int Bs;
		int Cs;
		int A;
		int B;
		int C;
		String m = new String(new char[3]);

		for (A = 0 ; A < 3 ; A++)
		{
			for (B = 0 ; B < 3 ; B++)
			{
				for (C = 0 ; C < 3 ; C++)
				{
					As = (B > A) + (C == A);
					Bs = (A > B) + (A > C);
					Cs = (C > B) + (B > A);
					if (As + A == 2 && Bs + B == 2 && Cs + C == 2 && A != B && B != C && C != A)
					{
						m = tangible.StringFunctions.changeCharacter(m, A, 'A');
						m = tangible.StringFunctions.changeCharacter(m, B, 'B');
						m = tangible.StringFunctions.changeCharacter(m, C, 'C');
						System.out.print(m.charAt(0));
						System.out.print(m.charAt(1));
						System.out.print(m.charAt(2));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

