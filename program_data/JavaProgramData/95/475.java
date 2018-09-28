package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		c = new Scanner(System.in).nextLine();

		d = new Scanner(System.in).nextLine();
		int n;
		int i;
		int m1;
		int m2;
		m1 = 0;
		m2 = 0;
		n = c.length();
		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 32);
			}
			m1 = m1 + c.charAt(i);
			if (d.charAt(i) >= 'A' && d.charAt(i) <= 'Z')
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 32);
			}
			m2 = m2 + d.charAt(i);
		}
		if (m1 == m2)
		{
			System.out.print("=\n");
		}
		if (m1 > m2)
		{
			System.out.print(">\n");
		}
		if (m1 < m2)
		{
			System.out.print("<\n");
		}
		return 0;
	}



}

