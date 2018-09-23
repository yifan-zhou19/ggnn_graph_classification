package <missing>;

public class GlobalMembers
{
	public static void insert(String str, String substr)
	{
		int max;
		int len;
		int i;
		int j;
		int position;
		String str1 = new String(new char[15]);
		len = str.length();
		max = str[0];
		for (i = 0;i < len;i++)
		{
			if (str[i].compareTo(max) > 0)
			{
				max = str[i];
				position = i;
			}
		}
		for (j = 0;j <= position;j++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, j, str[j]);
		}
		for (j = position + 1;j < len;j++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, j + 3, str[j]);
		}
		for (j = 1;j < 4;j++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, j + position, substr[j - 1]);
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, len + 3, '\0');
		System.out.printf("%s\n",str1);
	}


	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);

		while (scanf("%s",str) != EOF)

		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				substr = tempVar.charAt(0);
			}
			insert(str, substr);

		}

	}
}

