package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int x = 1;
		int[] max = new int[10];
		int[] min = new int[10];
		int col;
		int row;
		int[][] sz = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			max[i] = sz[i][0];
			for (j = col - 1;j > 0;j--)
			{
				for (k = 0;k <= j;k++)
				{
					if (sz[i][k] > max[i])
					{
						max[i] = sz[i][k];
					}
				}
			}
		}
		for (j = 0;j < col;j++)
		{
			min[j] = sz[0][j];
			for (i = row - 1;i > 0;i--)
			{
				for (k = 0;k <= i;k++)
				{
					if (sz[k][j] < min[j])
					{
						min[j] = sz[k][j];
					}
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				if (sz[i][j] == max[i] && sz[i][j] == min[j])
				{
					System.out.printf("%d+%d",i,j);
					x = 0;
				}
			}
		}
		if (x == 1)
		{
			System.out.print("No");
		}
		return 0;
	}
}

