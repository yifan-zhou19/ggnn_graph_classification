package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		String c = new String(new char[80]);
		String d = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - 32);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
		}
		c = tangible.StringFunctions.changeCharacter(c, i, '\0');
		for (j = 0;b.charAt(j) != '\0';j++)
		{
			if (b.charAt(j) >= 'a' && b.charAt(j) <= 'z')
			{
				d = tangible.StringFunctions.changeCharacter(d, j, b.charAt(j) - 32);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, j, b.charAt(j));
			}
		}
		d = tangible.StringFunctions.changeCharacter(d, j, '\0');
		if (strcmp(c,d) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(c,d) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(c,d) < 0)
		{
			System.out.print("<");
		}
	}
}

