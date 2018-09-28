package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		int i;
		int j;
		int m;
		int n;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < str1.length();i++)
		{
			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			}
		}
		for (i = 0;i < str2.length();i++)
		{
			if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
			}
		}
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
	}

}

