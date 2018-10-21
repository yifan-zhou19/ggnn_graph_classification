package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c1 = new String(new char[260]);
		String c2 = new String(new char[260]);
		String c = new String(new char[260]);
		c1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = c1.length();
		int len2 = c2.length();
		int len = len1 + 1;
		for (int i = 0 ; i < 260 ; i++)
		{
			c = c.substring(0, i);
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
				c.charAt(i) += c1.charAt(i) + c2.charAt(i) - '0';
				if (c.charAt(i) > '9')
				{
					c.charAt(i) -= 10;
					c.charAt(i - 1)++;
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
					break;
				}
			}
		}
	}
}

