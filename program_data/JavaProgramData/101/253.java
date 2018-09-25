package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int i = 0;
		String rank = new String(new char[3]);
		for (A = 0;A < 3;A++)
		{
			for (B = 0;B < 3;B++)
			{
				if (A == B)
				{
					continue;
				}
					C = 3 - A - B;
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
				if ((A + a == 2) && (B + b == 2) && (C + c == 2))
				{
					rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
					rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
				}
			}

		}
		for (i = 0;i < 3;i++)
		{
			System.out.print(rank.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}



}

