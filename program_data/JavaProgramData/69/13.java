package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[252]);
		int la;
		int lb;
		int i;
		int m;
		int tt;

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
		la = a.length();
		lb = b.length();
		m = la < lb != 0?lb:la;

		for (i = m - 1;i >= 0;i--)
		{
			if (m == la)
			{
				if (i >= la - lb)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - la + lb));
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '0');
				}
			}
			else
			{
				if (i >= lb - la)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + la - lb));
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '0');
				}
			}
		}
	//printf("%s\n%s\n",a,b);
		for (i = 0; i <= m;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}

		for (i = m;i >= 1;i--)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i - 1) + b.charAt(i - 1) + c.charAt(i) - 96);
			if (c.charAt(i) > 57)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
				c.charAt(i - 1)++;
			}
		}
		tt = 0;
		for (i = 0;i <= m;i++)
		{
			if (c.charAt(i) != '0')
			{
				tt = 1;
			}
			if ((c.charAt(i) == '0') && (tt == 0))
			{
				continue;
			}
			else
			{
				System.out.printf("%c",c.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}

}

