package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String c = new String(new char[101]);
		int i;
		int count;
		int j;
		int[] b = new int[101];
		while (gets(s))
		{
			count = 0;
			for (i = 0;i < s.length();i++)
			{
				b[i] = 0;
			}
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == '(')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '$');
					count++;
					b[i] = -1;
				}
				else if (s.charAt(i) == ')')
				{
					if (count != 0)
					{
						for (j = i;j >= 0;j--)
						{
							if (s.charAt(j) == '(' && b[j] == -1)
							{
								c = tangible.StringFunctions.changeCharacter(c, j, ' ');
							c = tangible.StringFunctions.changeCharacter(c, i, ' ');
							count--;
							b[j] = 0;
							break;
							}
						}
					}
					else
					{
						c = tangible.StringFunctions.changeCharacter(c, i, '?');
					}
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, ' ');
				}
			}
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			System.out.printf("%s\n%s\n",s,c);
		}
		return 0;
	}
}

