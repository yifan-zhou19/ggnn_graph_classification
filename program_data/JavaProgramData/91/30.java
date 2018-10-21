package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[101]);
		String zfc2 = new String(new char[101]);
		String p;
		String q;
		int m;
		int i;
		zfc1 = new Scanner(System.in).nextLine();
		p = zfc1;
		q = zfc2;
		m = zfc1.length();
		for (i = 0;i < m - 1;i++)
		{
			*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(q.Substring(m) - 1) = *(p.Substring(m) - 1) + p;
		for (i = 0;i < m;i++)
		{
			System.out.printf("%c",*(q.Substring(i)));
		}
		return 0;
	}
}
