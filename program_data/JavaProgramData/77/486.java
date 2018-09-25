package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[1000]);
	public static char b;
	public static char g;
	public static int l;
	public static void game()
	{
		for (int i = 0;i < l;i++)
		{
			if (c.charAt(i) == b)
			{
				for (int j = i + 1;j < l;j++)
				{
					if (c.charAt(j) == ' ')
					{
						continue;
					}
					else if (c.charAt(j) == b)
					{
						i = j - 1;
						break;
					}
					else
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
						c = tangible.StringFunctions.changeCharacter(c, i, ' ');
						c = tangible.StringFunctions.changeCharacter(c, j, ' ');
						for (int k = i - 1;k >= 0;k--)
						{
							if (c.charAt(k) == b)
							{
								i = k - 1;
								break;
							}
						}
						break;
					}
				}
			}
		}
		if (c.charAt(0) != ' ')
		{
			game();
		}
	}
	public static int Main()
	{
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = c.length();
		b = c.charAt(0);
		for (int i = 0;i < l;i++)
		{
			if (c.charAt(i) != b)
			{
				g = c.charAt(i);
				break;
			}
		}
		game();
		return 0;
	}

}

