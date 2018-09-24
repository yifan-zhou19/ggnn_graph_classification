package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String c = new String(new char[500]);
		String d = new String(new char[1]);
		String e = new String(new char[1]);
		String f = new String(new char[1]);
		int i;
		int j;
		int m = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != 32;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
			b = tangible.StringFunctions.changeCharacter(b, i + 1, '\0');
		}
		for (i = a.length() - 1;a.charAt(i) != 32;i--)
		{
			c = tangible.StringFunctions.changeCharacter(c, i - b.length() - 1, a.charAt(i));
		}
		c = tangible.StringFunctions.changeCharacter(c, a.length() - b.length() - 1, '\0');
		if (b.length() != c.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < b.length();i++)
			{
				for (j = 0;j < b.length() - 1;j++)
				{
					if (b.charAt(j) < b.charAt(j + 1))
					{
						d = tangible.StringFunctions.changeCharacter(d, 0, b.charAt(j));
						 b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
						b = tangible.StringFunctions.changeCharacter(b, j + 1, d.charAt(0));
					}
				}
			}
			for (i = 0;i < c.length();i++)
			{
				for (j = 0;j < c.length() - 1;j++)
				{
					if (c.charAt(j) < c.charAt(j + 1))
					{
						d = tangible.StringFunctions.changeCharacter(d, 0, c.charAt(j));
						 c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
						c = tangible.StringFunctions.changeCharacter(c, j + 1, d.charAt(0));
					}
				}
			}
			for (i = 0;i < c.length();i++)
			{
				if (b.charAt(i) == c.charAt(i))
				{
					m++;
				}
			}
			if (m == c.length())
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}
}

