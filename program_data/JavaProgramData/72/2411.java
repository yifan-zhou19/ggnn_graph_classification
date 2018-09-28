package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[20][20];
		int m;
		int n;
		int i;
		int j;
		int[][] b = new int[400][2];
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
				if (i != 0 && j != 0 && i != m - 1 && j != n - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
					{
						b[k][0] = i;
						b[k][1] = j;
						k += 1;
						continue;
					}
				}
				if (i == 0)
				{
					if (j == 0)
					{
						if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
						{
								b[k][0] = i;
								b[k][1] = j;
								k += 1;
								continue;
						}

					}
					else if (j == n - 1)
					{
						if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
						{
								b[k][0] = i;
								b[k][1] = j;
								k += 1;
								continue;
						}
					}
					else
					{
						if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
						{
								b[k][0] = i;
								b[k][1] = j;
								k += 1;
								continue;
						}
					}
				}
				if (i == m - 1)
				{
					if (j == 0)
					{
						if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
						{
								b[k][0] = i;
								b[k][1] = j;
								k += 1;
								continue;
						}

					}
					else if (j == n - 1)
					{
						if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
						{
								b[k][0] = i;
								b[k][1] = j;
								k += 1;
								continue;
						}
					}
					else
					{
						if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
						{
								b[k][0] = i;
								b[k][1] = j;
								k += 1;
								continue;
						}
					}
				}
				if (j == 0)
				{
					if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
					{
							b[k][0] = i;
							b[k][1] = j;
							k += 1;
							continue;
					}
				}
				if (j == n - 1)
				{
					if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
					{
							b[k][0] = i;
							b[k][1] = j;
							k += 1;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d %d\n", b[i][0], b[i][1]);
		}
		return 0;
	}

}

