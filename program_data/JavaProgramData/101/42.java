package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int[] word = new int[4];
		String rank = new String(new char[4]);
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					word[a] = (b > a) + (c == a);
					word[b] = (a > b) + (a > c);
					word[c] = (c > b) + (b > a);
					rank = tangible.StringFunctions.changeCharacter(rank, a, 'A');
					rank = tangible.StringFunctions.changeCharacter(rank, b, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, c, 'C');
					if (word[3] == 0 && word[2] == 1 && word[1] == 2)
					{
						for (i = 1;i <= 3;i++)
						{
							System.out.print(rank.charAt(i));
						}
						//break;
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	}




}

