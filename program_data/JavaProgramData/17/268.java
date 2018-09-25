package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int p;
		int m;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String c = new String(new char[200]);
		i = 0;
		while (gets(a))
		{
			System.out.println(a);
			k = 0;
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
				}
				else if (a.charAt(i) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, a.length(), '\0');
			c = tangible.StringFunctions.changeCharacter(c, a.length(), '\0');
			for (i = 0;i < a.length();i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(i));
			}
			for (p = 0;p < a.length();p++)
			{
				k = 0;
			for (i = 0;i < a.length();i++)
			{
				if (b.charAt(i) == ' ')
				{
					continue;
				}
				else if (b.charAt(i) == '$')
				{
					k++;
					for (j = i + 1;j < a.length();j++)
					{
						if (b.charAt(j) == ' ')
						{
							continue;
						}
						else if (b.charAt(j) == '?')
						{
							b = tangible.StringFunctions.changeCharacter(b, i, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							c = tangible.StringFunctions.changeCharacter(c, i, ' ');
							c = tangible.StringFunctions.changeCharacter(c, j, ' ');
							break;
						}
						else if (b.charAt(j) == '$')
						{
							break;
						}
					}
				}
				else if (b.charAt(i) == '?' && k == 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '?');
				}
			}
			}
			System.out.println(c);
			continue;
		}
		return 0;
	}

}

