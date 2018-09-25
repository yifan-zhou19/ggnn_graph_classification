package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[100]);
		String q = new String(new char[100]);
		p = new Scanner(System.in).nextLine();
		q = new Scanner(System.in).nextLine();
		int h;
		int g;
		h = p.length();
		g = q.length();
		int j;
		int d;
		for (j = 0;j < h;j++)
		{
			if (p.charAt(j) >= 97 && p.charAt(j) <= 122)
			{
				p = tangible.StringFunctions.changeCharacter(p, j, (char)(p.charAt(j) - 32));
			}
			else if ((p.charAt(j) >= 27 && p.charAt(j) <= 96) || (p.charAt(j) >= 123))
			{
				p = tangible.StringFunctions.changeCharacter(p, j, p.charAt(j));
			}
		}
		for (d = 0;d < g;d++)
		{
			if (q.charAt(d) >= 97 && q.charAt(d) <= 122)
			{
				q = tangible.StringFunctions.changeCharacter(q, d, (char)(q.charAt(d) - 32));
			}
			else if ((q.charAt(d) >= 27 && q.charAt(d) <= 96) || (q.charAt(d) >= 123))
			{
				q = tangible.StringFunctions.changeCharacter(q, d, q.charAt(d));
			}
		}
		int m;
		m = strcmp(p,q);
		if (m == 0)
		{
			System.out.print("=");
		}
		else if (m > 0)
		{
			System.out.print(">");
		}
		else if (m < 0)
		{
			System.out.print("<");
		}
		return 0;
	}

}

