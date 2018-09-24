package <missing>;

public class GlobalMembers
{
	public static int ways(int n,int p)
	{
		if (n < p)
		{
			return 0;
		}
		while (n % p != 0)
		{
			p++;
		}
		if (n == p)
		{
			return 1;
		}
		return ways(n / p, p) + ways(n, p + 1);
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(ways(m, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

