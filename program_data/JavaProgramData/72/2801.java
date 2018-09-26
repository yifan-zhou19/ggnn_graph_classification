package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[ROW][COL];
		int m;
		int n;
		int k;
		int i;
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
		int[] b = new int[N];
		int[] c = new int[N];
		int j;
		for (k = 0;k < m;k++)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[k][i]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < m;k++)
		{
			for (i = 0;i < n;i++)
			{
				if (k == 0 && i == 0)
				{
					if (a[k][i] >= a[k + 1][i] != 0 && a[k][i] >= a[k][i + 1])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
				else if (k == 0 && i == n - 1)
				{
					if (a[k][i] >= a[k + 1][i] != 0 && a[k][i] >= a[k][i - 1])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
				else if (k == m - 1 && i == 0)
				{
					if (a[k][i] >= a[k - 1][i] != 0 && a[k][i] >= a[k][i + 1])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
				else if (k == m - 1 && i == n - 1)
				{
					if (a[k][i] >= a[k - 1][i] != 0 && a[k][i] >= a[k][i - 1])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
				else if (i == 0 && k > 0 && k < m - 1)
				{
					if (a[k][i] >= a[k - 1][i] != 0 && a[k][i] >= a[k][i + 1] != 0 && a[k][i] >= a[k + 1][i])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
				else if (i == n - 1 && k > 0 && k < m - 1)
				{
					if (a[k][i] >= a[k - 1][i] != 0 && a[k][i] >= a[k][i - 1] != 0 && a[k][i] >= a[k + 1][i])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
				else if (k == 0 && i > 0 && i < n - 1)
				{
					if (a[k][i] >= a[k][i + 1] != 0 && a[k][i] >= a[k][i - 1] != 0 && a[k][i] >= a[k + 1][i])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
				else if (k == m - 1 && i > 0 && i < n - 1)
				{
					if (a[k][i] >= a[k][i + 1] != 0 && a[k][i] >= a[k][i - 1] != 0 && a[k][i] >= a[k - 1][i])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
				else
				{
					if (a[k][i] >= a[k - 1][i] != 0 && a[k][i] >= a[k][i - 1] != 0 && a[k][i] >= a[k + 1][i] != 0 && a[k][i] >= a[k][i + 1])
					{
					System.out.printf("%d %d\n",k,i);
					}
				}
			}
		}

		return 0;
	}


}

