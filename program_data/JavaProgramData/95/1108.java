package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[81]);
		String s2 = new String(new char[81]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		j = s2.length();
		for (i = 0;i <= j - 1;i++)
		{
			if ((s2.charAt(i) >= 'a') && (s2.charAt(i) <= 'z'))
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 'A'-'a');
			}
		}
		j = s1.length();
		for (i = 0;i <= j - 1;i++)
		{
			if ((s1.charAt(i) >= 'a') && (s1.charAt(i) <= 'z'))
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 'A'-'a');
			}
		}
		m = 0;
		m = strcmp(s1,s2);
		if (m == 0)
		{
			System.out.println("=");
		}
		if (m > 0)
		{
			System.out.println(">");
		}
		if (m < 0)
		{
			System.out.println("<");
		}
		return 0;
	}

}

