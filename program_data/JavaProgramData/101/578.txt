package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x; //x?y?z????A?B?C?????
		int y;
		int z;
		int a; //a?b?c????????????A?B?C?????
		int b;
		int c;
		int i;
		String rank = new String(new char[3]);
		for (x = 1;x <= 2;x++) //??x?y?z?????????
		{
		for (y = 0;y <= 2;y++)
		{
		for (z = 0;z <= 2;z++)
		{
			if (x != y && x != z && y != z) //????????????if???????????
			{
				a = b = c = 2; //????2??????????????????????1
				if (x < y)
				{
					a--;
					c--;
				}
				else
				{
					b--;
				}
				if (x > z)
				{
					b--;
				}
				if (y < z)
				{
					c--;
				}
				if (a != b && b != c && c != a)
				{
					rank = tangible.StringFunctions.changeCharacter(rank, a, 'A');
					rank = tangible.StringFunctions.changeCharacter(rank, b, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, c, 'C');
					for (i = 0;i <= 2;i++)
					{
						System.out.print(rank.charAt(i));
					}

				}
			}
		}
		}
		}
			return 0;
	}

}

