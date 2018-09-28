package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[80]);
		String q = new String(new char[80]);
		int i;
		s = new Scanner(System.in).nextLine();
		q = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				s.charAt(i) -= 'A'-'a';
			}
		}
		for (i = 0;q.charAt(i) != '\0';i++)
		{
			if (q.charAt(i) >= 'A' && q.charAt(i) <= 'Z')
			{
				q.charAt(i) -= 'A'-'a';
			}
		}


		if (strcmp(s,q) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(s,q) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(s,q) > 0)
		{
			System.out.print(">");
		}

		return 0;


	}

}
