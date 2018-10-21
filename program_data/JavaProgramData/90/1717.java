package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//


	public static int sum(int m,int n)
	{
		if (n == 1 || m == 0)
		{
			return 1;
		}
		if (n != 1)
		{
			if (m - n < 0)
			{
				return sum(m, m);
			}
			return (sum(m, n - 1) + sum(m - n, n));
		}
	}

	public static int Main()
	{
		int t;
		int i;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(sum(m, n));
			System.out.print("\n");
		}
		return 0;
	}

}

