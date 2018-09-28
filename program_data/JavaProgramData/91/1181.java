package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		str = new Scanner(System.in).nextLine();
		int n;
		n = str.length();
		for (i = 0;i < (n - 1);i++)
		{
			int p;
			int q;
			p = (int)str.charAt(i);
			q = (int)str.charAt(i + 1);
			System.out.printf("%c",p + q);
		}
		int p;
		int q;
		p = (int)str.charAt(0);
		q = (int)str.charAt(n - 1);
		System.out.printf("%c",p + q);
		return 0;
	}
}
