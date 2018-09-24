package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int i;
		int j;
		int row;
		int col;
		int rowc;
		int colc;
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
		for (i = 0;i < row + col - 1;i++)
		{
			for (j = i;j >= 0;j--)
			{
				colc = j;
				rowc = i - j;
				if (colc >= col)
				{
					continue;
				}
				if (row > col && rowc >= row)
				{
					continue;
				}
				if (col >= row != 0 && rowc == row)
				{
					break;
				}
				System.out.printf("%d\n",a[rowc][colc]);
			}
		}
		return 0;
	}
}

