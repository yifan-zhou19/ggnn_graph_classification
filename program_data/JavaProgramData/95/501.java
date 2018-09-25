package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String c1 = new String(new char[80]);
		String c2 = new String(new char[80]);
		c1 = new Scanner(System.in).nextLine();
		c2 = new Scanner(System.in).nextLine();
		for (i = 0;c1.charAt(i) != '\0';i++)
		{
			if (c1.charAt(i) >= 97 && c1.charAt(i) <= 122)
			{
				c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(i) - 32);
			}
			if (c2.charAt(i) >= 97 && c2.charAt(i) <= 122)
			{
				c2 = tangible.StringFunctions.changeCharacter(c2, i, c2.charAt(i) - 32);
			}
		}
		if (strcmp(c1,c2) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(c1,c2) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(c1,c2) > 0)
		{
			System.out.print(">");
		}
		return 0;
	}

}

