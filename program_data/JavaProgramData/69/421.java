package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int lena;
		int lenb;
		int add = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lena = a.length() - 1;
		lenb = b.length() - 1;
		int cl = 0;
		for (;lena >= 0 && lenb >= 0;lena--, lenb--)
		{
			add += a.charAt(lena) + b.charAt(lenb) - 2 * '0';
			c = tangible.StringFunctions.changeCharacter(c, cl++, add % 10);
			add /= 10;
		}
		while (lena >= 0)
		{
			add += a.charAt(lena--) - '0';
			c = tangible.StringFunctions.changeCharacter(c, cl++, add % 10);
			add /= 10;
		}
		while (lenb >= 0)
		{
			add += b.charAt(lenb--) - '0';
			c = tangible.StringFunctions.changeCharacter(c, cl++, add % 10);
			add /= 10;
		}
		if (add != 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, cl++, add);
		}
		cl--;
		while (cl >= 0 && c.charAt(cl) == 0)
		{
			cl--;
		}
		if (cl == -1)
		{
			System.out.print("0");
		}
		for (;cl >= 0;cl--)
		{
			System.out.printf("%c",c.charAt(cl) + '0');
		}
		return 0;
	}
}

