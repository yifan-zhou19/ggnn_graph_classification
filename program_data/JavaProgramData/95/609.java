package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0;i < str1.length();i++)
		{
			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			}
		}
	for (j = 0;j < str2.length();j++)
	{
			if (str2.charAt(j) >= 'a' && str2.charAt(j) <= 'z')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j) - 32);
			}
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
	}
}

