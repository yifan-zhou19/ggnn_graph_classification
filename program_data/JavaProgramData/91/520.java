package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[120]);
		String s2 = new String(new char[120]);
		String p;
		int i;
		int n;
		s1 = new Scanner(System.in).nextLine();
		p = s1;
		n = s1.length();
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, *(p.Substring(i)) + *(p.Substring(i) + 1));
			}
			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, p + *(p + (n - 1)));
			}
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, n, '\0');
		System.out.println(s2);
		return 0;
	}
}

