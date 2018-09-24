package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String x = new String(new char[15]);
		int max;
		int num;
		int i;
		int j;
		while (true)
		{
			max = 0;

			if (scanf("%s%s",str,substr) == EOF)
			{
				break;
			}
			for (i = 0;i < str.length();i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					num = i;
				}
			}
			x = str.substring(0, num + 1);
			for (j = num + 1;j <= num + substr.length();j++)
			{
				x = tangible.StringFunctions.changeCharacter(x, j, substr.charAt(j - num - 1));
			}

			for (j = num + substr.length() + 1;j < substr.length() + str.length();j++)
			{
				x = tangible.StringFunctions.changeCharacter(x, j, str.charAt(j - substr.length()));
			}
			x = tangible.StringFunctions.changeCharacter(x, j, '\0');
			System.out.printf("%s\n",x);
		}
		return 0;
	}

}

