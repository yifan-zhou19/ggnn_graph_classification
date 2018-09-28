package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[80]);
		String d = new String(new char[80]);
		int i;
		int n;
		c = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		n = 0;
		//?????//
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) >= 65 && c.charAt(i) <= 90)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 'a'-'A');
			}
		}
		for (i = 0;i < d.length();i++)
		{
			if (d.charAt(i) >= 65 && d.charAt(i) <= 90)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 'a'-'A');
			}
		}
		//??//
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) > d.charAt(i))
			{
				n = 1;
				break;
			}
			if (c.charAt(i) < d.charAt(i))
			{
				n = -1;
				break;
			}
		}
		if (n == 0)
		{
			if (c.length() < d.length())
			{
				n = -1;
			}
		}
		if (n == 1)
		{
			System.out.print(">");
		}
		else
		{
			if (n == 0)
			{
				System.out.print("=");
			}
			else
			{
				System.out.print("<");
			}
		}
		return 0;
	}

}

