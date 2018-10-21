package <missing>;

public class GlobalMembers
{
	/*
	 * ????match.cpp
	 * ???? : 2012-12-4
	 * ??: winneshaw
	 * ??????????????????
	 * ??????????????????????????????????
	 * ???????????"$"??,?????????"?"??
	 *
	 */


	public static String str = new String(new char[101]);
	public static int lenth = 0;
	public static int Main()
	{
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			lenth = str.length();
			System.out.print(str);
			System.out.print("\n");
			int i;
			int j;
			for (j = 0; j < lenth; j++)
			{
				if (str.charAt(j) == '(')
				{
					str = tangible.StringFunctions.changeCharacter(str, j, '$');
				}
				else if (str.charAt(j) == ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, j, '?');
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, j, ' ');
				}
			}
			for (i = lenth - 2; i >= 0; i--)
			{
				if (str.charAt(i) == '$')
				{
					for (j = i + 1; j < lenth; j++)
					{
						if (str.charAt(j) == '?')
						{
							str = tangible.StringFunctions.changeCharacter(str, i, ' ');
							str = tangible.StringFunctions.changeCharacter(str, j, ' ');
							break;
						}
					}
				}
			} /*
			if (str[lenth - 1] == '?')
				for (i = 0; i < lenth; i++)
					if (str[i] == '$') {
						str[lenth - 1] = ' ';
						str[i] = ' ';
						break;
					}*/
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}

}

