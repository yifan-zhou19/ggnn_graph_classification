package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //??????
		int B;
		int C;
		String x = new String(new char[3]);
		for (A = 0;A <= 2;A++)
		{
			for (B = 0;B <= 2;B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 0;C <= 2;C++)
				{
					if (A == C || B == C)
					{
						continue; //?A,B,C??????
					}
					x = tangible.StringFunctions.changeCharacter(x, A, (B > A) + (A == C));
					x = tangible.StringFunctions.changeCharacter(x, B, (A > B) + (A > C));
					x = tangible.StringFunctions.changeCharacter(x, C, (C > B) + (B > A)); //???????
					if (x.charAt(2 - A) == A && x.charAt(2 - B) == B && x.charAt(2 - C) == C)
					{
						x = tangible.StringFunctions.changeCharacter(x, A, 'A');
						x = tangible.StringFunctions.changeCharacter(x, B, 'B');
						x = tangible.StringFunctions.changeCharacter(x, C, 'C'); //??
						System.out.print(x.charAt(0));
						System.out.print(x.charAt(1));
						System.out.print(x.charAt(2));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

