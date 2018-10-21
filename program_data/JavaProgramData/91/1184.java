package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[999]);
	int i;
	int n;
	int t;
	int tt;
	int ttt;
	s = new Scanner(System.in).nextLine();
	n = s.length();
	for (i = 1;i <= n;i++)
	{
		if (i < n)
		{
		t = s.charAt(i - 1);
	tt = s.charAt(i);
	ttt = t + tt;
	System.out.printf("%c",ttt);
		}
	if (i == n)
	{
		t = s.charAt(i - 1);
	tt = s.charAt(0);
	ttt = t + tt;
	System.out.printf("%c",ttt);
	}
	}
	return 0;
	}
}
