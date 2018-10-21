package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			n--;
			String c1 = new String(new char[110]);
			String c2 = new String(new char[110]);
			String c = new String(new char[110]);
			c1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			c2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len1 = c1.length();
			int len2 = c2.length();
			int len = len1 + 1;
			for (int i = 0 ; i < 110 ; i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, 1);
			}
			if (len2 > len1)
			{
				len = len2 + 1;
			}
			if (c1.charAt(0) == '0' && c2.charAt(0) == '0' && len1 == 1 && len2 == 1)
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else
			{
				for (int i = len1 - 1 ; i >= 0 ; i--)
				{
					c1 = tangible.StringFunctions.changeCharacter(c1, i + len - len1, c1.charAt(i));
				}
				for (int i = len - len1 - 1 ; i >= 0 ; i--)
				{
					c1 = tangible.StringFunctions.changeCharacter(c1, i, '0');
				}
				for (int i = len2 - 1 ; i >= 0 ; i--)
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, i + len - len2, c2.charAt(i));
				}
				for (int i = len - len2 - 1 ; i >= 0 ; i--)
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, i, '0');
				}
				for (int i = len - 1 ; i >= 0 ; i--)
				{
					c.charAt(i) += '0' + c1.charAt(i) - c2.charAt(i) - 1;
					if (c.charAt(i) < '0')
					{
						c.charAt(i) += 10;
						c.charAt(i - 1)--;
					}
				}
				for (int i = 0 ; ; i++)
				{
					if (c.charAt(i) != '0')
					{
						for (int j = i ; j < len ; j++)
						{
							System.out.print(c.charAt(j));
						}
						System.out.print("\n");
						break;
					}
				}
			}
		}
	}
}

