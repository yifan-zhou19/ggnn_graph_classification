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
		for (i = 0;a.charAt(i) != '\0' || b.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) > 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) > 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
		return 0;
	}
}

