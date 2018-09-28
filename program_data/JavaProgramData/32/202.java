package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int lena;
		int lenb;
		int t;
		int h;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			lena = a.length();
			lenb = b.length();
			for (j = 0;j < lena;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(lena - j - 1));
			}
			for (j = 0;j < lenb;j++)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, b.charAt(lenb - j - 1));
			}
			for (j = 0;j < lenb;j++)
			{
				if (c.charAt(j) < d.charAt(j))
				{
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j) + 10 - d.charAt(j) + '0');
					t = j;
					for (;c.charAt(++t) < '0';)
					{
						c = tangible.StringFunctions.changeCharacter(c, t, '9');
					}
					c.charAt(t)--;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j) - d.charAt(j) + '0');
				}

			}
			for (h = lena - 1;h > 0;h--)
			{
				if (c.charAt(h) != '0')
				{
					break;
				}
			}
			for (;h >= 0;h--)
			{
				System.out.printf("%d",c.charAt(h) - '0');
			}
			System.out.print("\n");
		}
	}
}

