package <missing>;

public class GlobalMembers
{
	/*
	 * matrix multiplication.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: Administrator
	 */


	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[110][110];
		int[][] b = new int[110][110];
		int[][] c = new int[110][110];
		int num;
		int i;
		int j;
		int k;

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i][j] = num;
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
				num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i][j] = num;
			}
		}

		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				for (k = 0; k < y1; k++)
				{
					c[i][j] = a[i][k] * b[k][j] + c[i][j];
				}
			}
		}

		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				if (j < y2 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

