package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int row;
		int col;
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
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int k = 0;k <= row + col - 2;k++)
		{
			if ((k <= col - 1) && (k <= row - 1))
			{
				for (int l = 0;l <= k;l++)
				{
				System.out.printf("%d\n",sz[l][k - l]);
				}
			}
			else if ((k <= col - 1) && (k> row - 1))
			{
				for (int m = 0;m <= row - 1;m++)
				{
					System.out.printf("%d\n",sz[m][k - m]);
				}
			}
		else if ((k > col - 1) && (k <= row - 1))
		{
			for (int t = k - col + 1;t <= k;t++)
			{
				System.out.printf("%d\n",sz[t][k - t]);
			}
		}
		else if ((k > col - 1) && (k > row - 1))
		{
			for (int p = k - col + 1;p <= row - 1;p++)
			{
				System.out.printf("%d\n",sz[p][k - p]);
			}
		}
		}
		return 0;
	}
}

