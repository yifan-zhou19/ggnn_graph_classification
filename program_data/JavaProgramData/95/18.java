package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		String g = new String(new char[80]);
		String h = new String(new char[80]);
		g = new Scanner(System.in).nextLine();
		h = new Scanner(System.in).nextLine();
		for (c = 0;g.charAt(c) != '\0';c++)
		{
			;
		}
		for (b = 0;g.charAt(b) != '\0';b++)
		{
			;
		}
		for (a = 0;a != '?' && g.charAt(a) != '\0';a++)
		{
			if (g.charAt(a) >= 'A' && g.charAt(a) <= 'Z')
			{
				g = tangible.StringFunctions.changeCharacter(g, a, g.charAt(a) - 'A'+'a');
			}
			if (g.charAt(a) < ' ')
			{
				g = g.substring(0, a);
			}
			if (h.charAt(a) >= 'A' && h.charAt(a) <= 'Z')
			{
				h = tangible.StringFunctions.changeCharacter(h, a, h.charAt(a) - 'A'+'a');
			}
			if (h.charAt(a) < ' ')
			{
				h = h.substring(0, a);
			}
			if (g.charAt(a) > h.charAt(a))
			{
				System.out.print(">");
				return 0;
			}
			if (g.charAt(a) < h.charAt(a))
			{
				System.out.print("<");
				return 0;
			}
		}
		System.out.print("=");
		return 0;
	}

}

