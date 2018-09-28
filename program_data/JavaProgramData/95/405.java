package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (int i = 0;a.charAt(i) != '\0';i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, Character.toLowerCase(a.charAt(i)));
		}
		for (int j = 0;b.charAt(j) != '\0';j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, Character.toLowerCase(b.charAt(j)));
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}

		return 0;
	}


}

