package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int x;
		int y;
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
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row == col)
		{
			for (i = 0;i <= col - 1;i++)
			{
				x = i;
				for (j = 0;j <= i;j++)
				{
					System.out.printf("%d\n",array[j][x]);
					x--;
				}
			}
			for (i = 1;i <= row - 1;i++)
			{
				y = i;
				for (j = col - 1;j >= i;j--)
				{
					System.out.printf("%d\n",array[y][j]);
					y++;
				}
			}
		}
		else if (row < col)
		{
			for (i = 0;i <= row - 1;i++)
			{
				x = i;
				for (j = 0;j <= i;j++)
				{
					System.out.printf("%d\n",array[j][x]);
					x--;
				}
			}
			for (j = row;j <= col - 1;j++)
			{
				x = j;
				for (i = 0;i <= row - 1;i++)
				{
					System.out.printf("%d\n",array[i][x]);
						x--;
				}
			}
			for (i = 1;i <= row - 1;i++)
			{
				y = i;
				for (j = col - 1;j >= i + col - row;j--)
				{
					System.out.printf("%d\n",array[y][j]);
					y++;
				}
			}
		}
		else
		{
			for (i = 0;i <= col - 1;i++)
			{
				x = i;
				for (j = 0;j <= i;j++)
				{
					System.out.printf("%d\n",array[j][x]);
					x--;
				}
			}
			for (i = 1;i <= row - col;i++)
			{
				x = i;
				for (j = col - 1;j >= 0;j--)
				{
					System.out.printf("%d\n",array[x][j]);
						x++;
				}
			}
			for (i = row - col + 1;i <= row - 1;i++)
			{
				y = i;
				for (j = col - 1;j >= i - row + col;j--)
				{
					System.out.printf("%d\n",array[y][j]);
					y++;
				}
			}
		}
	}
}

