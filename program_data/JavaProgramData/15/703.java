package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][1000];
		int[][] b = new int[1000][1000];
		int row;
		int col;
		int ROW1;
		int COL1;
		int ROW2;
		int COL2;
		int sum;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (row = 0;row < n;row++)
			{
				for (col = 0;col < n;col++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[row][col] = Integer.parseInt(tempVar2);
					}
				}
			}
		for (row = 0;row < n;row++)
		{
				for (col = 0;col < n;col++)
				{
					if (a[row][col] == 0)
					{
					ROW1 = row;
					COL1 = col;
						break;
					}
				}
		}
	for (row = n - 1;row >= 0;row--)
	{
				for (col = n - 1;col >= 0;col--)
				{
					if (a[row][col] == 0)
					{
						ROW2 = row;
						COL2 = col;
						break;
					}
				}
	}
	sum = (ROW2 - ROW1 + 1) * (COL1 - COL2 + 1);

	System.out.printf("%d",sum);

		return 0;
	}


}

