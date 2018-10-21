package <missing>;

public class GlobalMembers
{
	public static int min(int x,int y)
	{
		if (x <= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int ROW;
		int COL;
		int i;
		int m = 1;
		int n = 0;
		int x;
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
		x = min(ROW, COL);
		row = 0;
		col = 0;
		for (i = 0;i < x + x * (x - 1) / 2;i++)
		{
			System.out.printf("%d\n",a[row][col]);
			n++;
			if (n != m)
			{
				row++;
				col--;
			}
			else if (n == m)
			{
				row = 0;
				col += m;
				m++;
				n = 0;
			}
		}
		if (COL >= ROW)
		{
			row = 0;
			col = ROW;
			m = col + 1;
			for (i = 0;i < ROW * (COL - ROW);i++)
			{
				System.out.printf("%d\n",a[row][col]);
				if (row != ROW - 1)
				{
					row++;
					col--;
				}
				else
				{
					row = 0;
					col = m;
					m++;
				}
			}
			row = 1;
			col = COL - 1;
			m = ROW - 1;
			n = 0;
			for (i = 0;i < ROW * (ROW - 1) / 2;i++)
			{
				n++;
				System.out.printf("%d\n",a[row][col]);
				if (n != m)
				{
					row++;
					col--;
				}
				else
				{
					row = ROW - m + 1;
					col = COL - 1;
					m--;
					n = 0;
				}
			}
		}
		if (COL < ROW)
		{
			row = 1;
			col = COL - 1;
			m = 2;
			for (i = 0;i < COL * (ROW - COL);i++)
			{
				System.out.printf("%d\n",a[row][col]);
				if (col != 0)
				{
					row++;
					col--;
				}
				else
				{
					row = m;
					col = COL - 1;
					m++;
				}
			}
			row = ROW - COL + 1;
			col = COL - 1;
			m = COL - 1;
			n = 0;
			for (i = 0;i < COL * (COL - 1) / 2;i++)
			{
				n++;
				System.out.printf("%d\n",a[row][col]);
				if (n != m)
				{
					row++;
					col--;
				}
				else
				{
					row = ROW - m + 1;
					col = COL - 1;
					m--;
					n = 0;
				}
			}
		}
		return 0;
	}

}

