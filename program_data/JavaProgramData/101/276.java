package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //?????????????????????
		int b;
		int c;
		int i;
		int[] word = new int[4];
		String rank = new String(new char[4]); //??????????
		for (a = 1;a <= 3;a++) //?????????????
		{
			for (b = 1;b <= 3;b++)
			{
				if (a == b) //?????????
				{
					continue;
				}
				for (c = 1;c <= 3;c++)
				{
					if (b == c || a == c)
					{
						continue;
					}
					word[a] = (b > a) + (c == a); //???????????
					word[b] = (a > b) + (a > c);
					word[c] = (c > b) + (b > a);
					rank = tangible.StringFunctions.changeCharacter(rank, a, 'A'); //?????????????????
					rank = tangible.StringFunctions.changeCharacter(rank, b, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, c, 'C');
					if (word[1] == 2 && word[2] == 1 && word[3] == 0) //???????????
					{
						for (i = 1;i <= 3;i++)
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

