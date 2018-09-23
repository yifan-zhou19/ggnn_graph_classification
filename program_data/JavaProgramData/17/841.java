package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int x;
		int i;
		int t;
		int j;
		int k;
		String s = new String(new char[102]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (e = 0;e < n;e++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",s);
			x = s.length();
			for (i = 0;i < x;i++)
			{
				if (s.charAt(i) != '(' && s.charAt(i) != ')')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				}
			}
			for (i = 0;i < x;i++)
			{
				if (s.charAt(i) == '(')
				{
					for (j = i + 1;j < x;j++)
					{
						if (s.charAt(j) == ')')
						{
							t = 0;
							for (k = i + 1;k < j;k++)
							{
								if (s.charAt(k) != ' ')
								{
								t = 1;
								break;
								}
							}
							if (t == 0)
							{
								s = tangible.StringFunctions.changeCharacter(s, i, ' ');
								s = tangible.StringFunctions.changeCharacter(s, j, ' ');
								i = -1;
								break;
							}
						}
					}
				}
			}
			for (i = 0;i < x;i++)
			{
				if (s.charAt(i) == '(')
				{
				s = tangible.StringFunctions.changeCharacter(s, i, '$');
				}
				if (s.charAt(i) == ')')
				{
				s = tangible.StringFunctions.changeCharacter(s, i, '?');
				}
			}
			System.out.printf("%s\n",s);
		}
	}
}

