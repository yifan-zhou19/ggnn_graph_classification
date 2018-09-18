package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int j;
		int k;
		String c = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			System.in.read();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			s = c.length();
			System.out.printf("%s\n",c);
			for (j = 0;j < s;j++)
			{
				if (c.charAt(j) != '(' && c.charAt(j) != ')')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, ' ');
				}
				if (c.charAt(j) == ')')
				{
					for (k = j;k >= 0;k--)
					{
						if (c.charAt(k) == '(')
						{
							c = tangible.StringFunctions.changeCharacter(c, j, ' ');
							c = tangible.StringFunctions.changeCharacter(c, k, ' ');
							break;
						}
					}
				}
			}
			for (j = 0;j < s;j++)
			{
				if (c.charAt(j) == '(')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, '$');
				}
				if (c.charAt(j) == ')')
				{
					c = tangible.StringFunctions.changeCharacter(c, j, '?');
				}
			}
			System.out.printf("%s\n",c);
		}
		return 0;
	}
}

