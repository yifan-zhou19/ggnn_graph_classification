package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String ss = new String(new char[101]);
		int len;
		int i;
		int j;
		int q;
		int h = 0;
		while (gets(s))
		{
			len = s.length();
			ss = s;
			for (i = 0;i < len;i++)
			{
				if (s.charAt(i) == '(')
				{
					h = i;
					for (j = i + 1;j < len;j++)
					{
						if (s.charAt(j) == '(')
						{
							i = j;
						}
						else if (s.charAt(j) == ')')
						{
							s = tangible.StringFunctions.changeCharacter(s, i, ' ');
							s = tangible.StringFunctions.changeCharacter(s, j, ' ');
							break;
						}
					}
					if (j == len)
					{
						break;
					}
					if (h == i)
					{
						continue;
					}
					else
					{
						i = h - 1;
					}
				}
			}
			for (q = 0;q < len;q++)
			{
				if (s.charAt(q) == ')')
				{
					s = tangible.StringFunctions.changeCharacter(s, q, '?');
				}
				else if (s.charAt(q) == '(')
				{
					s = tangible.StringFunctions.changeCharacter(s, q, '$');
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, q, ' ');
				}
			}
			System.out.printf("%s\n",ss);
			System.out.printf("%s\n",s);
		}
		return 0;
	}
}

