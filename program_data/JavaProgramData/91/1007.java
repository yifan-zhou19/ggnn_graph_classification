package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int n;
		String a = new String(new char[110]);
		String p = a;
		p = new Scanner(System.in).nextLine();
		n = a.length();
		t = (p);
		for (i = 0;i <= n - 2;i++)
		{
	*(p.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
	*(p.Substring(n) - 1) = *(p.Substring(n) - 1) + t;
	for (i = 0;i <= n - 1;i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	}
}
