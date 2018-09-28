package <missing>;

public class GlobalMembers
{
	//???????

	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char t;
		int n;
		int i;

		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();

		for (i = 0; (t = str1.charAt(i)) != '\0'; i++)
		{
			if (str1.charAt(i) <= 'Z' && str1.charAt(i) >= 'A')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		}
		for (i = 0; (t = str2.charAt(i)) != '\0'; i++)
		{
			if (str2.charAt(i) <= 'Z' && str2.charAt(i) >= 'A')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}

		if (strcmp(str1, str2) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(str1, str2) == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print("<");
		}

		return 0;
	}
}

