package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i = 0;
		int j = 0;
		int[][] ar = new int[101][101];
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
					ar[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

	if (row == col)
	{
		for (i = 0;i <= col - 1;i++)
		{
			for (j = 0;j <= i;j++)
			{
				System.out.printf("%d\n",ar[j][i - j]);
			}
		}

		for (i = col;i <= row + col - 2;i++)
		{
			for (j = col - 1;j >= i - row + 1;j--)
			{
				System.out.printf("%d\n",ar[i - j][j]);
			}
		}
	}

	if (row > col)
	{
		for (i = 0;i <= col - 1;i++)
		{
			for (j = 0;j <= i;j++)
			{
				System.out.printf("%d\n",ar[j][i - j]);
			}
		}

		for (i = col;i <= row - 1;i++)
		{
			for (j = col - 1;j >= 0;j--)
			{
				System.out.printf("%d\n",ar[i - j][j]);
			}
		}

		for (i = row;i <= row + col - 2;i++)
		{
			for (j = col - 1;j >= i - row + 1;j--)
			{
				System.out.printf("%d\n",ar[i - j][j]);
			}
		}
	}

	if (row < col)
	{
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= i;j++)
			{
				System.out.printf("%d\n",ar[j][i - j]);
			}
		}

		for (i = row;i <= col - 1;i++)
		{
			for (j = 0;j <= row - 1;j++)
			{
				System.out.printf("%d\n",ar[j][i - j]);
			}
		}

		for (i = col;i <= row + col - 2;i++)
		{
			for (j = col - 1;j >= i - row + 1;j--)
			{
				System.out.printf("%d\n",ar[i - j][j]);
			}
		}
	}

		return 0;
	}
}

