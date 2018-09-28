package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		char c;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;(c = str1.charAt(i)) != '\0';i++)
		{
			if (c >= 'A' && c <= 'Z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, c + 32);
			}
		}
		for (i = 0;(c = str2.charAt(i)) != '\0';i++)
		{
			if (c >= 'A' && c <= 'Z')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, c + 32);
			}
		}

		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">\n");
		}
		else if (strcmp(str1,str2) < 0)
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print("=\n");
		}



		return 0;
	}


}

