package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] jz = new int[100][100];
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
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
					jz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		System.out.printf("%d\n",jz[0][0]);

		if (row <= col)
		{
			for (m = 0,n = 1;n < col;n++)
			{
				for (i = m, j = n;j >= 0 && i < row;i++, j--)
				{
					System.out.printf("%d\n", jz[i][j]);
				}
			}
			for (m = 1,n = col - 1;m < row - 1;m++)
			{
				for (i = m,j = n;i < row;i++,j--)
				{
					System.out.printf("%d\n",jz[i][j]);
				}
			}
		}

		else if (row > col)
		{
			for (m = 0,n = 1;n < col;n++)
			{
				for (i = m, j = n;j >= 0 && i < row;i++, j--)
				{
					System.out.printf("%d\n", jz[i][j]);
				}
			}
			for (m = 1,n = col - 1;m < row - 1;m++)
			{
				for (i = m, j = n;i < row && j >= 0;i++, j--)
				{
					System.out.printf("%d\n",jz[i][j]);
				}
			}
		}
		if (row != 1)
		{
			System.out.printf("%d", jz[row - 1][col - 1]);
		}


		return 0;
	}
}

