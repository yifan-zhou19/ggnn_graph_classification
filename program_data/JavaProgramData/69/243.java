package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int la;
		int lb;
		int r;
		int p = 0;
		char e;
		final String a = "";
		final String b = "";
		final String c = "";
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
		for (i = 0;i < la - i;i++)
		{
			e = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(la - i - 1));
			a = tangible.StringFunctions.changeCharacter(a, la - i - 1, e);
		}
		for (i = 0;i < lb - i;i++)
		{
			e = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(lb - i - 1));
			b = tangible.StringFunctions.changeCharacter(b, lb - i - 1, e);
		}
		for (i = la;i < 252;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		for (i = lb;i < 252;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = 0;i < 252;i++)
		{
			r = a.charAt(i) - '0' + b.charAt(i) - '0' + p;
			if (r >= 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, r % 10 + '0');
				p = r / 10;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '0' + r);
				p = 0;
			}
	//		if(r==0){
	//			break;
	//		}
		}
		for (i = 251;i > 0;i--)
		{
			if (c.charAt(i) != '0')
			{
				break;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			}
		}
		r = c.length();
		for (i = 0;i < r - i;i++)
		{
			e = c.charAt(i);
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(r - i - 1));
			c = tangible.StringFunctions.changeCharacter(c, r - 1 - i, e);
		}
		System.out.printf("%s",c);
	//	scanf("%d",&n);
		return 0;
	}
}

