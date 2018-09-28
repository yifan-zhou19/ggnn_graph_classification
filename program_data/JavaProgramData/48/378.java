package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int x;
		int y;
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
		int[][] u = new int[10][10];
		int[][] q = new int[10][10];
		u[4][4] = m;
		q[4][4] = m;
		for (k = 1;k <= n;k++)
		{
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (q[i][j] != 0)
				{
					u[i][j] += q[i][j];
					u[i - 1][j - 1] += q[i][j];
					u[i - 1][j] += q[i][j];
					u[i - 1][j + 1] += q[i][j];
					u[i][j - 1] += q[i][j];
					u[i][j + 1] += q[i][j];
					u[i + 1][j - 1] += q[i][j];
					u[i + 1][j] += q[i][j];
					u[i + 1][j + 1] += q[i][j];
				}
			}
		}
		for (x = 0;x < 9;x++)
		{
					for (y = 0;y < 9;y++)
					{
						q[x][y] = u[x][y];
					}
		}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j == 8)
				{
					System.out.printf("%d\n",u[i][j]);
				}
				else
				{
				System.out.printf("%d ",u[i][j]);
				}
			}
		}
		return 0;
	}
}

