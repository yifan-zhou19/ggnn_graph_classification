package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		final String s = "";
		int i;
		int n;
		String p;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		p = str;
		for (i = 0;i < n - 1;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, *(p.Substring(i)) + *(p.Substring(i) + 1));
		}
		s = tangible.StringFunctions.changeCharacter(s, n - 1, p + *(p.Substring(n) - 1));
		System.out.printf("%s",s);
		return 0;
	}
}

