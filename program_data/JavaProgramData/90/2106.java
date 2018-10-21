package <missing>;

public class GlobalMembers
{
	public static int[][] hf = new int[30][11];
	public static int work(int m,int n)
	{
		if (m == 0 || m == 1)
		{
			hf[m][n] = 1;
			return 1;
		}
		if (n == 1)
		{
			hf[m][n] = 1;
			return 1;
		}
		if (hf[m][n] != 0)
		{
			return hf[m][n];
		}
		if (m >= n)
		{
			hf[m][n] = work(m - n, n) + work(m, n - 1);
			return hf[m][n];
		}
		else
		{
			hf[m][n] = work(m, n - 1);
			return hf[m][n];
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(work(m, n));
			System.out.print("\n");
		}
		return 0;
	}

}

