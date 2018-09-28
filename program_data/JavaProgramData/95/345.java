package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count1;
		int count2;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		count1 = str1.length();
		count2 = str2.length();
		for (i = 0;i <= count1;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, Character.toLowerCase(str1.charAt(i)));
		}
		for (i = 0;i <= count2;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, Character.toLowerCase(str2.charAt(i)));
		}
		if (strcmp(str1,str2) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("=");
		}

		return 0;

	}


}

