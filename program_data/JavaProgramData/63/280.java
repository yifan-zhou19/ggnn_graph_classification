package <missing>;

public class GlobalMembers
{
	/*
	 * eamm.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: 1000012763
	 *      ????
	 */

	public static int Main()
	{

		//????1
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[x1][y1];
		for (int i = 0; i < x1; i++)
		{
			for (int j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		//????2
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[x2][y2];
		for (int i = 0; i < x2; i++)
		{
			for (int j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		//????????
		int x;
		int y;
		if (x1 >= y1)
		{
			x = x1 > x2 != 0 ? x1 : x2;
		}
		else
		{
			x = x1 < x2 != 0 ? x1 : x2;
		}
		if (x2 <= y2)
		{
			y = y1 > y2 != 0 ? y1 : y2;
		}
		else
		{
			y = y1 < y2 != 0 ? y1 : y2;
		}

		//???????
		int[][] c = new int[x][y];
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				c[i][j] = 0;
			}
		}
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				for (int k = 0; k < y1; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}

		//????
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y - 1; j++)
			{
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
			System.out.print(c[i][y - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

