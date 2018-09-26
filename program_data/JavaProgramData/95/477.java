package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char c;
		int i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;(c = str1.charAt(i)) != '\0';i++)
		{
			if (c >= 'a' && c <= 'z')
			{
				c = c - 32;
			}
				str1 = tangible.StringFunctions.changeCharacter(str1, i, c);
		}
		for (i = 0;(c = str2.charAt(i)) != '\0';i++)
		{
			if (c >= 'a' && c <= 'z')
			{
				c = c - 32;
			}
				str2 = tangible.StringFunctions.changeCharacter(str2, i, c);
		}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">\n");
		}
		if (strcmp(str1,str2) < 0)
		{
		System.out.print("<\n");
		}
	if (strcmp(str1,str2) == 0)
	{
	System.out.print("=\n");
	}
	return 0;
	}
}

