package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int i;
		int j;
		int len;
		char si;
		for (i = 0;i < 101;i++)
		{
			s = s.substring(0, i);
		}
		s = new Scanner(System.in).nextLine();
		len = s.length();
		si = s.charAt(0);
		for (i = 0;i < len - 1;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + s.charAt(i + 1));
		}
		s = tangible.StringFunctions.changeCharacter(s, len - 1, s.charAt(len - 1) + si);
		System.out.printf("%s",s);
	}
}

