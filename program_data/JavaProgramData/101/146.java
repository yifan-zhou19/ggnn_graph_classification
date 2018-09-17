package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String x = ""; //???????
		int A; //??????
		int B;
		int C;
		for (A = 0;A < 3;A++)
		{
			for (B = 0;B < 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				C = 3 - A - B; //??????
				x = tangible.StringFunctions.changeCharacter(x, A, (B > A) + (C == A));
				x = tangible.StringFunctions.changeCharacter(x, B, (A > B) + (A > C));
				x = tangible.StringFunctions.changeCharacter(x, C, (C > B) + (B > A)); //??
				if (x.charAt(A) == 2 - A && x.charAt(B) == 2 - B && x.charAt(C) == 2 - C)
				{
					x = tangible.StringFunctions.changeCharacter(x, A, 'A');
					x = tangible.StringFunctions.changeCharacter(x, B, 'B');
					x = tangible.StringFunctions.changeCharacter(x, C, 'C'); //???????
					System.out.print(x.charAt(0));
					System.out.print(x.charAt(1));
					System.out.print(x.charAt(2));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

