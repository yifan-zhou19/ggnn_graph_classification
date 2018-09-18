package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int n;
		int i;
		int j;
		while (true)
		{
			if (scanf("%s",s) == EOF)
			{
				return 0;
			}
			System.out.println(s);
			n = s.length();
			for (i = 0;i < n;i++)
			{
				if (s.charAt(i) == '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '$');
				}
				else
				{
					if (s.charAt(i) == ')')
					{
						s = tangible.StringFunctions.changeCharacter(s, i, '?');
					}
					else
					{
						s = tangible.StringFunctions.changeCharacter(s, i, ' ');
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (s.charAt(i) == '?')
				{
					for (j = i;j >= 0;j--)
					{
						if (s.charAt(j) == '$')
						{
							s = tangible.StringFunctions.changeCharacter(s, j, ' ');
							s = tangible.StringFunctions.changeCharacter(s, i, ' ');
							break;
						}
					}
				}
			}
			while (s.charAt(n - 1) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, n - 1, '\0');
				n--;
			}
			while (s.charAt(0) == ' ')
			{
				for (i = 0;i < n;i++)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + 1));
				}
			}
			System.out.println(s);
		}
		return 0;
	}


}

