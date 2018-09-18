package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int m;
		String str = new String(new char[20]);
		String substr = new String(new char[5]);
		while (scanf("%s %s",str,substr) != EOF)
		{
			   n = str.length();
			   for (i = 0;i < n;i++)
			   {
				if (str.charAt(i) > str.charAt(j))
				{
				j = i;
				}
			   }
		for (i = n - 1;i >= j + 1;i--)
		{
			str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
		}
		str = tangible.StringFunctions.changeCharacter(str, i + 1, substr.charAt(0));
		str = tangible.StringFunctions.changeCharacter(str, i + 2, substr.charAt(1));
		str = tangible.StringFunctions.changeCharacter(str, i + 3, substr.charAt(2));
		str = tangible.StringFunctions.changeCharacter(str, n + 3, '\0');
		System.out.printf("%s\n",str);
		j = 0;
		}
	}
}

