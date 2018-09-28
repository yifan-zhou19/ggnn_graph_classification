package <missing>;

public class GlobalMembers
{
	/*
	 * hui.cpp
	 *
	 *  Created on: 2013-11-5
	 *      Author: ??
	 */
	public static int Main()
	{
		int r;
		int c;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[r][c];
		int[][] b = new int[r + 2][c + 2];
		int[] d = new int[r * c];
		for (int ii = 0;ii < r + 2;ii++)
		{
			for (int jj = 0;jj < c + 2;jj++)
			{
				b[ii][jj] = 1;
			}
		}
		for (int i = 0;i < r;i++)
		{
			for (int j = 0;j < c;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i + 1][j + 1] = 0;
			}
		}
		int ii = 0;
		int jj = 0;
		b[1][1] = 1;
		d[0] = a[0][0];
		for (int m = 1;m < r * c;m++)
		{
			if (jj + 1 < c && b[ii + 1][jj + 1 + 1] == 0 && b[ii - 1 + 1][jj + 1] == 1 && b[ii + 1][jj - 1 + 1] == 1)
			{
				jj++;
				d[m] = a[ii][jj];
				b[ii + 1][jj + 1]++;
			}
			else if (ii + 1 < r && b[ii + 1 + 1][jj + 1] == 0 && b[ii + 1][jj + 1 + 1] == 1 && b[ii - 1 + 1][jj + 1] == 1)
			{
				ii++;
				d[m] = a[ii][jj];
				b[ii + 1][jj + 1]++;
			}
			else if (jj - 1 >= 0 && b[ii + 1][jj - 1 + 1] == 0 && b[ii + 1 + 1][jj + 1] == 1 && b[ii + 1][jj + 1 + 1] == 1)
			{
				jj--;
				d[m] = a[ii][jj];
				b[ii + 1][jj + 1]++;
			}
			else if (ii - 1 >= 1 && b[ii - 1 + 1][jj + 1] == 0 && b[ii + 1][jj - 1 + 1] == 1 && b[ii + 1 + 1][jj + 1] == 1)
			{
				ii--;
				d[m] = a[ii][jj];
				b[ii + 1][jj + 1]++;
			}
		}
		for (int f = 0;f < r * c;f++)
		{
			System.out.print(d[f]);
			System.out.print("\n");
		}
		return 0;
	}

}

