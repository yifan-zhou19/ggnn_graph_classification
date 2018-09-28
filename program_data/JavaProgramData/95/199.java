package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		char a;
		char b;
		String str1 = new String(new char[20]);
		String str2 = new String(new char[20]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 20;i++)
		{
			if (str1.charAt(i) <= 'Z' && str1.charAt(i) >= 'A')
			{
				a = str1.charAt(i);
				str1 = tangible.StringFunctions.changeCharacter(str1, i, a + 32);
			}
			if (str2.charAt(i) <= 'Z' && str2.charAt(i) >= 'A')
			{
				b = str2.charAt(i);
				str2 = tangible.StringFunctions.changeCharacter(str2, i, b + 32);
			}
		}
		if (strcmp(str1,str2) > 0)
		{
		System.out.print(">\n");
		}
		if (strcmp(str1,str2) == 0)
		{
		System.out.print("=\n");
		}
		if (strcmp(str1,str2) < 0)
		{
		System.out.print("<\n");
		}
	}

}

