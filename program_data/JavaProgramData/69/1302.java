package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[300]);
	public static String b = new String(new char[300]);
	public static String c = new String(new char[300]);


	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la;
		int lb;
		la = a.length();
		lb = b.length();
		if (la > lb)
		{
			c = a;
			a = b;
			b = c;
		}
		la = a.length();
		lb = b.length();
		for (int i = 0 ; i < 300 ; i++)
		{
			c = c.substring(0, i);
		}
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');
		for (int i = lb - 1 ; i >= 0 ; i--)
		{
			if (i >= lb - la)
			{
				c.charAt(i + 1) += b.charAt(i) + (a.charAt(i + la - lb) - '0');
			}
			else
			{
				c.charAt(i + 1) += b.charAt(i);
			}
			if (c.charAt(i + 1) > '9')
			{
				c.charAt(i + 1) -= 10;
				c.charAt(i) += 1;
			}
		}
		int i = 0;
		while (c.charAt(i) == '0')
		{
			i++;
		}
		if (i <= lb)
		{
			for (; i <= lb; i++)
			{
				System.out.print(c.charAt(i));
			}
		}
		else
		{
			System.out.print(0);
		}
		System.out.print("\n");
		return 0;
	}
}

