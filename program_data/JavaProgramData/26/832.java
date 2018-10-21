package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[101]);
	a = new Scanner(System.in).nextLine();
	int l = a.length();
	int k = 1;
	String b = new String(new char[101]);
	b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
	for (int i = 1;i <= l;i++)
	{
	if (a.charAt(i) != ' ')
	{
		b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
	k++;
	continue;
	}
	if (a.charAt(i - 1) != ' ')
	{
		b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
	k++;
	continue;
	}
	}
	System.out.printf("%s",b);
	return 0;
	}


}

