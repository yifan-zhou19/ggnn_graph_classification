package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[90]);
		String b = new String(new char[90]);
	 int i;
	 int g;
	 int h;
	 int min;
	 int t = 0;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	g = a.length();
	h = b.length();
	for (i = 0;i <= g - 1;i++)
	{
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 122)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
		}
	}

	for (i = 0;i <= g - 1;i++)
	{
		if (b.charAt(i) >= 97 && b.charAt(i) <= 122)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
		}
	}

	t = strcmp(a,b);
	if (t < 0)
	{
		System.out.print("<");
	}
	if (t == 0)
	{
		System.out.print("=");
	}
	if (t > 0)
	{
		System.out.print(">");
	}








	return 0;
	}

}

