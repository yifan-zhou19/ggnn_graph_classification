package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11294
	 */
	public static int Main()
	{
		//??????
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[][] c = new int[5][5];
		int i;
		int j;
		int w;
		//????
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i][j] = a[i][j];
				c[i][j] = a[i][j];
			}
		}
		//?b?c????????????????????
		for (i = 0;i < 5;i++)
		{ //??b[i][4]?????
			for (j = 0;j <= 3;j++)
			{
				if (b[i][j] > b[i][j + 1])
				{
					w = b[i][j];
					b[i][j] = b[i][j + 1];
					b[i][j + 1] = w;
				}
			}
		}
		for (j = 0;j < 5;j++)
		{ //??c[4][j]?????
			for (i = 0;i <= 3;i++)
			{
				if (c[i][j] < c[i + 1][j])
				{
					w = c[i][j];
					c[i][j] = c[i + 1][j];
					c[i + 1][j] = w;
				}
			}
		}
		//????,???????,????
		int p = 0;
		int x;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] == b[i][4] && a[i][j] == c[4][j])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					x = a[i][j];
					p++;
					break;
				}
			}
		}
		//??????,???????
		if (p == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	} //?????

}

