package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		m = c.length();
		n = d.length();
		for (i = 0;i < m;i++)
		{
			if ((c.charAt(i) >= 'A') && (c.charAt(i) <= 'Z'))
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 32);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((d.charAt(i) >= 'A') && (d.charAt(i) <= 'Z'))
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 32);
			}
		}
		if (strcmp(c,d) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(c,d) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
		return 0;
	}

}

