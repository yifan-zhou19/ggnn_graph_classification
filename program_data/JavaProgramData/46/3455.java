package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int xx_col;
	int sx_col;
	int xx_row;
	int sx_row;
	int row;
	int col;
	int k;
	int i;
	int[][] a = new int[100][100];
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
	for (k = 0;k < row;k++)
	{
		for (i = 0;i < col;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k][i] = Integer.parseInt(tempVar3);
			}
		}
	}
	xx_col = 0;
	xx_row = 0;
	sx_col = col - 1;
	sx_row = row - 1;
	for (;xx_col <= sx_col != 0 && xx_row <= sx_row;xx_col++, xx_row++, sx_col--, sx_row--)
	{
		if (xx_col != sx_col && xx_row != sx_row)
		{
		for (i = xx_col;i < sx_col;i++)
		{
			System.out.printf("%d\n",a[xx_row][i]);
		}
		for (i = xx_row;i < sx_row;i++)
		{
			System.out.printf("%d\n",a[i][sx_col]);
		}
		for (i = sx_col;i > xx_col;i--)
		{
			System.out.printf("%d\n",a[sx_row][i]);
		}
		for (i = sx_row;i > xx_row;i--)
		{
			System.out.printf("%d\n",a[i][xx_col]);
		}
		}
		else if (xx_col == sx_col)
		{
			for (i = xx_row;i <= sx_row;i++)
			{
				System.out.printf("%d\n",a[i][xx_col]);

			}
		}
		else if (xx_row == sx_row)
		{
			for (i = xx_col;i <= sx_col;i++)
			{
				System.out.printf("%d\n",a[xx_row][i]);

			}
		}
	}
	return 0;
	}
}

