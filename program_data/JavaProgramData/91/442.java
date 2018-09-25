package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "\0";
		final String s1 = "\0";
		int i;
		int l;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0; i < l - 1; i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(0));
		for (i = 0; i < l; i++)
		{
			System.out.printf("%c", s1.charAt(i));
		}
		return 0;
	}
}

