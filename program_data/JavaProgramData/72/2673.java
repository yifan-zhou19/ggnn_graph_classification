package <missing>;

public class GlobalMembers
{
	public static int topjudge(int[][] a, int m, int n, int p, int q)
	{
		if (p == 0)
		{
			if (q == 0)
			{
				if (a[p][q] < a[p + 1][q] || a[p][q] < a[p][q + 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
			else if (q == n - 1)
			{
				if (a[p][q] < a[p + 1][q] || a[p][q] < a[p][q - 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
			else
			{
				if (a[p][q] < a[p + 1][q] || a[p][q] < a[p][q - 1] || a[p][q] < a[p][q + 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
		}
		else if (p == m - 1)
		{
			if (q == 0)
			{
				if (a[p][q] < a[p - 1][q] || a[p][q] < a[p][q + 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
			else if (q == n - 1)
			{
				if (a[p][q] < a[p - 1][q] || a[p][q] < a[p][q - 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
			else
			{
				if (a[p][q] < a[p - 1][q] || a[p][q] < a[p][q - 1] || a[p][q] < a[p][q + 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
		}
		else
		{
			if (q == 0)
			{
				if (a[p][q] < a[p - 1][q] || a[p][q] < a[p + 1][q] || a[p][q] < a[p][q + 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
			else if (q == n - 1)
			{
				if (a[p][q] < a[p - 1][q] || a[p][q] < a[p + 1][q] || a[p][q] < a[p][q - 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
			else
			{
				if (a[p][q] < a[p - 1][q] || a[p][q] < a[p + 1][q] || a[p][q] < a[p][q - 1] || a[p][q] < a[p][q + 1])
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}
		}
	}

	public static int Main()
	{
		int[][] a = new int[20][20];
		int[][] b = new int[20][2];
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (topjudge(a, m, n, i, j) == 1)
				{
					b[k][0] = i;
					b[k][1] = j;
					k++;
				}
			}
		}
				for (i = 0;i < k;i++)
				{
					System.out.printf("%d %d\n",b[i][0],b[i][1]);
				}


		return 0;
	}
}

