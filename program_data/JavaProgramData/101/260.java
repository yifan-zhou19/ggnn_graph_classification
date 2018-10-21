package <missing>;

public class GlobalMembers
{
	//??????
	public static int Main()
	{
		int a = 0; //????
		int b = 0;
		int c = 0;
		int as = 0;
		int bs = 0;
		int cs = 0;
		int i = 0;
		String rank = new String(new char[10]);
		for (a = 0;a < 3;a++) //??????
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					if ((a != b) && (a != c) && (b != c)) //????????
					{
						as = (a < b) + (a == c); //????????????
						bs = (a > b) + (a > c);
						cs = (c > b) + (b > a);
						if ((as != bs) && (as != cs) && (bs != cs) && (a + as == 2) && (b + bs == 2) && (c + cs == 2))
						{
							rank = tangible.StringFunctions.changeCharacter(rank, as, 'A'); //?????????
							rank = tangible.StringFunctions.changeCharacter(rank, bs, 'B');
							rank = tangible.StringFunctions.changeCharacter(rank, cs, 'C');
							for (i = 2;i >= 0;i--) //??????
							{
								System.out.print(rank.charAt(i));
							}
						}
					}
				}
			}
		}
				System.out.print("\n");
		return 0;
	}
}

