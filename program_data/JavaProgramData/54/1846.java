package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int p(int n,int k)
	{
		if (k == 0)
		{
			return 1;
		}
		return n * p(n, k - 1);
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(p(n, n) - k * (n - 1));
		return 0;
	}
}

