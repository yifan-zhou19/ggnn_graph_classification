package <missing>;

public class GlobalMembers
{
	/*????  ??*/
	public static int Main()
	{
		int A; //??A,B,C????????A,B,C
		int B;
		int C;
		int i;
		String rank = new String(new char[3]); //??????rank[3]
		for (A = 0;A <= 2;A++)
		{ //???A,B,C
			for (B = 0;B <= 2;B++)
			{
				if (B == A)
				{
					continue;
				}
				C = 3 - A - B;
				if ((A == (B < A) + (C == A)) && (B == (A < B) + (A < C)) && (C == (C < B) + (B < A)))
				{
					rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
						 rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
					for (i = 2;i >= 0;i--)
					{
						System.out.print(rank.charAt(i));
					}
				}
			}
		} //????A,B,C
		return 0;
	}


}

