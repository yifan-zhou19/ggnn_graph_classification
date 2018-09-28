package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int r;
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		n = s1.length();
		for (i = 0;i < n;i++)
		{
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
			}
			if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z')
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
			}
		}
		r = strcmp(s1,s2);
		if (r > 0)
		{
			System.out.print(">");
		}
		if (r == 0)
		{
			System.out.print("=");
		}
		if (r < 0)
		{
			System.out.print("<");
		}
		return 0;
	}
}

