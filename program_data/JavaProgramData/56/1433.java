package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int len;
		String s = new String(new char[6]);
		char t;

		s = new Scanner(System.in).nextLine();
		len = s.length();

		for (i = 0; i < (len / 2); i++)
		{
			t = s.charAt(len - (i + 1));
			s = tangible.StringFunctions.changeCharacter(s, len - (i + 1), s.charAt(i));
			s = tangible.StringFunctions.changeCharacter(s, i, t);
		}
		System.out.printf("%s", s);
	}
}

