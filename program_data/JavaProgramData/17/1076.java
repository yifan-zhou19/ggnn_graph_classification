package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int i;
		int j;
		int t;
		int k;
		String a = new String(new char[101]);
		String c = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (k = 0;k < t;k++)
		{
			a = new Scanner(System.in).nextLine();
			int l = a.length();
			c = tangible.StringFunctions.changeCharacter(c, l, '\0');
			for (j = 0;j < l;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
				if (a.charAt(j) == '(')
				{
					m++;
				}
				if (a.charAt(j) != '(' && a.charAt(j) != ')')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, ' ');
				}
			}
			System.out.println(a);
			for (i = 0;i < m + 1;i++)
			{
				char x = ')';
				int y = -1;
				for (j = 0;j < l;j++)
				{
					if (c.charAt(j) == '(' || c.charAt(j) == ')')
					{
						if (c.charAt(j) == '(')
						{
						}
						else
						{
							if (x == '(')
							{
								c = tangible.StringFunctions.changeCharacter(c, j, ' ');
								c = tangible.StringFunctions.changeCharacter(c, y, ' ');
							}
						}
						y = j;
						x = c.charAt(j);
					}
				}
			}
			for (i = 0;i < l;i++)
			{
				if (c.charAt(i) == '(')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '$');
				}
				if (c.charAt(i) == ')')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '?');
				}
			}
			System.out.println(c);
		}
		return 0;
	}

}

