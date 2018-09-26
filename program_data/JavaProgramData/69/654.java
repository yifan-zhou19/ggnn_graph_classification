package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String a = new String(new char[533]);
		String b = new String(new char[533]);
		String c = new String(new char[533]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int al;
		int bl;
		int cl;
		al = a.length();
		bl = b.length();
		if (bl > al)
		{
			c = a;
			a = b;
			b = c;
		}
		al = a.length();
		bl = b.length();
		cl = al + 1;
		for (i = 0;i < cl;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		c = tangible.StringFunctions.changeCharacter(c, cl, '\0');
		for (i = 1;i <= bl;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, cl - i, c.charAt(cl - i) + a.charAt(al - i) + b.charAt(bl - i) - '0'-'0');
			if (c.charAt(cl - i) > '9')
			{
				c = tangible.StringFunctions.changeCharacter(c, cl - i, c.charAt(cl - i) - 10);
				c.charAt(cl - i - 1)++;
			}
		}
		for (i = bl + 1;i <= al;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, cl - i, c.charAt(cl - i) + a.charAt(al - i) - '0');
			if (c.charAt(cl - i) > '9')
			{
				c = tangible.StringFunctions.changeCharacter(c, cl - i, c.charAt(cl - i) - 10);
				c.charAt(cl - i - 1)++;
			}
		}
		for (;c.charAt(0) == '0' && cl > 1;)
		{
			for (int j = 0;j < cl;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
			}
			cl--;
		}
		System.out.print(c);
	}
}

