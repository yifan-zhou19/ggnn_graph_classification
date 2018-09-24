package <missing>;

public class GlobalMembers
{
	public static final int M = 100 + 10;
	public static final int N = 100 + 10;
	public static int[][] mat = new int[M][N];
	public static int Main()
	{
		int cases;
		int i;
		int j;
		int ans;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cases = Integer.parseInt(tempVar);
		}
		while (cases-- != 0)
		{
			ans = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 0; i < m; ++i)
			{
				for (j = 0; j < n; ++j)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						mat[i] + j = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m == 0 || n == 0)
			{
				System.out.printf("%d\n", 0);
				continue;
			}
			if (m == 1)
			{
				for (i = 0; i < n; ++i)
				{
					ans += mat[0][i];
				}
				System.out.printf("%d\n", ans);
				continue;
			}
			else if (n == 1)
			{
				for (i = 0; i < m; ++i)
				{
					ans += mat[i][0];
				}
				System.out.printf("%d\n", ans);
				continue;
			}

			for (i = 0; i < n; ++i)
			{
				ans += mat[0][i];
				ans += mat[m - 1][i];
			}
			for (i = 0; i < m; ++i)
			{
				ans += mat[i][0];
				ans += mat[i][n - 1];
			}
			ans -= (mat[0][0] + mat[0][n - 1] + mat[m - 1][0] + mat[m - 1][n - 1]);
			System.out.printf("%d\n", ans);
		}
		return 0;
	}
}

