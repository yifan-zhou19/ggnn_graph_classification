package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		String s = new String(new char[102]);
		String a = new String(new char[102]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (j = 0;j < l - 1;j++)
		{
			a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(j) + s.charAt(j + 1));
		}
		a = tangible.StringFunctions.changeCharacter(a, l - 1, s.charAt(0) + s.charAt(l - 1));
		for (i = 0;i < l;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, a.charAt(i));
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}

			return 0;
	}
}

