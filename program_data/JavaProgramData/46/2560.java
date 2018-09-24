package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row = 0;
		int col = 0;
		int sumtimes = 0;
		int i = 0;
		int j = 0;
		int sum = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int max = row > col != 0 ? row : col;
		int[][] a = new int[row][col];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (sum < row * col)
		{
			for (j = sumtimes / 4; j <= col - 1 - sumtimes / 4; j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			sumtimes++;
			for (i = sumtimes / 4 + 1; i <= row - 1 - sumtimes / 4 - 1; i++)
			{
				System.out.print(a[i][j - 1]);
				System.out.print("\n");
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			sumtimes++;
			for (j--; j >= sumtimes / 4; j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			sumtimes++;
			for (i--; i >= sumtimes / 4 + 1; i--)
			{
				System.out.print(a[i][j + 1]);
				System.out.print("\n");
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			i++;
			sumtimes++;

		}
		return 0;
	}

}

