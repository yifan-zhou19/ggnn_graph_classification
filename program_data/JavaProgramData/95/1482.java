package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int i;
		int a = 0;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i <= 79;i++)
		{
			if (str1.charAt(i) == '\0' && str2.charAt(i) == '\0')
			{
				break;
			}
			if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 'a'-'A');
			}
			if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 'a'-'A');
			}
			if (str1.charAt(i) > str2.charAt(i))
			{
				a = 1;
				break;
			}
			if (str1.charAt(i) < str2.charAt(i))
			{
				a = 2;
				break;
			}
		}
		switch (a)
		{
		case 0:
			System.out.print("=\n");
			break;
		case 1:
			System.out.print(">\n");
			break;
		case 2:
			System.out.print("<\n");
			break;
		}
		return 0;
	}

}

