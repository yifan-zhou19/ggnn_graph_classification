package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[102]);
		String p1 = a;
		final String b = "";
		String p2 = b;
		int i;
		int j;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l - 1;i++)
		{
			*(p2.Substring(i)) = *(p1.Substring(i)) + *(p1.Substring(i) + 1);
		}
		*(p2.Substring(l) - 1) = *(p1.Substring(l) - 1) + p1;
		System.out.printf("%s",b);
	}
}
