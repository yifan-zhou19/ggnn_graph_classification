package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s1 = "";
		final String s2 = "";
		int l;
		int i;
		s1 = new Scanner(System.in).nextLine();
		l = s1.length();
		for (i = 0;i <= l - 2;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) + s1.charAt(i + 1));
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, l - 1, s1.charAt(0) + s1.charAt(l - 1));
		System.out.printf("%s",s2);
	}
}

