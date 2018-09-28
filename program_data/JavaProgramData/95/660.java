package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (str1.charAt(i) <= 'Z' && str1.charAt(i) >= 'A')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
			else
			{
				continue;
			}
			if (str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i));
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < 80;i++)
		{
			if (str2.charAt(i) <= 'Z' && str2.charAt(i) >= 'A')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
			else
			{
				continue;
			}
			if (str2.charAt(i) <= 'z' && str2.charAt(i) >= 'a')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i));
			}
			else
			{
				continue;
			}
		}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(str1,str2) < 0)
		{
			System.out.print("<");
		}
	}
}

