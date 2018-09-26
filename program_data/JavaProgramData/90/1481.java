package <missing>;

public class GlobalMembers
{
	public static int put(int m,int n)
	{
		if (m == 1 || n == 1 || m == 0)
		{
			return 1;
		}
		if (m < 0 || n == 0)
		{
			return 0;
		}
			return put(m, n - 1) + put(m - n, n);

	}
	public static int Main()
	{
		int t;
		int M;
		int N;
		int i;
		int sum;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
	M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				System.out.print(put(M, N));
	System.out.print("\n");
		}
		return 0;
	}

}

