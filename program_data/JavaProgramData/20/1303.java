package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b;
		int num;
		int i;
		int j;
		int l;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String str1 = new String(new char[15]);
		char c;
		for (;;)
		{

		for (i = 0;i < 11;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		}
		for (i = 0;i < 4;i++)
		{
			substr = tangible.StringFunctions.changeCharacter(substr, i, '\0');
		}
		for (i = 0;i < 15;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, '\0');
		}
		for (i = 0;i < 10;i++)
		{
			if ((c = System.in.read()) == ' ')
			{
				break;
			}
		else
		{
			str = tangible.StringFunctions.changeCharacter(str, i, c);
		}
		}
		if (feof(stdin))
		{
			break;
		}
		substr = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < l;i++)
		{
			b = 0;
			for (j = i;j < l;j++)
			{
				if (str.charAt(i) < str.charAt(j))
				{
					b = 1;
					break;
				}
			}
			if (b == 0)
			{
				num = i;
				break;
			}
		}
		for (i = 0;i <= num;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, str.charAt(i));
		}
		for (i = num + 1;i <= num + 3;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, substr.charAt(i - 1 - num));
		}
		for (i = num + 4;i < l + 3;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, str.charAt(i - 3));
		}
		System.out.println(str1);
		}
	}

}

