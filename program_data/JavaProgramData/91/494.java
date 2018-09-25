package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
								s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
								if (i == s.length() - 1)
								{
												  s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(0) + s.charAt(i));
								}
		}
		for (i = 0;i < s.length();i++)
		{
								System.out.printf("%c",s1.charAt(i));
		}
		return 0;
	}
}

