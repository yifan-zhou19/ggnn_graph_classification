package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int n;
		int l;
		String s = new String(new char[300]);
		char[][] a = new char[300][300];
		char ch;
	s = new Scanner(System.in).nextLine();
	l = s.length();
	ch = s.charAt(0);
	for (i = 0;i < l - 1;i++)
	{
		s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + s.charAt(i + 1));
	}
	s.charAt(l - 1) += ch;
	System.out.printf("%s",s);
	}


}

