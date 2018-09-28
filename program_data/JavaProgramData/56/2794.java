package <missing>;

public class GlobalMembers
{
	public static int l;
	public static int Main()
	{
		String a = new String(new char[5]);
		int n;
		void pailie(int n,char ar[]);
		   a = new Scanner(System.in).nextLine();
		l = a.length();
		n = l;
		pailie(n, a);
		return 0;
	}
	public static void pailie(int n, String ar)
	{
		if (n == 1)
		{
			System.out.printf("%c",ar[l - n]);
		}
		else
		{
			pailie(n - 1, ar);
			System.out.printf("%c",ar[l - n]);
		}
	}

}
