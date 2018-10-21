package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		int a = (int)s.length();
		for (int b = 0; b < a - 1; b++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, b, s.charAt(b) + s.charAt(b + 1));
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, a - 1, s.charAt(a - 1) + s.charAt(0));
		s1 = tangible.StringFunctions.changeCharacter(s1, a, '\0');
		System.out.printf("%s", s1);
		return 0;
	}
}

