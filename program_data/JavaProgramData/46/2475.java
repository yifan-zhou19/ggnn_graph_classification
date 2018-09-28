package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int r = 0;
		int c = 0;
		int num = 0;
		int n = row * col;
		int row0 = 0;
		int col0 = 0;
		while (true)
		{
			for (; c < col; c++)
			{
				System.out.print(a[r][c]);
				System.out.print("\n");
				num++;
			}
			if (num == n)
			{
				break;
			}
			row0++;
			c--;
			r++;
			for (; r < row; r++)
			{
				System.out.print(a[r][c]);
				System.out.print("\n");
				num++;
			}
			if (num == n)
			{
				break;
			}
			col--;
			r--;
			c--;
			for (; c >= col0; c--)
			{
				System.out.print(a[r][c]);
				System.out.print("\n");
				num++;
			}
			if (num == n)
			{
				break;
			}
			row--;
			c++;
			r--;
			for (; r >= row0; r--)
			{
				System.out.print(a[r][c]);
				System.out.print("\n");
				num++;
			}
			if (num == n)
			{
				break;
			}
			col0++;
			r++;
			c++;
		}
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

