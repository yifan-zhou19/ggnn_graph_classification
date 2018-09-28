package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (j = 0;a.charAt(j) != '\0';j++)
		{
			for (i = 'a';i <= 'z';i++)
			{
			if (a.charAt(j) == i)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, i - 'a'+'A');
			}
			}
		}
		for (j = 0;b.charAt(j) != '\0';j++)
		{
			for (i = 'a';i <= 'z';i++)
			{
			if (b.charAt(j) == i)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, i - 'a'+'A');
			}
			}
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

