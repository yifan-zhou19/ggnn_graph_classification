package <missing>;

public class GlobalMembers
{
	public static void print(int[][] a, int row, int col, int b, int c)
	{
		int i;
		for (i = c;i <= col;i++)
		{
			System.out.printf("%d\n",a[b][i]);
		}
		for (i = b + 1;i <= row;i++)
		{
			System.out.printf("%d\n",a[i][col]);
		}
		if (row > b)
		{
		for (i = col - 1;i >= c;i--)
		{
			System.out.printf("%d\n",a[row][i]);
		}
		}
		if (col > c)
		{
		for (i = row - 1;i >= b + 1;i--)
		{
			System.out.printf("%d\n",a[i][c]);
		}
		}
		row--;
		col--;
		b++;
		c++;
		if (row - b >= 0 && col - c >= 0)
		{
			print(a, row, col, b, c);
		}

	}
	public static void Main()
	{
		int col;
		int row;
		int i;
		int j;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		print(a, row - 1, col - 1, 0, 0);
	}

}

