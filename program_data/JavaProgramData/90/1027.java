package <missing>;

public class GlobalMembers
{
	public static int account(int m,int n)
	{
		if (m == 0)
		{
			return 1;
		}
		if (n == 1)
		{
			return 1;
		}
		if (m < n)
		{
			return account(m, n - 1);
		}
		return account(m - n, n) + account(m, n - 1);
	}
	public static int Main()
	{
		int t;
		int m = 0;
		int n = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t > 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(account(m, n));
			System.out.print("\n");
	t--;
		}
		return 0;
	}

}

