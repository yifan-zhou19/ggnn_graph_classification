package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[MAX]);
		String s0 = new String(new char[MAX]);
		String t = new String(new char[MAX]);
		int len;
		int i;
		int j;
		while (scanf("%s",s) != EOF)
		{
			len = s.length();
			s0 = s;
			for (i = 0;i < len;i++)
			{
				if (s0.charAt(i) == ')' && i > 0)
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (s0.charAt(j) == '(')
						{
							s0 = tangible.StringFunctions.changeCharacter(s0, i, ' ');
							s0 = tangible.StringFunctions.changeCharacter(s0, j, ' ');
							break;
						}
					}
				}
			}

			for (i = 0;i < len;i++)
			{
				if (s0.charAt(i) == '(')
				{
					t = tangible.StringFunctions.changeCharacter(t, i, '$');
				}
				else if (s0.charAt(i) == ')')
				{
					t = tangible.StringFunctions.changeCharacter(t, i, '?');
				}
				else
				{
					t = tangible.StringFunctions.changeCharacter(t, i, ' ');
				}
			}

			System.out.printf("%s\n",s);
			for (i = 0;i < len;i++)
			{
				System.out.printf("%c",t.charAt(i));
			}
			System.out.print('\n');
		}
	}
}

