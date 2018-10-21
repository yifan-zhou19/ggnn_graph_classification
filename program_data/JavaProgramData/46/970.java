package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ROW;
		int COL;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (int row = 0;row < ROW;row++)
		{
			for (int col = 0;col < COL;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int k = 0;k < (ROW < COL != 0?(ROW + 1) / 2:(COL + 1) / 2);k++)
		{
			for (int col = k;col < COL - k - 1;col++)
			{
				System.out.printf("%d\n",a[k][col]);
			}
			for (int row = k;row < ROW - k - 1;row++)
			{
				System.out.printf("%d\n",a[row][COL - k - 1]);
			}
			for (int col = COL - k - 1;(col > k) && (k != 1.0 * (ROW + 1) / 2 - 1);col--)
			{
				System.out.printf("%d\n",a[ROW - k - 1][col]);
			}
			for (int row = ROW - k - 1;(row > k) && (k != 1.0 * (COL + 1) / 2 - 1);row--)
			{
				System.out.printf("%d\n",a[row][k]);
			}
		}
		if ((ROW % 2 != 0 && ROW <= COL) || (COL % 2 != 0 && COL <= ROW))
		{
			System.out.printf("%d",a[ROW - (ROW < COL != 0?(ROW + 1) / 2:(COL + 1) / 2)][COL - (ROW < COL != 0?(ROW + 1) / 2:(COL + 1) / 2)]);
		}
		return 0;
	}
}

