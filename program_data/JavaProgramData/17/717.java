package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int j;
		int k;
		int len;
		while (scanf("%s",a) != EOF)
		{
			System.out.println(a);
			len = a.length();
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
				else if (a.charAt(i) == '(')
				{
					for (j = i + 1;j < len;j++)
					{
						if (a.charAt(j) == '(')
						{
							break;
						}
						else if (a.charAt(j) == ')')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
							break;
						}
					}
				}
				else if (a.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
							break;
						}
						else if (a.charAt(j) == ')')
						{
							break;
						}
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
				else if (a.charAt(i) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?');
				}
			}
			System.out.println(a);
		}
		return 0;
	}

}

