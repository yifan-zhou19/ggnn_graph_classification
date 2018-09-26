package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0; str1.charAt(i) != '\0' ;i++)
		{
			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			}
		}
		for (i = 0;str2.charAt(i) != '\0';i++)
		{
			if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
			{
				str2.charAt(i) -= 32;
			}
		}
		//puts(str1);
		//puts(str2);
		for (i = 0;str1.charAt(i) == str2.charAt(i) && str1.charAt(i) != '\0' && str2.charAt(i) != '\0';i++)
		{
			;
		}
		if (str1.charAt(i) > str2.charAt(i))
		{
			System.out.print(">\n");
		}
		else if (str1.charAt(i) < str2.charAt(i))
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print("=");
		}
		return 0;
	}

}

