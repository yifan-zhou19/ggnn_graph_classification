package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[300]);
	public static void Main()
	{
		int i;
		int j;
		while (scanf("%s",str) != EOF)
		{
			int len = str.length();
			System.out.printf("%s\n",str);
			for (i = 0;i < len;i++)
			{
				if (str.charAt(i) != '(' && str.charAt(i) != ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			for (i = 0;i < len;i++)
			{
				int b = 0;
				if (str.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (str.charAt(j) == '(')
						{
							str = tangible.StringFunctions.changeCharacter(str, j, ' ');
							str = tangible.StringFunctions.changeCharacter(str, i, ' ');
							b = 1;
							break;
						}
					}
					if (b == 0)
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '?');
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (str.charAt(i) == '(')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '$');
				}
				if (str.charAt(i) == ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '?');
				}
			}
			System.out.printf("%s\n",str);
		}
	}


}

