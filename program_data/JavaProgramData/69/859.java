package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		int m;
		int i;
		int n;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = a.length() - b.length();
		if (m > 0)
		{
			for (i = b.length();i >= 0;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i + m, b.charAt(i));
			}
			for (i = m - 1;i >= 0;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 48);
			}
		}
		if (m < 0)
		{
			for (i = a.length();i >= 0;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i - m, a.charAt(i));
			}
			for (i = -m - 1;i >= 0;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 48);
			}
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, 48);
		}
		c = tangible.StringFunctions.changeCharacter(c, n, '\0');
		for (i = n - 1;i > 0;i--)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + a.charAt(i) + b.charAt(i) - 96);
			if (c.charAt(i) > 57)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
				c.charAt(i - 1)++;
			}
		}
		c = tangible.StringFunctions.changeCharacter(c, 0, c.charAt(0) + a.charAt(0) + b.charAt(0) - 96);
		if (c.charAt(0) > 57)
		{
			c = tangible.StringFunctions.changeCharacter(c, 0, c.charAt(0) - 10);
			for (i = n;i >= 0;i--)
			{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, c.charAt(i));
			}
			c = tangible.StringFunctions.changeCharacter(c, 0, 49);
		}
		while (c.charAt(0) == 48)
		{
			for (i = 0;i <= c.length();i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i + 1));
			}
		}
		if (c.charAt(0) == '\0')
		{
			System.out.print("0");
		}
		else
		{
		System.out.printf("%s",c);
		}
	}
}

