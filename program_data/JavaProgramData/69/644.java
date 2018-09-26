package <missing>;

public class GlobalMembers
{
	public static void chengfa(String a, String b)
	{
		final String c = "";
		char g;
		int na;
		int nb;
		int nc;
		int i;
		int j;
		int t;
		int d;
		na = a.length();
		nb = b.length();
		if (na == nb)
		{
			for (i = 0,d = 0;i <= na - 1;i++)
			{
				 t = a[na - 1 - i] - 48 + b[nb - 1 - i] - 48;
				 t = t + d;
				 c = tangible.StringFunctions.changeCharacter(c, i, t % 10 + 48);
				 d = (t - t % 10) / 10;
			}
			if (d != 0)
			{
				 c = tangible.StringFunctions.changeCharacter(c, i, d + 48);
			}
		}
		else if (na > nb)
		{
			for (i = 0,d = 0;i <= nb - 1;i++)
			{
				 t = a[na - 1 - i] - 48 + b[nb - 1 - i] - 48;
				 t = t + d;
				 c = tangible.StringFunctions.changeCharacter(c, i, t % 10 + 48);
				 d = (t - t % 10) / 10;
			}
			if (d != 0)
			{
				 for (i = nb;i <= na - 1;i++)
				 {
					  t = a[na - 1 - i] - 48 + d;
					  c = tangible.StringFunctions.changeCharacter(c, i, t % 10 + 48);
					  d = (t - t % 10) / 10;
				 }
				 if (d != 0)
				 {
					 c = tangible.StringFunctions.changeCharacter(c, i, d + 48);
				 }
			}
			else
			{
				for (i = nb;i <= na - 1;i++)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a[na - 1 - i]);
				}
			}
		}
		else
		{
			for (i = 0,d = 0;i <= na - 1;i++)
			{
				 t = a[na - 1 - i] - 48 + b[nb - 1 - i] - 48;
				 t = t + d;
				 c = tangible.StringFunctions.changeCharacter(c, i, t % 10 + 48);
				 d = (t - t % 10) / 10;
			}
			if (d != 0)
			{
				 for (i = na;i <= nb - 1;i++)
				 {
					  t = b[nb - 1 - i] - 48 + d;
					  c = tangible.StringFunctions.changeCharacter(c, i, t % 10 + 48);
					  d = (t - t % 10) / 10;
				 }
				 if (d != 0)
				 {
					 c = tangible.StringFunctions.changeCharacter(c, i, d + 48);
				 }
			}
			else
			{
				for (i = na;i <= nb - 1;i++)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, b[nb - 1 - i]);
				}
			}
		}
		nc = c.length();
		while (c.charAt(nc - 1) == 48)
		{
			c = tangible.StringFunctions.changeCharacter(c, nc - 1, '\0');
			nc = c.length();
		}
		for (i = 0;i <= (nc - 1) / 2;i++)
		{
			g = c.charAt(i);
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(nc - 1 - i));
			c = tangible.StringFunctions.changeCharacter(c, nc - 1 - i, g);
		}
		if (nc == 0)
		{
			System.out.print("0");
		}
		else
		{
			System.out.printf("%s",c);
		}
		return;
	}

	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
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
		chengfa(a, b);
		return 0;
	}
}

