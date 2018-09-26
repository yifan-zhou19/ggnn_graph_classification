package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	String str1 = new String(new char[80]);
	String str2 = new String(new char[80]);
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();
	for (i = 0;i <= 80;i = i + 1)
	{
					if (str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a')
					{
							str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
					}
	}
	for (i = 0;i <= 80;i = i + 1)
	{
					if (str2.charAt(i) <= 'z' && str2.charAt(i) >= 'a')
					{
							str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
					}
	}
	if (strcmp(str1,str2) > 0)
	{
			System.out.print(">");
			System.out.print("\n");
	}
	if (strcmp(str1,str2) == 0)
	{
			System.out.print("=");
			System.out.print("\n");
	}
	if (strcmp(str1,str2) < 0)
	{
			System.out.print("<");
			System.out.print("\n");
	}
	return 0;
	}
}

