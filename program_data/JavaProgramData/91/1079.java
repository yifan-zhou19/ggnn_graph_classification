package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		int i;
		int l;
		String ps;
		String ps1;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		ps = s;
		ps1 = s1;
		for (i = 0;i < l;i++)
		{
			*(ps1.Substring(i)) = *(ps.Substring(i)) + *(ps.Substring(i) + 1);
		}
		*(ps1.Substring(l) - 1) = *(ps.Substring(l) - 1) + ps;
		*(ps1.Substring(l)) = '\0';
		System.out.println(s1);
		return 0;
	}
}
