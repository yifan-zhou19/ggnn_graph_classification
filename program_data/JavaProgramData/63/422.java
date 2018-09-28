package <missing>;

public class GlobalMembers
{
	/*
	 * juzhen.cpp
	 *
	 *  Created on: 2010-11-24
	 *      Author: l
	 */
	public static int Main()
	{
		int i;
		int j;
		int x1;
		int y1;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[x1][y1];
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
		int[][] b = new int[x2][y2];
	for (i = 0;i < x2;i++)
	{
		for (j = 0;j < y2;j++)
		{
		b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
		int[][] c = new int[x1][y2];

		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				c[i][j] = 0;
				for (int k = 0;k < x2;k++)
				{
					c[i][j] += a[i][k] * b[k][j]; //??c???????
				}
			}
		}


		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2 - 1;j++)
			{
					System.out.print(c[i][j]);
					System.out.print(" ");
			}
		System.out.print(c[i][y2 - 1]);
		System.out.print("\n");
		; //?????
		}


		return 0;
	}

}

