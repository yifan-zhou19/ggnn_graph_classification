package <missing>;

public class GlobalMembers
{
	public static int work(int m,int n)
	{
		if (m == 0)
		{
			return 1;
		}
		else if (n == 1)
		{
			return 1;
		}
		else if (m >= n)
		{
			return work(m - n, n) + work(m, n - 1);
		}
		else
		{
			return work(m, n - 1);
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(work(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

