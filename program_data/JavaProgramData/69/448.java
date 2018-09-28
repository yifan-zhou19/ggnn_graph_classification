package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int p;
		int q;
		int x;
		int y;
		int i;
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[250]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (p = 0;;p++)
		{
		if (a.charAt(p) == '\0')
		{
			break;
		}
		m++;
		}
		for (q = 0;;q++)
		{
		if (b.charAt(q) == '\0')
		{
			break;
		}
		n++;
		}

		if (m < n)
		{
		c = tangible.StringFunctions.changeCharacter(c, n, a.charAt(m - 1) + b.charAt(n - 1) - '0');
		for (x = n - 2;x >= n - m;x--)
		{
		if (c.charAt(x + 2) > '9')
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, a.charAt(x + m - n) + b.charAt(x) - '0' + 1);
		}
		else
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, a.charAt(x + m - n) + b.charAt(x) - '0');
		}

		}
		for (x = n - m - 1;x >= 0;x--)
		{
		if (c.charAt(x + 2) > '9')
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, b.charAt(x) + 1);
		}
		else
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, b.charAt(x));
		}
		}
		if (c.charAt(1) > '9')
		{
		c = tangible.StringFunctions.changeCharacter(c, 0, '1');
		}
		else
		{
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');
		}
		for (x = 1;x <= n;x++)
		{
		 if (c.charAt(x) > '9')
		 {
		c = tangible.StringFunctions.changeCharacter(c, x, c.charAt(x) - 10);
		 }
		}
		for (i = 0;i <= n - 1;i++)
		{
		if (c.charAt(i) != '0')
		{
			break;
		}
		}
		for (x = i;x <= n;x++)
		{
		System.out.printf("%c",c.charAt(x));
		}

		}

	if (m > n)
	{
		c = tangible.StringFunctions.changeCharacter(c, m, a.charAt(m - 1) + b.charAt(n - 1) - '0');
		for (x = m - 2;x >= m - n;x--)
		{
		if (c.charAt(x + 2) > '9')
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, a.charAt(x) + b.charAt(x + n - m) - '0' + 1);
		}
		else
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, a.charAt(x) + b.charAt(x + n - m) - '0');
		}

		}
		for (x = m - n - 1;x >= 0;x--)
		{
		if (c.charAt(x + 2) > '9')
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, a.charAt(x) + 1);
		}
		else
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, a.charAt(x));
		}
		}
		if (c.charAt(1) > '9')
		{
		c = tangible.StringFunctions.changeCharacter(c, 0, '1');
		}
		else
		{
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');
		}
		for (x = 1;x <= m;x++)
		{
		 if (c.charAt(x) > '9')
		 {
		c = tangible.StringFunctions.changeCharacter(c, x, c.charAt(x) - 10);
		 }
		}
		for (i = 0;i <= m - 1;i++)
		{
		if (c.charAt(i) != '0')
		{
			break;
		}
		}
		for (x = i;x <= m;x++)
		{
		System.out.printf("%c",c.charAt(x));
		}

	}

		if (m == n)
		{
			 c = tangible.StringFunctions.changeCharacter(c, m, a.charAt(m - 1) + b.charAt(m - 1) - '0');
		for (x = m - 2;x >= 0;x--)
		{
		if (c.charAt(x + 2) > '9')
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, a.charAt(x) + b.charAt(x) - '0' + 1);
		}
		else
		{
		c = tangible.StringFunctions.changeCharacter(c, x + 1, a.charAt(x) + b.charAt(x) - '0');
		}
		}
		if (c.charAt(1) > '9')
		{
		c = tangible.StringFunctions.changeCharacter(c, 0, '1');
		}
		else
		{
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');
		}
		for (x = 1;x <= m;x++)
		{
		 if (c.charAt(x) > '9')
		 {
		c = tangible.StringFunctions.changeCharacter(c, x, c.charAt(x) - 10);
		 }
		}
	   for (i = 0;i <= m - 1;i++)
	   {

		if (c.charAt(i) != '0')
		{
			break;
		}
	   }




		for (x = i;x <= m;x++)
		{
		System.out.printf("%c",c.charAt(x));
		}
		}
	}


}

