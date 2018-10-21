package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String text1 = new String(new char[81]);
	String text2 = new String(new char[81]);
	int i;
	int j;
	int n;
	text1 = new Scanner(System.in).nextLine();
	n = text1.length();
	System.out.print("\n");
	text2 = new Scanner(System.in).nextLine();
	for (i = 0;i < n;i++)
	{
		if ((text1.charAt(i) >= 'a') && (text1.charAt(i) <= 'z'))
		{
			text1 = tangible.StringFunctions.changeCharacter(text1, i, text1.charAt(i) - 'a'+'A');
		}
	if ((text2.charAt(i) >= 'a') && (text2.charAt(i) <= 'z'))
	{
		text2 = tangible.StringFunctions.changeCharacter(text2, i, text2.charAt(i) - 'a'+'A');
	}
	}
	if (strcmp(text1,text2) == 0)
	{
		System.out.print("=");
	}
	else if (strcmp(text1,text2) > 0)
	{
		System.out.print(">");
	}
	else if (strcmp(text1,text2) < 0)
	{
		System.out.print("<");
	}
	}
}

