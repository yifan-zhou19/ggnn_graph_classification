package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int[] maxcolIndex = new int[8];
		int row;
		int col;
		int i;
		int flag = 0;
		int ROW;
		int COL;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < ROW;row++)
		{
			for (col = 0;col < COL;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (row = 0;row < ROW;row++)
		{
			maxcolIndex[row] = 0;
			for (col = 0;col < COL;col++)
			{
				if (a[row][col] > a[row][maxcolIndex[row]])
				{
					maxcolIndex[row] = col;
				}
			}
		}
		for (row = 0;row < ROW;row++)
		{
			for (i = 0;i < ROW;i++)
			{
				if (a[i][maxcolIndex[row]] < a[row][maxcolIndex[row]])
				{
					break;
				}
				if (a[i][maxcolIndex[row]] >= a[row][maxcolIndex[row]] != 0 && i == ROW - 1)
				{
					System.out.printf("%d+%d",row,maxcolIndex[row]);
					flag = 1;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

