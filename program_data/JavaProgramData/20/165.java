package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[13]);
		String substr = new String(new char[3]);
		int s;
		int i;
		int j;
		int p;
		while (scanf("%s %s",str,substr) != EOF)
		{
		s = str.length();
		p = 0;
		for (i = 0;i <= s - 1;i++)
		{
			if (str.charAt(i) > str.charAt(p))
			{
				  p = i;
			}
		}
		for (i = s;i >= p + 1;i--)
		{
			str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
		}
		for (i = p + 1,j = 0;j <= 2;i++,j++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(j));
		}
		str = tangible.StringFunctions.changeCharacter(str, s + 3, '\0');
		System.out.printf("%s\n",str);
		}
	}
}

