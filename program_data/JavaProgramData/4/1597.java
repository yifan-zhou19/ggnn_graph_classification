package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
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
		int i;
		int j;
		int[][] a = new int[100][100];
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
		if (row >= col)
		{
			for (i = 0;i < row + col - 1;i++)
			{
				if (i >= 0 && i < col)
				{
				for (j = i;j >= 0;j--)
				{
					System.out.printf("%d\n",a[i - j][j]);
				}
				}
				if (i >= col != 0 && i < row)
				{
					for (j = col - 1;j >= 0;j--)
					{
						System.out.printf("%d\n",a[i - j][j]);
					}
				}
				if (i > row - 1 && i < (row + col) - 1)
				{
					for (j = col - 1;j > i - row;j--)
					{
						System.out.printf("%d\n",a[i - j][j]);
					}
				}

			}
		}
		if (col > row)
		{
			for (j = 0;j < row + col;j++)
			{
				if (j >= 0 && j < row)
				{
				for (i = 0;i <= j;i++)
				{
					System.out.printf("%d\n",a[i][j - i]);
				}
				}
				if (j >= row != 0 && j < col)
				{
					for (i = 0;i < row;i++)
					{
						System.out.printf("%d\n",a[i][j - i]);
					}
				}
				if (j > col - 1 && j < (row + col) - 1)
				{
					for (i = j - col + 1;i < row;i++)
					{
						System.out.printf("%d\n",a[i][j - i]);
					}
				}

			}
		}
	}
}

