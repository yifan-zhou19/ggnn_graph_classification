package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
		if (i < s.length() - 1)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
		}
		if (i == s.length() - 1)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(0));
		}
		}
		s1 = s1.substring(0, s.length());
		System.out.println(s1);
		return 0;
	}

}

