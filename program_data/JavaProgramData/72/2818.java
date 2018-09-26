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
				if (i == 0 && j == 0 && a[0][0] >= a[0][1] != 0 && a[0][0] >= a[1][0])
				{
					System.out.printf("%d %d\n",i,j);
				}
				else if (i == m - 1 && j == n - 1 && a[m - 1][n - 1] >= a[m - 1][n - 2] != 0 && a[m - 1][n - 1] >= a[m - 2][n - 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
				else if (i == 0 && j == n - 1 && a[0][n - 1] >= a[1][n - 1] != 0 && a[0][n - 1] >= a[0][n - 2])
				{
					System.out.printf("%d %d\n",i,j);
				}
				else if (i == m - 1 && j == 0 && a[m - 1][0] >= a[m - 1][1] != 0 && a[m - 1][0] >= a[m - 2][0])
				{
					System.out.printf("%d %d\n",i,j);
				}
				else if (i == 0 && j > 0 && j < (n - 1) && a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[0][j + 1] != 0 && a[0][j] >= a[1][j])
				{
					System.out.printf("%d %d\n",i,j);
				}
				else if (j == 0 && i > 0 && i < (m - 1) && a[i][0] >= a[i - 1][0] != 0 && a[i][0] >= a[i + 1][0] != 0 && a[i][0] >= a[i][1])
				{
					System.out.printf("%d %d\n",i,j);
				}
				else if (i == m - 1 && j > 0 && j < (n - 1) && a[m - 1][j] >= a[m - 1][j - 1] != 0 && a[m - 1][j] >= a[m - 1][j + 1] != 0 && a[m - 1][j] >= a[m - 2][j])
				{
					System.out.printf("%d %d\n",i,j);
				}
				else if (j == n - 1 && i > 0 && i < (m - 1) && a[i][n - 1] >= a[i - 1][n - 1] != 0 && a[i][n - 1] >= a[i + 1][n - 1] != 0 && a[i][n - 1] >= a[i][n - 2])
				{
					System.out.printf("%d %d\n",i,j);
				}
				else if (i > 0 && i < (m - 1) && j>0 && j < (n - 1) && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}

}

