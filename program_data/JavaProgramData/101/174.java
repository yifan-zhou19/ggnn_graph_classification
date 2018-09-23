package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //?????ABC?????????word?????????
		int B;
		int C;
		int[] word = new int[4];
		int i;
		String rank = new String(new char[4]);
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				if (B == A)
				{
					continue;
				}
				for (C = 1;C <= 3;C++)
				{
					if (C == A || C == B)
					{
						continue; //?????????????????????
					}
				word[1] = (B > A) + (C == A);
				word[2] = (A > B) + (A > C);
				word[3] = (C > B) + (B > A); //????????
				rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
				rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
				rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
				if (word[rank.charAt(1) - 64] > word[rank.charAt(2) - 64] && word[rank.charAt(2) - 64] > word[rank.charAt(3) - 64]) //?????????????
				{
					for (i = 1;i < 4;i++)
					{
						System.out.print(rank.charAt(i));
					}
				}
				}
			}
		}
		return 0;
	}
}

