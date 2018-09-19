package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		int n;
		while (~scanf("%s",str) != 0)
		{
			n = str.length();
			System.out.printf("%s",str);
			System.out.print("\n");
			for (int i = 1;i < n;i++)
			{
				if (str.charAt(i) == ')')
				{
					for (int j = i - 1;j >= 0;j--)
					{
						if (str.charAt(j) == '(')
						{
							str = tangible.StringFunctions.changeCharacter(str, i, ' ');
							str = tangible.StringFunctions.changeCharacter(str, j, ' ');
							break;
						}
					}
				}
			}
			for (int i = 0;i < n;i++)
			{
				if (str.charAt(i) == '(')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '$');
				}
				else if (str.charAt(i) == ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '?');
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			System.out.printf("%s",str);
			System.out.print("\n");
		}
	}
}

