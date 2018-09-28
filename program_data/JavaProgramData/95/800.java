package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int m;
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) < 91)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) < 91)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		m = strcmp(a,b);
		if (m > 0)
		{
			System.out.print(">");
		}
		else if (m == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}
}

