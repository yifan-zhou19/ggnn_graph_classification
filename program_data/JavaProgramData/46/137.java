package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int j;
		int flag = 1;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int topBorder = 0;
		int bottomBorder = row - 1;
		int leftBorder = 0;
		int rightBorder = col - 1;
		int x = 0;
		int y = 0;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < row * col;i++)
		{
				System.out.print(a[y][x]);
				System.out.print("\n");
			if (flag == 1)
			{
				if (x + 1 > rightBorder)
				{
					flag = 2;
					y++;
					topBorder++;
				}
				else
				{
				x++;
				}
			}
			else if (flag == 2)
			{
				if (y + 1 > bottomBorder)
				{
					flag = 3;
					x--;
					rightBorder--;
				}
				else
				{
					y++;
				}
			}
				else if (flag == 3)
				{
					if (x - 1 < leftBorder)
					{
						flag = 4;
						y--;
						bottomBorder--;
					}
					else
					{
						x--;
					}
				}
				else
				{
					if (y - 1 < topBorder)
					{
						flag = 1;
						x++;
						leftBorder++;
					}
					else
					{
						y--;
					}
				}
		}
		return 0;
	}
}

