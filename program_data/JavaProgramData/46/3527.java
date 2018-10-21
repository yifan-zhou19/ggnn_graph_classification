package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int all;
		int row;
		int col;
		int sum;
		int[][] sz = new int[200][200];
		sum = 0;
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
		all = row * col;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (n = 0;;n++)
		{
			for (i = n;i < (col - n);i++)
			{
				System.out.printf("%d\n",sz[n][i]);
				sum = sum + 1;

			}
			if (sum == all)
			{
				break;
			}
			for (j = n + 1;j < (row - n);j++)
			{
				System.out.printf("%d\n",sz[j][col - n - 1]);
				sum = sum + 1;

			}
			if (sum == all)
			{
				break;
			}
			for (i = col - 2 - n;i >= n;i--)
			{
				System.out.printf("%d\n",sz[row - n - 1][i]);
				sum = sum + 1;

			}
			if (sum == all)
			{
				break;
			}
			for (j = (row - 2 - n);j > n;j--)
			{
				System.out.printf("%d\n",sz[j][n]);
				sum = sum + 1;
			}
			if (sum == all)
			{
				break;
			}
		}

		return 0;
	}
}

