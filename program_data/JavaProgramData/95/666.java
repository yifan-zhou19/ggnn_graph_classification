package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
	for (i = 0;str1.charAt(i) != '\0';i++)
	{
	 str1 = tangible.StringFunctions.changeCharacter(str1, i, Character.toUpperCase(str1.charAt(i)));
	}
	for (i = 0;str2.charAt(i) != '\0';i++)
	{
	 str2 = tangible.StringFunctions.changeCharacter(str2, i, Character.toUpperCase(str2.charAt(i)));
	}
	if (strcmp(str1,str2) == 0)
	{
		k = 0;
	}
	if (strcmp(str1,str2) > 0)
	{
		k = 1;
	}
	if (strcmp(str1,str2) < 0)
	{
		k = -1;
	}
		if (k == 0)
		{
			System.out.print("=\n");
		}
		else if (k == 1)
		{
			System.out.print(">\n");
		}
		else if (k == -1)
		{
			System.out.print("<\n");
		}
	}
}

