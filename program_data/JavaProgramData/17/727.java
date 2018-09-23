package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[150]);
		char[] d = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int l = 11;
		int x;
		for (x = 1;x <= 10;x++)
		{
			for (i = 0;i <= l;i++)
			{
			c = tangible.StringFunctions.changeCharacter(c, i, ' ');
			d[i] = '\0';
			}
			c = new Scanner(System.in).nextLine();
			l = c.length();
			for (i = 0;;i++)
			{
				if (c.charAt(i) == '\0')
				{
					break;
				}
				if (c.charAt(i) == ')')
				{
					for (j = i;j >= 0;j--)
					{
						if (c.charAt(j) == '(')
						{
							c = tangible.StringFunctions.changeCharacter(c, j, '!');
							break;
						}
					}
					if (j < 0)
					{
						c = tangible.StringFunctions.changeCharacter(c, i, '?');
						d[i] = '?';
					}
				}
			}
			for (i = 0;;i++)
			{
				if (c.charAt(i) == '(')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '!');
					d[i] = '$';
				}
				if (c.charAt(i) == '\0')
				{
					break;
				}
			}
			for (i = 0;;i++)
			{
				if (c.charAt(i) == '\0')
				{
					break;
				}
				if (c.charAt(i) == '!')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '(');
				}
				if (c.charAt(i) == '?')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, ')');
				}
				if (d[i] != '$' && d[i] != '?')
				{
					d[i] = ' ';
				}
			}
			System.out.println(c);
			System.out.println(d);
		}
		return 0;
	}
}

