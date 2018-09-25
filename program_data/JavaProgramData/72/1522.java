package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[20][20];
		int[][] put = new int[100][2];
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
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (a[0][0] >= a[0][1] != 0 && a[0][0] >= a[1][0])
		{
					put[k][0] = 0;
					put[k][1] = 0;
					 k++;
		}
			for (j = 1;j <= n - 2;j++)
			{
				if (a[0][j] >= a[0][j + 1] != 0 && a[0][j] >= a[1][j] != 0 && a[0][j] >= a[0][j - 1])
				{
					put[k][0] = 0;
					put[k][1] = j;
					 k++;
				}
			}
		if (a[0][n - 1] >= a[0][n - 2] != 0 && a[0][n - 1] >= a[1][n - 1])
		{
					put[k][0] = 0;
					put[k][1] = n - 1;
					 k++;
		}
		for (i = 1;i <= m - 2;i++)
		{
			if (a[i][0] >= a[i][1] != 0 && a[i][0] >= a[i - 1][0] != 0 && a[i][0] >= a[i + 1][0])
			{
					put[k][0] = i;
					put[k][1] = 0;
					 k++;
			}
			for (j = 1;j <= n - 2;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
				{
					put[k][0] = i;
					put[k][1] = j;
					 k++;
				}
			}
			if (a[i][n - 1] >= a[i][n - 2] != 0 && a[i][n - 1] >= a[i - 1][n - 1] != 0 && a[i][n - 1] >= a[i + 1][n - 1])
			{
					put[k][0] = i;
					put[k][1] = n - 1;
					 k++;
			}
		}
	if (a[m - 1][0] >= a[m - 1][1] != 0 && a[m - 1][0] >= a[m - 2][0])
	{
					put[k][0] = m - 1;
					put[k][1] = 0;
					 k++;
	}
			for (j = 1;j <= n - 2;j++)
			{
				if (a[m - 1][j] >= a[m - 1][j + 1] != 0 && a[m - 1][j] >= a[m - 2][j] != 0 && a[m - 1][j] >= a[m - 1][j - 1])
				{
					put[k][0] = m - 1;
					put[k][1] = j;
					 k++;
				}
			}
		if (a[m - 1][n - 1] >= a[m - 1][n - 2] != 0 && a[m - 1][n - 1] >= a[m - 2][n - 1])
		{
					put[k][0] = m - 1;
					put[k][1] = n - 1;
					 k++;
		}
	   for (i = 0;i <= k - 1;i++)
	   {
		   System.out.printf("%d %d\n",put[i][0],put[i][1]);
	   }
	}
}

