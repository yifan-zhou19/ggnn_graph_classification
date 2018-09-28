package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		String c = new String(new char[80]);
		String d = new String(new char[80]);
		int i;
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

		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				d = tangible.StringFunctions.changeCharacter(d, i, b.charAt(i) - 32);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, i, b.charAt(i));
			}
		}
		d = tangible.StringFunctions.changeCharacter(d, i, '\0');

		if (strcmp(c,d) == 0)
		{
			System.out.print("=");
		}
		else
		{
			if (strcmp(c,d) > 0)
			{
				System.out.print(">");
			}
			else
			{
				System.out.print("<");
			}
		}


	}

}

