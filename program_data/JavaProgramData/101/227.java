package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int x1;
		int x2;
		int x3;
		String mun = new String(new char[4]);
		for (A = 0; A < 3; A++)
		{
			for (B = 0; B < 3; B++)
			{
				for (C = 0; C < 3; C++)
				{
					x1 = (B > A) + (C == A);
					x2 = (A > B) + (A > C);
					x3 = (C > B) + (B > A);
					 if ((x1 + A == 2) && (x2 + B == 2) && (x3 + C == 2) && A != B && B != C && C != A)
					 {
						mun = tangible.StringFunctions.changeCharacter(mun, A, 'A');
						mun = tangible.StringFunctions.changeCharacter(mun, B, 'B');
						mun = tangible.StringFunctions.changeCharacter(mun, C, 'C');
						mun = tangible.StringFunctions.changeCharacter(mun, 3, '\0');
					 }
				}
			}
		}
		System.out.print(mun);
		System.out.print("\n");
		return 0;
	}
}

