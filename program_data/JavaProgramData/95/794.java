package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int m = 0;
		int n = 0;
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (65 <= a.charAt(i) && a.charAt(i) <= 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (65 <= b.charAt(i) && b.charAt(i) <= 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
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

