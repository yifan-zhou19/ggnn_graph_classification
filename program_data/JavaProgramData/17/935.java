package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[110]);
	public static int Try()
	{
		int i;
		int j;
		int L = -1;
		int R = -1;
		for (i = 0;i <= c.length() - 1;++i)
		{
			if (c.charAt(i) == '(')
			{
				L = i;
			}
		}
		for (j = c.length() - 1;j > L;--j)
		{
			if (c.charAt(j) == ')')
			{
				R = j;
			}
		}
		if (L != -1 || R != -1)
		{
			if (L == -1)
			{
				c = tangible.StringFunctions.changeCharacter(c, R, '?');
			}

			else if (R == -1)
			{
				c = tangible.StringFunctions.changeCharacter(c, L, '$');
			}
			else if (L < R)
			{
				c = tangible.StringFunctions.changeCharacter(c, L, ' ');
				c = tangible.StringFunctions.changeCharacter(c, R, ' ');
			}
			else if (L > R)
			{
				c = tangible.StringFunctions.changeCharacter(c, L, '$');
				c = tangible.StringFunctions.changeCharacter(c, R, '?');
			}
			Try();
		}
		if (L == -1 && R == -1)
		{
			return 1;
		}
	}
	public static int Main()
	{
		int k;
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		for (k = 0;k <= c.length() - 1;++k)
		{
			System.out.print(c.charAt(k));
		}
		System.out.print("\n");
		for (k = 0;k <= c.length() - 1;++k)
		{
			if (c.charAt(k) != '(' && c.charAt(k) != ')')
			{
				c = tangible.StringFunctions.changeCharacter(c, k, ' ');
			}
		}
		Try();
		for (k = 0;k <= c.length() - 1;++k)
		{
			System.out.print(c.charAt(k));
		}
		System.out.print("\n");
		}
		return 0;
	}

}

