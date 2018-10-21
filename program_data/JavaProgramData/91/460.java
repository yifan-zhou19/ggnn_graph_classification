package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String s1 = new String(new char[100]);
		String p;
		char y;
		int l;
		int i;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l - 1;i++)
		{
			y = s.charAt(i) + s.charAt(i + 1);
			p = y;
			s1 = tangible.StringFunctions.changeCharacter(s1, i, p);
		}
		y = s.charAt(i) + s.charAt(0);
		p = y;
		s1 = tangible.StringFunctions.changeCharacter(s1, i, p);
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",s1.charAt(i));
		}
		return 0;
	}
}

