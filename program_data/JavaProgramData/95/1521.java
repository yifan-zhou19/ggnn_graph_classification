package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[10000]);
		String str2 = new String(new char[10000]);
	int i;
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();
	for (i = 0;str1.charAt(i) != '\0';i++)
	{
	if ((str1.charAt(i) >= 'a') && (str1.charAt(i) <= 'z'))
	{
	str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 'a'+'A');
	}
	}
	for (i = 0;str2.charAt(i) != '\0';i++)
	{
	if ((str2.charAt(i) >= 'a') && (str2.charAt(i) <= 'z'))
	{
	str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 'a'+'A');
	}
	}
	if (strcmp(str1,str2) > 0)
	{
	System.out.print(">");
	}
	else
	{
	if (strcmp(str1,str2) < 0)
	{
	System.out.print("<");
	}
	else
	{
	System.out.print("=");
	}
	}
	}

}

