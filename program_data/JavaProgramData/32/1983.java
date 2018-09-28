package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int la;
		int lb;
		int lc;
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			la = a.length();
			lb = b.length();
			for (j = 1;j <= lb;j++)
			{
				if (a.charAt(la - j) >= b.charAt(lb - j))
				{
					c = tangible.StringFunctions.changeCharacter(c, la - j, a.charAt(la - j) - b.charAt(lb - j) + 48);
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, la - j, a.charAt(la - j) + 10 - b.charAt(lb - j) + 48);
					a.charAt(la - j - 1)--;
				}
			}
			for (j = 0;j < (la - lb);j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
			}
			lc = c.length();
			for (k = 0;k <= la - 1;k++)
			{
				if (c.charAt(k) != '0')
				{
					break;
				}
			}
			for (j = k;j <= la - 1;j++)
			{
			System.out.printf("%c",c.charAt(j));
			}
			System.out.print("\n");
		}
	}
}

