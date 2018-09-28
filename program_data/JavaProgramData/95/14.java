package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int t = 0;
		for (i = 0; a.charAt(i) != '\0' && b.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) >= 'a')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) >= 'a')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}

		if (strcmp(a,b) == 0)
		{
			System.out.print("=\n");
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">\n");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<\n");
		}
		return 0;
	}
}

