package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String org = new String(new char[200]);
		String p;
		p = org;
		int i;
		int m;
		int n;
		org = new Scanner(System.in).nextLine();
		n = org.length();
		for (i = 0;i < n - 1;i++)
		{

			m = (p.Substring(i)) + *(p.Substring(1) + i);
			System.out.printf("%c",m);
		}
		m = (p.Substring(i)) + p;
		System.out.printf("%c",m);
	}



}
