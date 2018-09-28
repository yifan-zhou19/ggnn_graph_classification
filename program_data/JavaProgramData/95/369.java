package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p = new String(new char[80]);
		String d = new String(new char[80]);
		p = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		for (i = 0;p.charAt(i) != '\0';i++)
		{
			if (p.charAt(i) <= 'Z' && p.charAt(i) >= 'A')
			{
				p = tangible.StringFunctions.changeCharacter(p, i, p.charAt(i) + 32);
			}
		}
		for (i = 0;d.charAt(i) != '\0';i++)
		{
			if (d.charAt(i) <= 'Z' && d.charAt(i) >= 'A')
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 32);
			}
		}
		for (i = 0;p.charAt(i) != '\0' && d.charAt(i) != '\0';i++)
		{
			if (p.charAt(i) > d.charAt(i) && j == 0)
			{
				System.out.print(">");
				j = 1;
			}
			else if (p.charAt(i) < d.charAt(i) && j == 0)
			{
				System.out.print("<");
				j = 1;
			}
		}
		if (j == 0)
		{
			System.out.print("=");
		}
	}



}

