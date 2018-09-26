package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[250]);
		int i;
		int j = 0;
		int k;
		int numa = 0;
		int numb = 0;
		int ca;
		int cb;
		int cc;
		int cy;
		char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i);i++)
		{
			numa++;
		}
		for (i = 0;b.charAt(i);i++)
		{
			numb++;
		}
		if (numa >= numb)
		{
			for (i = numa - 1;i >= (numa - numb);i--)
			{
		b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - numa + numb));
			}
		for (i = 0;i < (numa - numb);i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		}
		if (numa < numb)
		{
			for (i = numb - 1;i >= (numb - numa);i--)
			{
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - numb + numa));
			}
		for (i = 0;i < (numb - numa);i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		numa = numb;
		}

		for (i = 0;i <= numa;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		for (i = numa - 1;i >= 0;i--)
		{
			ca = a.charAt(i) - '0';
		cb = b.charAt(i) - '0';
		cc = ca + cb;
		cy = c.charAt(i + 1) - '0';
		if (cc + cy < 10)
		{
			c = tangible.StringFunctions.changeCharacter(c, i + 1, m[cc + cy]);
		}
		if (cc + cy >= 10)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '1');
		c = tangible.StringFunctions.changeCharacter(c, i + 1, m[cc + cy - 10]);
		}
		}
		for (i = 0;i <= numa;i++)
		{
			if (c.charAt(i) == '0')
			{
		j++;
			}
		}
		if (j == numa + 1)
		{
			System.out.print("0\n");
		}
		else
		{
			for (i = 0;i <= numa;i++)
			{
				if (c.charAt(i) != '0')
				{
				k = i;
			break;
				}
			}
			for (i = k;i <= numa;i++)
			{
			System.out.printf("%c",c.charAt(i));
			}
		}
		return 0;
	}


}

