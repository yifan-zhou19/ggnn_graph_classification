package <missing>;

public class GlobalMembers
{
	public static int[][] u = new int[1000][1000];
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int sum;
		int k;
		int m;
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
				u[i][j] = Integer.parseInt(tempVar3);
			}
		}
		}
		if (row > col)
		{
			m = col;
		}
		else
		{
			m = row;
		}

		for (k = 0;k < m;k++)
		{
			for (j = k;j < col - k;j++)
			{
			System.out.printf("%d\n",u[k][j]);
			}
		if (k + 1 >= row - k)
		{
				break;
		}

			for (i = k + 1;i < row - k;i++)
			{
			System.out.printf("%d\n",u[i][col - k - 1]);
			}
		if (col - 2 - k < k)
		{
			break;
		}

			for (j = col - 2 - k;j >= k;j--)
			{
			System.out.printf("%d\n",u[row - k - 1][j]);
			}
			if (row - 2 - k <= k)
			{
			break;
			}

			for (i = row - 2 - k;i > k;i--)
			{
			System.out.printf("%d\n",u[i][k]);
			}

		}
		return 0;
	}
}

