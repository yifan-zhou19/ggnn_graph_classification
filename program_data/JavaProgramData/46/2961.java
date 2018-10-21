package <missing>;

public class GlobalMembers
{
	public static void T(int N, int M, int row, int col, int[][] array)
	{
		if (N > row || M > col)
		{
			return;
		}
		for (int j = M;j <= col;j++)
		{
			if (array[N][j] != INT_MAX)
			{
				System.out.print(array[N][j]);
				System.out.print("\n");
				array[N][j] = INT_MAX;
			}
		}
		for (int i = N + 1;i <= row;i++)
		{
			if (array[i][col] != INT_MAX)
			{
				System.out.print(array[i][col]);
				System.out.print("\n");
				array[i][col] = INT_MAX;
			}
		}
		for (int j = col - 1;j >= M;j--)
		{
			if (array[row][j] != INT_MAX)
			{
				System.out.print(array[row][j]);
				System.out.print("\n");
				array[row][j] = INT_MAX;
			}
		}
		for (int i = row - 1;i >= N + 1;i--)
		{
			if (array[i][M] != INT_MAX)
			{
				System.out.print(array[i][M]);
				System.out.print("\n");
				array[i][M] = INT_MAX;
			}
		}
		T(N + 1, M + 1, row - 1, col - 1, array);
	}
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		T(0, 0, row - 1, col - 1, array);
		return 0;
	}
}

