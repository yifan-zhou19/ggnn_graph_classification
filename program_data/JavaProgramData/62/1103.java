package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str1 = new String(new char[100]);
	String str2 = new String(new char[100]);
	int len;
	int i;
	int t = 1;
	str1 = new Scanner(System.in).nextLine();
	len = str1.length();
	str2 = tangible.StringFunctions.changeCharacter(str2, 0, str1.charAt(0));
	for (i = 1;i < len;i++)
	{
	if (str1.charAt(i) != ' ' || str1.charAt(i - 1) != ' ')
	{
	str2 = tangible.StringFunctions.changeCharacter(str2, t, str1.charAt(i));
	t++;
	}
	}
	str2 = tangible.StringFunctions.changeCharacter(str2, t, '\0');
	System.out.println(str2);
	return 0;
	}

}

