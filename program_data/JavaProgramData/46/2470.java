package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int i;
		int j;
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int num = 0;
		int n = 0;
		for (n = 0;n <= 500;n++)
		{
			for (int i1 = n;i1 <= col - n - 1;i1++)
			{
				System.out.print(a[n][i1]);
				System.out.print("\n");
				num += 1;
			}
			if (num >= row * col)
			{
				break;
			}
			for (int i2 = n + 1;i2 <= row - n - 1;i2++)
			{
				System.out.print(a[i2][col - n - 1]);
				System.out.print("\n");
				num++;
			}
			if (num >= row * col)
			{
				break;
			}
			for (int i3 = col - n - 2;i3 >= n;i3--)
			{
				System.out.print(a[row - n - 1][i3]);
				System.out.print("\n");
				num++;
			}
			if (num >= row * col)
			{
				break;
			}
			for (int i4 = row - n - 2;i4 > n;i4--)
			{
				System.out.print(a[i4][n]);
				System.out.print("\n");
				num++;
			}
			if (num >= row * col)
			{
				break;
			}
		}
		return 0;
	}

}

