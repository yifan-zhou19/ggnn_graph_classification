package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		int i;
		int j;
		int max;
		int c;

		while (scanf("%s %s",str,substr) != EOF)
		{
		for (i = 1,max = str.charAt(0),c = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) > max)
			{
				max = str.charAt(i);
				c = i;
			}
		}
		for (j = i + 3;j > c + 3;j--)
		{
			str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j - 3));
		}

		str = tangible.StringFunctions.changeCharacter(str, c + 1, substr.charAt(0));
		str = tangible.StringFunctions.changeCharacter(str, c + 2, substr.charAt(1));
		str = tangible.StringFunctions.changeCharacter(str, c + 3, substr.charAt(2));
		System.out.printf("%s\n",str);
		}
	}
}

