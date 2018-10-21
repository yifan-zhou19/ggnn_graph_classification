package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		String rank = new String(new char[3]);
		int i;
		for (A = 0;A < 3;A++)
		{
			for (B = 0;B < 3;B++)
			{
				if (B != A)
				{
					C = 3 - A - B;
					if ((A + ((B > A) + (C == A)) == 2) && (B + ((A > B) + (A > C)) == 2) && (C + ((C > B) + (B > A)) == 2))
					{
						rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
						rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
						rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
					}
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.print(rank.charAt(i));
		}
		   return 0;
	}
}

