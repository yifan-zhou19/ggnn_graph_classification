package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	final String a = "";
	final String b = "";
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	int i;
	for (i = 0;i < 80;i++)
	{
		if (a.charAt(i) >= 97 && a.charAt(i) <= 121)
		{
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
		}
	if (b.charAt(i) >= 97 && b.charAt(i) <= 121)
	{
		b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
	}
	}


	if (strcmp(a,b) < 0)
	{
	System.out.print("<");
	}
	if (strcmp(a,b) == 0)
	{
	System.out.print("=");
	}
	if (strcmp(a,b) > 0)
	{
	System.out.print(">");
	}
	return 0;
	}

}

