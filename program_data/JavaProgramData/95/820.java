package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c1 = new String(new char[80]);
		String c2 = new String(new char[80]);
	c1 = new Scanner(System.in).nextLine();
	c2 = new Scanner(System.in).nextLine();
	int i;
	int j = 0;

	for (i = 0;i <= 80;i++)
	{
		if (c1.charAt(i) >= 'a' && c1.charAt(i) <= 'z')
		{
			c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(i) - 32);
		}
	}
	for (i = 0;i <= 80;i++)
	{
		if (c2.charAt(i) >= 'a' && c2.charAt(i) <= 'z')
		{
			c2 = tangible.StringFunctions.changeCharacter(c2, i, c2.charAt(i) - 32);
		}
	}

	if (strcmp(c1,c2) > 0)
	{
		System.out.print(">");
	}
	if (strcmp(c1,c2) < 0)
	{
		System.out.print("<");
	}
	if (strcmp(c1,c2) == 0)
	{
		System.out.print("=");
	}



	}

}

