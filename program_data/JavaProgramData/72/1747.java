package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[20][20];
		int[] b = new int[400];
		int[] d = new int[400];
		int m;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int k;
		j = 0;
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (i == 0)
				{
					if (k == 0)
					{
						if (a[i][k] >= a[i + 1][k] != 0 && a[i][k] >= a[i][k + 1])
						{
							b[j] = i;
							d[j] = k;
							j = j + 1;
						}
					}
					else if (k == n - 1)
					{
						if (a[i][k] >= a[i][k - 1] != 0 && a[i][k] >= a[i + 1][k])
						{
							b[j] = i;
							d[j] = k;
							j = j + 1;
						}
					}
					else
					{
						if (a[i][k] >= a[i][k - 1] != 0 && a[i][k] >= a[i + 1][k] != 0 && a[i][k] >= a[i][k + 1])
						{
							b[j] = i;
							d[j] = k;
							j = j + 1;
						}
					}
				}
				else if (i == m - 1)
				{
					if (k == 0)
					{
						if (a[i][k] >= a[i - 1][k] != 0 && a[i][k] >= a[i][k + 1])
						{
							b[j] = i;
							d[j] = k;
							j = j + 1;
						}
					}
					else if (k == n - 1)
					{
						if (a[i][k] >= a[i - 1][k] != 0 && a[i][k] >= a[i][k - 1])
						{
							b[j] = i;
							d[j] = k;
							j = j + 1;
						}
					}
					else
					{
						if (a[i][k] >= a[i - 1][k] != 0 && a[i][k] >= a[i][k + 1] != 0 && a[i][k] >= a[i][k - 1])
						{
							b[j] = i;
							d[j] = k;
							j = j + 1;
						}
					}
				}
				else if (k == 0)
				{
					if (a[i][k] >= a[i - 1][k] != 0 && a[i][k] >= a[i + 1][k] != 0 && a[i][k] >= a[i][k + 1])
					{
						b[j] = i;
						d[j] = k;
						j = j + 1;
					}
				}
				else if (k == n - 1)
				{
					if (a[i][k] >= a[i][k - 1] != 0 && a[i][k] >= a[i + 1][k] != 0 && a[i][k] >= a[i - 1][k])
					{
						b[j] = i;
						d[j] = k;
						j = j + 1;
					}
				}
				else
				{
					if (a[i][k] >= a[i + 1][k] != 0 && a[i][k] >= a[i - 1][k] != 0 && a[i][k] >= a[i][k - 1] != 0 && a[i][k] >= a[i][k + 1])
					{
						b[j] = i;
						d[j] = k;
						j = j + 1;
					}
				}
			}
		}
		int h;
		for (h = 1;h <= j;h++)
		{
			int e;
			int c;
			for (i = 0;i < j - h;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i + 1];
					c = d[i + 1];
					d[i + 1] = d[i];
					b[i + 1] = b[i];
					b[i] = e;
					d[i] = c;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d %d\n",b[i],d[i]);
		}
		return 0;
	}
}

