package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int i;
		int l;
		int j;
		while (gets(s) != 0)
		{
			System.out.println(s);
	System.out.print("\n");
			l = s.length();
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
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
				}
			}
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '$');
				}
				else if (s.charAt(i) == ')')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '?');
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				}
			}
			System.out.println(s);
			System.out.print("\n");
		}

		return 0;
	}

}

