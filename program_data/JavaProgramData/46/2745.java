package <missing>;

public class GlobalMembers
{
	/*
	 * 1204.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: wangyinzhi
	 */
	public static int[][] a = new int[100][100];
	public static int[] b = new int[10000];
	public static int x;
	public static int y;
	public static int k = 0;
	public static int cube(int c,int x,int y)
	{
		if (x <= 0 || y <= 0)
		{
			return 0;
		}
		for (int i = c;i < y;i++)
		{
			b[k] = a[c][i];
			k++;

		}
		for (int j = c + 1;j < x;j++)
		{
			b[k] = a[j][y - 1];
			k++;

		}
		for (int r = y - 2;r >= c;r--)
		{
			b[k] = a[x - 1][r];
			k++;

		}
		for (int s = x - 2;s >= c + 1;s--)
		{
			b[k] = a[s][c];
			k++;

		}
		cube(c + 1, x - 1, y - 1);

	}
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int n;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = row * col;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		cube(0, row, col);
		for (i = 0;i < n;i++)
		{
		System.out.print(b[i]);
		System.out.print("\n");
		}
		return 0;
	}

}

