package <missing>;

public class GlobalMembers
{
	public static int t;
	public static int m;
	public static int n;
	public static int K(int a,int b,int c)
	{
		int count = 0;
		if (a == n - 1 && b <= c)
		{
			return 1;
		}
		for (int i = b;i <= (c / (n - a));i++)
		{
			count += K(a + 1, i, c - i);
		}
		return count;
	}
	public static int Main()
	{
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= t;++i)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(K(0, 0, m));
		System.out.print("\n");
		}
		return 0;
	}
}

