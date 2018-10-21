package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int stat;
		String s = new String(new char[101]);
		String w = new String(new char[101]);
		String ps;
		String pw;
		s = new Scanner(System.in).nextLine();
		ps = s;
		pw = w;
		for (i = 0;i <= s.length() - 2;i++)
		{
			*(pw.Substring(i)) = *(ps.Substring(i)) + *(ps.Substring(i) + 1);
		}
		*(pw + s.length() - 1) = (ps) + *(ps + s.length() - 1);
		*(pw + s.length()) = '\0';
		System.out.println(w);
		return 0;
	}


}
