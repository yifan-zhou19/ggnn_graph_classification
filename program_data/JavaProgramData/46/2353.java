package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] vis = new int[100][100];
		int row;
		int col;
		int n;
		int x = -1;
		int y = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				a[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		n = row * col;
		while (n != 0)
		{
			while (vis[x + 1][y] == 0 && x + 1 < col)
			{
				x++;
				vis[x][y] = 1;
				System.out.print(a[x][y]);
				System.out.print("\n");
				n--;
			}
			while (vis[x][y + 1] == 0 && y + 1 < row)
			{
				y++;
				vis[x][y] = 1;
				System.out.print(a[x][y]);
				System.out.print("\n");
				n--;
			}
			while (vis[x - 1][y] == 0 && x > 0)
			{
				x--;
				vis[x][y] = 1;
				System.out.print(a[x][y]);
				System.out.print("\n");
				n--;
			}
			while (vis[x][y - 1] == 0 && y > 0)
			{
				y--;
				vis[x][y] = 1;
				System.out.print(a[x][y]);
				System.out.print("\n");
				n--;
			}
		}


		return 0;
	}
}

