package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[30]);
		String c = new String(new char[30]);
		int n;
		s = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		for (int i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 32);
			}
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 32);
			}
		}
		n = strcmp(s,c);
		if (n < 0)
		{
			System.out.print("<");
		}
		if (n == 0)
		{
			System.out.print("=");
		}
		if (n > 0)
		{
			System.out.print(">");
		}
	}

}

