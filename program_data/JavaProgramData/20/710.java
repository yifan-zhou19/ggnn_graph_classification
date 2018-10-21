package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char max;
		final String final = "";
		int i;
		int k;
		int j;
		while (scanf("%s%s",str,substr) != EOF)
		{
			k = 0;
			max = str.charAt(0);
			for (i = 0;i < str.length();i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					k = i;
				}
			}

			final = str.substring(0, k + 1);
			for (i = 0;i < 3;i++)
			{
				final = tangible.StringFunctions.changeCharacter(final, k + 1 + i, substr.charAt(i));
			}
			for (i = k + 1;i < str.length();i++)
			{
				final = tangible.StringFunctions.changeCharacter(final, i + 3, str.charAt(i));
			}
			System.out.println(final);

			for (j = 0;j < 11;j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, '\0');
			}
			for (j = 0;j < 4;j++)
			{
				substr = tangible.StringFunctions.changeCharacter(substr, j, '\0');
			}
			for (j = 0;j < 14;j++)
			{
					   final = tangible.StringFunctions.changeCharacter(final, j, '\0');
			}
		}

	}
}

