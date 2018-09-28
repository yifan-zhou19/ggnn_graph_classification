package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[80]);
		String d = new String(new char[80]);
		int n;
		int i;
		int m;
		int t;
		int l;
		c = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		m = c.length();
		l = d.length();
		for (i = 0;i <= m - 1;i++)
		{
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 32);
			}
		}
		for (i = 0;i <= l - 1;i++)
		{
			if (d.charAt(i) >= 'A' && d.charAt(i) <= 'Z')
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 32);
			}
		}
		t = strcmp(c,d);
		if (t < 0)
		{
			System.out.print("<");
		}
		if (t == 0)
		{
			System.out.print("=");
		}
		if (t > 0)
		{
			System.out.print(">");
		}

		return 0;
	}
}

