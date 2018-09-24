package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		String s1 = new String(new char[200]);
		int i;
		int j;
		int len;
		while (gets(s) != null)
		{
			len = s.length();
			s1 = s;
			for (i = 0; i < len; i++)
			{
				if (s.charAt(i) == ')')
				{
					for (j = i - 1; j >= 0; j--)
					{
						if (s.charAt(j) == '(')
						{
							break;
						}
					}
					if (j >= 0)
					{
						s = tangible.StringFunctions.changeCharacter(s, i, ' ');
						s = tangible.StringFunctions.changeCharacter(s, j, ' ');
					}
					else
					{
						s = tangible.StringFunctions.changeCharacter(s, i, '?');
					}

				}
				else if (s.charAt(i) != '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				}
			}
			for (i = 0; i < len; i++)
			{
				if (s.charAt(i) == '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '$');
				}
			}
			System.out.println(s1);
			System.out.println(s);
		}
		return 0;
	}

}

