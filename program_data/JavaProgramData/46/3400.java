package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int min;
		int i;
		int j;
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
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row < col)
		{
			min = row;
		}
		else
		{
			min = col;
		}
		for (k = 0;k < min / 2;k++)
		{
			for (j = k;j < col - k - 1;j++)
			{
				System.out.printf("%d\n",array[k][j]);
			}
			for (j = k;j < row - 1 - k;j++)
			{
				System.out.printf("%d\n",array[j][col - 1 - k]);
			}
			for (j = col - 1 - k;j > k;j--)
			{
				System.out.printf("%d\n",array[row - 1 - k][j]);
			}
			for (j = row - 1 - k;j > k;j--)
			{
				System.out.printf("%d\n",array[j][k]);
			}
		}
		if (min % 2 == 1)
		{

			if (row < col)
			{
				for (i = min / 2;i < (col - min / 2);i++)
				{
				System.out.printf("%d\n",array[row / 2][i]);
				}
			}
			else if (row > col)
			{
				for (i = min / 2;i < (row - min / 2);i++)
				{
					System.out.printf("%d\n",array[i][col / 2]);
				}
			}
			else if (row == col)
			{
				System.out.printf("%d\n",array[col / 2][col / 2]);
			}
		}
		return 0;
	}

}

