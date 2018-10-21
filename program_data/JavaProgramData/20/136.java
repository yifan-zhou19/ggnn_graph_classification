package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		String substr = new String(new char[3]);
		final String str2 = "";
		int i;
		int l = 0;
		int max = 0;
		while ((scanf("%s %s",str,substr)) != EOF)
		{
			l = str.length();
			for (i = 0;i < l;i++)
			{
				if (str.charAt(i) > str.charAt(max))
				{
					max = i;
				}

			}

			for (i = max + 1;i < l;i++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i - 1 - max, str.charAt(i));
			}
			str = tangible.StringFunctions.changeCharacter(str, max + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, max + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, max + 3, substr.charAt(2));
			str = tangible.StringFunctions.changeCharacter(str, max + 4, '\0');
			str += str2;
			System.out.printf("%s\n",str);
			i = 0;
			while (str2.charAt(i) != '\0')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
				i++;
			}

		}


	}

}

