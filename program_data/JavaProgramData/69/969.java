package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[300]);
	public static String b = new String(new char[300]);
	public static String c = new String(new char[301]);
	public static int la;
	public static int lb;

	public static void F()
	{
		int i;
		la = a.length();
		lb = b.length();
		for (i = 0;i < 300;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		c = tangible.StringFunctions.changeCharacter(c, 300, '\0');
		for (i = 299;i > 0;i--)
		{
			if (la - 300 + i >= 0)
			{
				c.charAt(i) += a.charAt(la - 300 + i) - '0';
			}
			if (lb - 300 + i >= 0)
			{
				c.charAt(i) += b.charAt(lb - 300 + i) - '0';
			}
			if (c.charAt(i) > '9')
			{
				c.charAt(i - 1)++;
				c.charAt(i) -= 10;
			}
		}
		for (i = 0;i < 300;i++)
		{
			if (c.charAt(i) != '0')
			{
				break;
			}
		}
		if (i == 300)
		{
			System.out.print('0');
			System.out.print("\n");
			return;
		}
		System.out.print(c.Substring(i));
		System.out.print("\n");
		return;
	}

	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		F();
		return 0;
	}
}

