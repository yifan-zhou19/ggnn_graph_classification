package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int num = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;;i++)
		{
			if (num >= row * col)
			{
				break;
			}
			int b;
			int x;
			int y;
			int z;
			for (b = i;b < col - i;b++)
			{
				System.out.print(a[i][b]);
				System.out.print("\n");
				num++;
			}
			if (num >= row * col)
			{
				break;
			}
			for (x = i + 1;x < row - i;x++)
			{
				System.out.print(a[x][b - 1]);
				System.out.print("\n");
				num++;
			}
			if (num >= row * col)
			{
				break;
			}
			for (y = col - i - 2;y >= i;y--)
			{
				System.out.print(a[row - i - 1][y]);
				System.out.print("\n");
				num++;
			}
			if (num >= row * col)
			{
				break;
			}
			for (z = row - i - 2;z > i;z--)
			{
				System.out.print(a[z][i]);
				System.out.print("\n");
				num++;
			}
		}

		return 0;
	}
}

