package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		String x = new String(new char[3]);
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 0;c < 3;c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					if (((b > a) + (c == a) == 2 - a) && ((a > b) + (a > c) == 2 - b) && ((c > b) + (b > a) == 2 - c))
					{
						x = tangible.StringFunctions.changeCharacter(x, a, 'A');
						x = tangible.StringFunctions.changeCharacter(x, b, 'B');
						x = tangible.StringFunctions.changeCharacter(x, c, 'C');
						for (i = 0;i < 3;i++)
						{
							System.out.print(x.charAt(i));
						}
					}
				}
			}
		}
		return 0;
	}


}

