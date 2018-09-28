package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		final String c = "";
		final String d = "";
		char s;
		int i;
		int k;
		int m;
		int n;
		int j;
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
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
			m = a.length();
			n = b.length();
			if (n < m)
			{
				for (j = 0;j < m - n;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, 48);
				}
				for (j = m - n;j < m;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(j - m + n));
				}
			}
			else
			{
				c = b;
			}
			for (j = m - 1;j >= 0;j--)
			{
				if (j == 0)
				{
					d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(j) - c.charAt(j) + 48);
					break;
				}
				if (a.charAt(j) >= c.charAt(j))
				{
					d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(j) - c.charAt(j) + 48);
				}
				else
				{
					d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(j) - c.charAt(j) + 58);
					for (z = 1;z <= j;z++)
					{
						if (a.charAt(j - z) > 48)
						{
							a = tangible.StringFunctions.changeCharacter(a, j - z, a.charAt(j - z) - 1);
							break;
						}
						if (a.charAt(j - z) == 48)
						{
							a = tangible.StringFunctions.changeCharacter(a, j - z, 57);
						}
					}
				}
			}
			for (x = 0;x < m;x++)
			{
				if (d.charAt(x) != 48)
				{
					y = x;
					break;
				}
			}
				for (x = y;x < m;x++)
				{
					System.out.printf("%c",d.charAt(x));
				}
				System.out.print("\n");
		}
	}

}

