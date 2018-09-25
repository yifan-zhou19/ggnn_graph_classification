package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		String s = new String(new char[102]);
		while (scanf("%s",s) != EOF)
		{
			l = s.length();
			System.out.printf("%s\n",s);
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '$');
				}
				else if (s.charAt(i) == ')')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '?');
					for (j = i - 1;j > -1;j--)
					{
						if (s.charAt(j) == '$')
						{
						s = tangible.StringFunctions.changeCharacter(s, j, ' ');
						s = tangible.StringFunctions.changeCharacter(s, i, ' ');
						break;
						}
					}
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				}
			}
				System.out.printf("%s\n",s);
		}
		return 0;
	}

}

