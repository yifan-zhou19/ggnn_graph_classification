package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (j = 0;c.charAt(j) != '\0';j++)
		{
			if (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z')
			{
				c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j) + 32);
			}
		}
		if (strcmp(a,c) > 0)
		{
			System.out.print(">\n");
		}
		else if (strcmp(a,c) < 0)
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print("=\n");
		}

		return 0;
	}
}

