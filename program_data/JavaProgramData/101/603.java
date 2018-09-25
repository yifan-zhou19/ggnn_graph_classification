package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		String rank = new String(new char[4]);
		rank = tangible.StringFunctions.changeCharacter(rank, 0, rank[1] = rank[2] = rank[3] = '0');
		for (A = 1;A <= 3;A++)
		{
			 for (B = 1;B <= 3;B++)
			 {
				for (C = 1;C <= 3;C++)
				{
					if (((A < B) + (A == C) == (A - 1)) && ((A> B) + (A > C) == (B - 1)) && ((C > B) + (B > A)) == (C - 1))
					{


						rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
						rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
						System.out.print(rank.charAt(1));
						System.out.print(rank.charAt(2));
						System.out.print("A");
						System.out.print("\n");
					}
				}

			 }
		}
		return 0;
	}

}

