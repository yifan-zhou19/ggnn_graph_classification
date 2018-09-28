package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[ROW][COL];
		int i;
		int j;
		int I2;
		int J;
		int none;
		int row;
		int col;
		int k = 0;
		none = 0;

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
			J = 0;
			for (j = 0;j < col - 1;j++)
			{
				if (sz[i][j] < sz[i][j + 1])
				{
					J = j + 1;
				}
				else
				{
					continue;
				}
			}
			I2 = 0;
			for (k = 0;k < row - 1;k++)
			{
				if (sz[k][J] > sz[k + 1][J])
				{
					I2 = k + 1;
				}
			}
			if (i == I2)
			{
				System.out.printf("%d+%d\n",I2,J);
			}
			else
			{
				none++;
			}
		}
		if (none == row)
		{
			System.out.print("No");
		}
		return 0;
	}

}

