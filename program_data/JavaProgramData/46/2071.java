package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int row;
		int col;
		int i;
		int k;
		int x = 0;
		int y = 0;
		int n = 1;
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < row;i++)
			{
				for (k = 0;k < col;k++)
				{
					sz[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (n <= row * col)
			{
				for (k = y;k < (col - y - 1);k++)
				{
					System.out.print(sz[x][k]);
					System.out.print("\n");
					n++;
					if (n > row * col)
					{
						break;
					}
				}
				for (i = x;i < (row - x - 1);i++)
				{
					System.out.print(sz[i][col - y - 1]);
					System.out.print("\n");
					n++;
					if (n > row * col)
					{
						break;
					}
				}
				for (k = col - y - 1;k > y;k--)
				{
					System.out.print(sz[row - x - 1][k]);
					System.out.print("\n");
					n++;
					if (n > row * col)
					{
						break;
					}
				}
				for (i = row - x - 1;i > x;i--)
				{
					System.out.print(sz[i][y]);
					System.out.print("\n");
					n++;
					if (n > row * col)
					{
						break;
					}
				}
				if (x == (row - 1) / 2 && x == y && row == col && row % 2 == 1)
				{
					System.out.print(sz[x][y]);
					System.out.print("\n");
					n++;
				}
				x++;
				y++;
			}
		return 0;
	}
}

