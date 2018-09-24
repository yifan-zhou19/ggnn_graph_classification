package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int row;
		int col;
		int i;
		int j;
		int x;
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
		if (row < col)
		{
			for (i = 0;i < row;i++)
			{
				for (j = 0;j <= i;j++)
				{
					System.out.printf("%d\n",a[0 + j][i - j]);
				}
			}
			for (i = 0;i < col - row - 1;i++)
			{
				for (j = 0;j < row;j++)
				{
					System.out.printf("%d\n",a[j][row + i - j]);
				}
			}
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < row - i;j++)
				{
					System.out.printf("%d\n",a[i + j][col - 1 - j]);
				}
			}
		}
		else
		{
			for (i = 0;i < col;i++)
			{
				for (j = 0;j <= i;j++)
				{
					System.out.printf("%d\n",a[0 + j][i - j]);
				}
			}

			for (i = 0;i < row - col - 1;i++)
			{
				for (j = 0;j < col;j++)
				{
					System.out.printf("%d\n",a[i + j + 1][col - j - 1]);
				}
			}
			if (row == col)
			{
				x = 1;
			}
			else
			{
				x = 0;
			}

			for (i = x;i < col;i++)
			{
				for (j = 0;j < col - i;j++)
				{
					System.out.printf("%d\n",a[row - col + i + j][col - j - 1]);
				}
			}


		}
	  return 0;

	}

}

