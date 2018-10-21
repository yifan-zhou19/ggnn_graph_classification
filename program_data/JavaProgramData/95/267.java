package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0' && b.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) >= 97 && b.charAt(i) <= 122)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=\n");
		}
		else if (strcmp(a,b) > 0)
		{
			System.out.print(">\n");
		}
		else
		{
			System.out.print("<\n");
		}
	}
}

