package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		int rr;
		int lr;
		int ll;
		int rl;
		for (;(scanf("%s",c)) != EOF;)
		{
			System.out.printf("%s\n",c);
			String p = new String(new char[101]);
			int i;
			int l;
			rr = 0;
			rl = 0;
			ll = 0;
			lr = 0;
			for (l = 0;c.charAt(l) != 0;l++)
			{
				p = tangible.StringFunctions.changeCharacter(p, l, ' ');
			}
			p = tangible.StringFunctions.changeCharacter(p, l, '\0');
			for (i = 0;c.charAt(i) != 0;i++)
			{
				if (c.charAt(i) == '(')
				{
					ll = ll + 1;
				}
				if (c.charAt(i) == ')')
				{
					lr = lr + 1;
					if (ll < lr)
					{
						p = tangible.StringFunctions.changeCharacter(p, i, '?');
						lr = lr - 1;
					}
				}
			}
			for (i = l - 1;i >= 0;i = i - 1)
			{
				if (c.charAt(i) == ')')
				{
					rr = rr + 1;
				}
				if (c.charAt(i) == '(')
				{
					rl = rl + 1;
					if (rr < rl)
					{
						p = tangible.StringFunctions.changeCharacter(p, i, '$');
						rl = rl - 1;
					}
				}
			}
		System.out.printf("%s\n",p);
		}
		return 0;
	}

}

