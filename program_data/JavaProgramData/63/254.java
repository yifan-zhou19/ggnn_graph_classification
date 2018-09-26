package <missing>;

public class GlobalMembers
{
	/*
	 * 05.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int x1;
		int y1;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[x1][y1]; //????a
		int i;
		int j;
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x2;
		int y2;
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[x2][y2]; //????b
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] c = new int[x1][y2];
		int k;
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				int sum = 0;
				for (k = 0;k < y1;k++)
				{
					sum = sum + a[i][k] * b[k][j]; //????
				}
				c[i][j] = sum; //??????????c?
			}
		}
		for (i = 0;i < x1;i++)
		{
			System.out.print(c[i][0]);
			for (j = 1;j < y2;j++)
			{
				System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

