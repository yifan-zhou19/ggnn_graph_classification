package <missing>;

public class GlobalMembers
{
	public static int ways(int m,int n)
	{
		int c = 0;
		if (m >= 0)
		{
			if (m == 1 || n == 1 || m == 0)
			{
				c = 1;
			}
			else
			{
				c = ways(m, n - 1) + ways(m - n, n);
			}
		}
		else
		{
			return 0;
		}
		return c;
	}


	public static int Main()
	{
		int t;
		int i = 1;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(ways(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

