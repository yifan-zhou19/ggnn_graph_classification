package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (j = 0;b.charAt(j) != '\0';j++)
		{
			if (b.charAt(j) >= 'a' && b.charAt(j) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j) - 32);
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
	}

}

