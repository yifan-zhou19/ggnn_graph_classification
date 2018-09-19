package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[3]);
		int n;
		int i;
		int j;
		while (scanf("%s %s",str,substr) != EOF)
		{
			n = str.length();
			j = 0;
			str = tangible.StringFunctions.changeCharacter(str, n, 97);
			substr = tangible.StringFunctions.changeCharacter(substr, 3, 97);
			for (i = 1;i <= n - 1;i++)
			{
				if (str.charAt(i) > str.charAt(j))
				{
					j = i;
				}
			}
			for (i = n;i >= j + 1;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
			}
			for (i = j + 1;i <= j + 3;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(i - 1 - j));
			}
			str = tangible.StringFunctions.changeCharacter(str, n + 3, '\0');
			System.out.printf("%s\n",str);
		}
	}

}

