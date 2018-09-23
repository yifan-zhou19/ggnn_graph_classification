package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String c = new String(new char[10000]);
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",c);
			int j;
			int x;
			x = c.length();
			for (j = 0;j < x;j++)
			{
				if (c.charAt(j) != '(' && c.charAt(j) != ')')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, ' ');
				}
			}
			for (j = 0;j < x;j++)
			{
				if (c.charAt(j) == ')')
				{
					int m;
					for (m = j;m >= 0;m--)
					{
						if (c.charAt(m) == '(')
						{
							c = tangible.StringFunctions.changeCharacter(c, m, ' ');
							c = tangible.StringFunctions.changeCharacter(c, j, ' ');
							break;
						}
					}
				}
			}
			for (j = 0;j < x;j++)
			{
				if (c.charAt(j) == '(')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, '$');
				}
				else if (c.charAt(j) == ')')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, '?');
				}
			}
			System.out.printf("%s\n",c);
		}
		return 0;
	}



}

