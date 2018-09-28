package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int rownum;
		int colnum;
		int i = 20;
		int j = 20;
		int[] rowmax = new int[SIZE];
		int[] colmin = new int[SIZE];
		int[][] num = new int[SIZE][SIZE];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rownum = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			colnum = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < rownum;row++)
		{
			for (col = 0;col < colnum;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (row = 0;row < rownum;row++)
		{
			rowmax[row] = num[row][0];
			for (col = 0;col < colnum;col++)
			{
				if (rowmax[row] < num[row][col])
				{
					rowmax[row] = num[row][col];
				}
				else
				{
					continue;
				}
			}
		}
		for (col = 0;col < colnum;col++)
		{
			colmin[col] = num[0][col];
			for (row = 0;row < rownum;row++)
			{
				if (colmin[col] > num[row][col])
				{
					colmin[col] = num[row][col];
				}
				else
				{
					continue;
				}
			}
		}
		for (row = 0;row < rownum;row++)
		{
			for (col = 0;col < colnum;col++)
			{
				if (rowmax[row] == colmin[col])
				{
					i = row;
					j = col;
					break;
				}
				else
				{
					continue;
				}
			}
		}
		if (i == 20 && j == 20)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d",i,j);
		}
		return 0;
	}
}

