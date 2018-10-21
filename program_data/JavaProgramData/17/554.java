package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[120]);
	public static char ch;
	public static int n;
	public static int search(int p) //???�?�?????????�?�??
	{
		int q = p + 1;
		if (q >= n)
		{
			return q;
		}
		while ((c.charAt(q) != '?') && (q < n))
		{
			if (c.charAt(q) == '$')
			{
				q = search(q) + 1;
			}
			else
			{
				q++;
			}
		}
		if (q < n)
		{
			c = tangible.StringFunctions.changeCharacter(c, p, ' ');
			c = tangible.StringFunctions.changeCharacter(c, q, ' ');
		}
		return q;
	}
	public static int Main()
	{
		int i = 0;
		while ((ch = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(ch);
					  n = 0;
					  i = 0;
			while (ch != '\n')
			{
				if (ch == '(')
				{
					c = tangible.StringFunctions.changeCharacter(c, n, '$');
				}
				else
				{
						if (ch == ')')
						{
							c = tangible.StringFunctions.changeCharacter(c, n, '?');
						}
					else
					{
						c = tangible.StringFunctions.changeCharacter(c, n, ' ');
					}
				}
				n++;
				cin.get(ch);
							   System.out.print(ch);
			}
			while (i < n)
			{
				while ((c.charAt(i) != '$') && (i < n))
				{
					i++;
				}
				i = search(i) + 1;
			}
			for (i = 0; i < n; i++)
			{
				System.out.print(c.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

