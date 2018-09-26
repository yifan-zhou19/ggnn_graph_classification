package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
	int n1;
	int n2;
	int i;
	str1 = new Scanner(System.in).nextLine();
	n1 = str1.length();
	for (i = 0;i < n1;i++)
	{
		if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
		{
	str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
		}
	}
	str2 = new Scanner(System.in).nextLine();
	n2 = str2.length();
	for (i = 0;i < n2;i++)
	{
		if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
		{
	str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
		}
	}
	if (strcmp(str1,str2) > 0)
	{
		System.out.print(">");
	}
	else if (strcmp(str1,str2) < 0)
	{
		System.out.print("<");
	}
	else if (strcmp(str1,str2) == 0)
	{
		System.out.print("=");
	}
	}
}

