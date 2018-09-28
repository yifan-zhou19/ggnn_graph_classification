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
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i));
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i));
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		else
		{
			if (strcmp(a,b) < 0)
			{
				System.out.print("<");
			}
			else
			{
				System.out.print("=");
			}
		}
		return 0;
	}

}

