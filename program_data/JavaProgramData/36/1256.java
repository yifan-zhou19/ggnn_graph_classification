package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int t;
		int s = 0;
		String c = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = c.length();
		n = b.length();
		for (i = 0;i < m;i++)
		{
			for (j = m - 1;j > i;j--)
			{
				if (c.charAt(j) > c.charAt(j - 1))
				{
					t = c.charAt(j);
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j - 1));
					c = tangible.StringFunctions.changeCharacter(c, j - 1, t);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (b.charAt(j) > b.charAt(j - 1))
				{
					t = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j - 1));
					b = tangible.StringFunctions.changeCharacter(b, j - 1, t);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (c.charAt(i) == b.charAt(i))
			{
				s = s + 1;
			}
			else
			{
				break;
			}
		}
		if (s == m)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}

}

