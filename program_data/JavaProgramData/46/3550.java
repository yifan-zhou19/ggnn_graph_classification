package <missing>;

public class GlobalMembers
{
	/**
	* @file ????????
	* @auth zmj
	* @date 2013-12-30
	* @desc ?????????
	*/



	public static int Main()
	{
		int[][] map = new int[MAX_N][MAX_N];
		int n;
		int m;
		int count;
		int i;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					map[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		count = n * m;
		for (k = 0;; k++)
		{
			for (j = k; j < m - k; j++)
			{
				System.out.printf("%d\n", map[k][j]);
				count--;
				if (count == 0)
				{
					return 0;
				}
			}
			for (i = k + 1; i < n - k; i++)
			{
				System.out.printf("%d\n", map[i][j - 1]);
				count--;
				if (count == 0)
				{
					return 0;
				}
			}
			for (j = j - 2; j > k - 1; j--)
			{
				System.out.printf("%d\n", map[i - 1][j]);
				count--;
				if (count == 0)
				{
					return 0;
				}
			}
			for (i = i - 2; i > k; i--)
			{
				System.out.printf("%d\n", map[i][k]);
				count--;
				if (count == 0)
				{
					return 0;
				}
			}
		}
	}

}

