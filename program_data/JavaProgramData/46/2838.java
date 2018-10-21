package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
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
		int k;
		for (k = 0;k <= row / 2 - 1 && k <= col / 2 - 1;k++)
		{
			for (j = 0 + k;j < col - k;j++)
			{
				System.out.printf("%d\n",a[k][j]);
			}
			for (i = 1 + k;i < row - k;i++)
			{
				System.out.printf("%d\n",a[i][col - 1 - k]);
			}
			for (j = col - 2 - k;j >= k;j--)
			{
				System.out.printf("%d\n",a[row - 1 - k][j]);
			}
			for (i = row - 2 - k;i >= k + 1;i--)
			{
				System.out.printf("%d\n",a[i][k]);
			}
		}
		if (row > col && col % 2 != 0)
		{
			for (i = k;i < row - k;i++)
			{
				System.out.printf("%d\n",a[i][col / 2]);
			}
		}
		if (row < col && row % 2 != 0)
		{
			for (j = k;j < col - k;j++)
			{
				System.out.printf("%d\n",a[row / 2][j]);
			}
		}
		if (row == col && row % 2 != 0)
		{
			System.out.printf("%d",a[row / 2][col / 2]);
		}
	}
}

