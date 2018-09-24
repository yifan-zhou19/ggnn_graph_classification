package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String Rank = new String(new char[3]); //????Rank??A,B,C?????
		int A; //????Word??A,B,C????????
		int B;
		int C;
		int[] Word = new int[3];
		int i = 1;
		for (A = 1;A < 4;A++) //??????
		{
			for (B = 1;B < 4;B++)
			{
				if (B != A)
				{
					C = 6 - A - B;
					Word[A - 1] = (A < B) + (A == C);
					Word[B - 1] = (A > B) + (A > C);
					Word[C - 1] = (C > B) + (B > A);
					Rank = tangible.StringFunctions.changeCharacter(Rank, A - 1, 'A');
					Rank = tangible.StringFunctions.changeCharacter(Rank, B - 1, 'B');
					Rank = tangible.StringFunctions.changeCharacter(Rank, C - 1, 'C');
					if ((A + Word[A - 1] == 3) && (B + Word[B - 1] == 3) && (C + Word[C - 1] == 3)) //???????????3???????
					{
						for (i = 1;i < 4;i++) //??????3?????
						{
					 System.out.print(Rank.charAt(i - 1));
						}
					}
				}
			}
		}
		return 0;
	}

}

