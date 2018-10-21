package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int ls;
		int lp;
		int l;
		int x = 0;
		String s = new String(new char[100]);
		String p = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		p = new Scanner(System.in).nextLine();
		ls = s.length();
		lp = p.length();
		if (ls >= lp)
		{
			l = lp;
		}
		else
		{
			l = ls;
		}
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 32);
			}
			if (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z')
			{
				p = tangible.StringFunctions.changeCharacter(p, i, p.charAt(i) + 32);
			}
		}
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) > p.charAt(i))
			{

				x = 1;
				break;
			}
			else if (s.charAt(i) < p.charAt(i))
			{
				x = -1;
				break;
			}
			else
			{
				x = 0;
			}
		}
		if (x == 0)
		{
			System.out.print("=\n");
		}
		if (x == 1)
		{
			System.out.print(">\n");
		}
		if (x == -1)
		{
			System.out.print("<\n");
		}


	return 0;
	}

}

