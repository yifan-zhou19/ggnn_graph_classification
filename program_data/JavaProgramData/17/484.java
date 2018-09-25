package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[max]); //??????????
		String s = new String(new char[max]);
		int l; //?????????
		int i; //??????
		int j;
		while (scanf("%s",c) != EOF)
		{
			l = c.length(); //???????
			for (i = 0;i < l;i++) //???
			{
				if (c.charAt(i) == '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '$');
				}
				else
				{
					if (c.charAt(i) == ')')
					{
						s = tangible.StringFunctions.changeCharacter(s, i, '?');
					}
					else
					{
						s = tangible.StringFunctions.changeCharacter(s, i, ' ');
					}
				}
			}
			s = tangible.StringFunctions.changeCharacter(s, l, '\0');
			for (i = 0;i < l;i++) //???????
			{
				if (s.charAt(i) == '?')
				{
					for (j = i - 1;j >= 0;j--)
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
			System.out.printf("%s\n%s\n",c,s);
		}
		return 0;
	}
}

