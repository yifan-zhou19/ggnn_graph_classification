package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[N + 1]);
		String flag = new String(new char[N + 1]);
		int i;
		int j;
		int[] sstack = new int[N + 1];
		while (scanf("%s",str) != EOF)
		{
			System.out.printf("%s\n",str);
			j = 0;
			for (i = 0;i < str.length();i++)
			{
				if (str.charAt(i) == '(')
				{
					sstack[j++] = i;
				}
				else if (str.charAt(i) == ')')
				{
					if (j <= 0)
					{
						flag = tangible.StringFunctions.changeCharacter(flag, i, '?');
					}
					else
					{
						j--;
						flag = tangible.StringFunctions.changeCharacter(flag, sstack[j], ' ');
						flag = tangible.StringFunctions.changeCharacter(flag, i, ' ');
					}
				}
				else
				{
					flag = tangible.StringFunctions.changeCharacter(flag, i, ' ');
				}
			}
			for (i = 0;i < j;i++)
			{
				flag = tangible.StringFunctions.changeCharacter(flag, sstack[i], '$');
			}
			flag = tangible.StringFunctions.changeCharacter(flag, str.length(), '\0');
			System.out.printf("%s\n",flag);
		}

		return 0;
	}
}

