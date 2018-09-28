package <missing>;

public class GlobalMembers
{
	/**
	 * @file    2.cpp
	 * @author  ???
	 * @date    2013-11-5
	 * @description
	 *          ????????? - ????????
	 */
	public static int Main()
	{
		int col;
		int row;
		int[][] a = new int[100][100];
		int state = 0;
		int[] step = new int[4];
		int curstep;
		int flag = 1;
		int[][] dir =
		{
			{0, 1},
			{1, 0},
			{0, -1},
			{-1, 0}
		};
		int[] pos = {0, 0};
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; ++i)
		{
			for (int j = 0; j < col; ++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		step[0] = col;
		step[1] = row - 1;
		step[2] = col - 1;
		step[3] = row - 2;
		curstep = step[state];
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

