package <missing>;

public class GlobalMembers
{
	//???1000012915
	public static int Main()
	{
		int A;
		int B;
		int C;
		String F = new String(new char[4]);
		for (A = 0;A < 3;A++)
		{
			for (B = 0;B < 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 0;C < 3;C++)
				{
					if (C == A || C == B)
					{
						continue;
					}
					if (A == (B < A) + (A == C) && B == (A < B) + (A < C) && C == (C < B) + (B < A))
					{
						F = tangible.StringFunctions.changeCharacter(F, A, 'A');
						F = tangible.StringFunctions.changeCharacter(F, B, 'B');
						F = tangible.StringFunctions.changeCharacter(F, C, 'C');
						System.out.print(F.charAt(2));
						System.out.print(F.charAt(1));
						System.out.print(F.charAt(0));
					};
				};
			};
		};
		return 0;
	}

}

