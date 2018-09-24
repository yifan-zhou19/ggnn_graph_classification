package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int j;
		int m;
		int M;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row > col)
		{
			M = row;
			m = col;
		}
		else
		{
			M = col;
			m = row;
		}
		for (k = 0;k < m;k++)
		{
			for (i = 0;i <= k;i++)
			{
				System.out.printf("%d\n",a[i][k - i]);
			}
		}
		if (row > col)
		{
			for (k = 0;k < M - m;k++)
			{
				for (i = 0;i < m;i++)
				{
					System.out.printf("%d\n",a[i + k + 1][m - i - 1]);
				}
			}
		}
		else
		{
			for (k = 0;k < M - m;k++)
			{
				for (i = 0;i < m;i++)
				{
					System.out.printf("%d\n",a[i][m - i + k]);
				}
			}
		}
		for (k = 1;k < m;k++)
		{
			for (i = 0;i < m - k;i++)
			{
				System.out.printf("%d\n",a[row - m + i + k][col - i - 1]);
			}
		}
		return 0;
	}
}

