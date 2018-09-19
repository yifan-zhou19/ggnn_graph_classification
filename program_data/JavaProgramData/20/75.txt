package <missing>;

public class GlobalMembers
{
	public static int max(String str)
	{
		int len;
		int i;
		char c = str[0];
		len = str.length();

		for (i = 1;i < len;i++)
		{
			if (c < str[i])
			{
				c = str[i];
			}
		}

		for (i = 0;i < len;i++)
		{
			if (str[i].equals(c))
			{
				return i;
			}
		}
		return 0;
	}

	public static void Main()
	{
		int i;

		for (;;)
		{
			int n;
			int m;
			char x;
			String str = new String(new char[14]);
			String substr = new String(new char[4]);
			if ((x = System.in.read()) == EOF)
			{
				break;
			}

			str = new Scanner(System.in).nextLine();
			n = str.length();
			for (i = 0;i < 3;i++)
			{
				substr = tangible.StringFunctions.changeCharacter(substr, i, str.charAt(n + i - 3));
			}
			substr = tangible.StringFunctions.changeCharacter(substr, 3, '\0');
			str = tangible.StringFunctions.changeCharacter(str, n - 3, '\0');
			for (i = n - 4;i > 0;i = i - 1)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i - 1));
			}
			str = tangible.StringFunctions.changeCharacter(str, 0, x);

			m = max(str);

			for (i = n + 2;i > m + 3;i = i - 1)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i - 3));
			}
			str = tangible.StringFunctions.changeCharacter(str, n + 3, '\0');
			str = tangible.StringFunctions.changeCharacter(str, m + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, m + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, m + 3, substr.charAt(2));
			System.out.println(str);
		}
	}
}

