package <missing>;

public class GlobalMembers
{
	public static int match(String c, int n)
	{
		for (int i = n + 1;i < c.length();i++)
		{
			if (c[i].equals(')'))
			{
				c[i] = ' ';
				c[n] = ' ';
				return i;
			}
			else if (c[i].equals('('))
			{
				i = match(c, i);
			}
		}
		c[n] = '$';
		return c.length() - 1;
	}
	public static int Main()
	{
		String ch = new String(new char[110]);
		while ((ch = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(ch);
			System.out.print("\n");
			for (int i = 0;ch.charAt(i) != 0;i++)
			{
				if (ch.charAt(i) != '(' && ch.charAt(i) != ')')
				{
					ch = tangible.StringFunctions.changeCharacter(ch, i, ' ');
				}
			}
			for (int i = 0;ch.charAt(i) != 0;i++)
			{
				if (ch.charAt(i) == '(')
				{
					i = match(ch, i);
				}
				else if (ch.charAt(i) == ')')
				{
					ch = tangible.StringFunctions.changeCharacter(ch, i, '?');
				}
			}
			System.out.print(ch);
			System.out.print("\n");
		}
		return 0;
	}
}

