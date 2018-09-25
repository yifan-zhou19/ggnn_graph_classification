package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int i;
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();
	for (i = 0;i < 80;i++)
	{
		   if (str1.charAt(i) >= 97)
		   {
			   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
		   }
	}
	for (i = 0;i < 80;i++)
	{
		   if (str2.charAt(i) >= 97)
		   {
			   str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
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
	else
	{
		System.out.print("=");
	}
	}
}

