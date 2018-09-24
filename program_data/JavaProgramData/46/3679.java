package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		/* Read data */
		int col;
		int row;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; ++i)
		{
			for (int j = 0; j < col; ++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		/* Const direction */ 
		final int[][] dir =
		{
			{0, 1},
			{1, 0},
			{0, -1},
			{-1, 0}
		};
		/* Parameter Initialization */
		/* State records current direction index, step records step size for 4 directions, curstep is current step size, pos records current position */
		int state = 0;
		int[] step = {col, row - 1, col - 1, row - 2};
		int curstep = step[state];
		int[] pos = {0, 0};
		int flag = 1;
		/* Main Solver */
		while (curstep > 0)
		{
			for (int i = 0 + flag; i < curstep; ++i)
			{
				System.out.print(a[pos[0]][pos[1]]);
				System.out.print("\n");
				pos[0] += dir[state][0];
				pos[1] += dir[state][1];
			}
			step[state] = step[state] - 2;
			state = (state+1) % 4;
			curstep = step[state];
			flag = 0;
		}
		System.out.print(a[pos[0]][pos[1]]);
		System.out.print("\n");
		return 0;
	}
}

