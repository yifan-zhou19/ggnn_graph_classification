package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int row0 = 0;
		int col0 = 0;
		int[][] a = new int[200][200];
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
		while (row0 >= 0)
		{
			if (row0 + 1 == row)
			{
				for (i = col0;i < col;i++)
				{
					System.out.printf("%d\n",a[row0][i]);
				}
				break;
			}
			if (col0 + 1 == col)
			{
				for (i = row0;i < row;i++)
				{
					System.out.printf("%d\n",a[i][col0]);
				}
				break;
			}
			if (row0 + 1 == row && col0 + 1 == col)
			{
				System.out.printf("%d\n",a[row0][col0]);
				break;
			}
			for (i = col0;i < col;i++)
			{
				System.out.printf("%d\n",a[row0][i]);
			}
			for (i = row0 + 1;i < row;i++)
			{
				System.out.printf("%d\n",a[i][col - 1]);
			}
			for (i = col - 2;i >= col0;i--)
			{
				System.out.printf("%d\n",a[row - 1][i]);
			}
			for (i = row - 2;i >= row0 + 1;i--)
			{
				System.out.printf("%d\n",a[i][col0]);
			}
			row0++;
			col0++;
			row--;
			col--;
			if (row0 > row - 1 || col0 > col - 1)
			{
				break;
			}

		}
		return 0;
	}










}

