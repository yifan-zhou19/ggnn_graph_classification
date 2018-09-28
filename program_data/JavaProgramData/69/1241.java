package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)

	{
		String a = new String(new char[252]);
		String b = new String(new char[252]);
		String c = new String(new char[253]);
		c = tangible.StringFunctions.changeCharacter(c, 0, 48);
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
		int la;
		int lb;
		int t;
		int r;
		int s;
		la = a.length();
		lb = b.length();
		if (la > lb)
		{
			for (r = lb - 1;r >= 0;r--)
			{
				b = tangible.StringFunctions.changeCharacter(b, r + la - lb, b.charAt(r));
			}
			for (s = 0;s <= la - lb - 1;s++)
			{
				b = tangible.StringFunctions.changeCharacter(b, s, 48);
			}
			t = la;
		}
		if (la < lb)
		{
			for (r = la - 1;r >= 0;r--)
			{
				a = tangible.StringFunctions.changeCharacter(a, r + lb - la, a.charAt(r));
			}
			for (s = 0;s <= lb - la - 1;s++)
			{
				a = tangible.StringFunctions.changeCharacter(a, s, 48);
			}
			t = lb;
		}
		if (la == lb)
		{
			t = la;
		}
		int i;
		int j;
		int k = 0;
		for (i = 0;i <= t - 1;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i + 1, a.charAt(i) + b.charAt(i) - 48);
		}
		for (i = t;i >= 1;i--)
		{
			if (c.charAt(i) >= 58)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
				c = tangible.StringFunctions.changeCharacter(c, i - 1, c.charAt(i - 1) + 1);
			}
		}
		for (j = 0;j <= t;j++)
		{
			if (c.charAt(j) != 48)
			{
				break;
			}
			k++;
		}
		if (k == t + 1)
		{
			System.out.print("0");
		}
		else
		{
			for (j = k;j <= t;j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
		}
	}

}

