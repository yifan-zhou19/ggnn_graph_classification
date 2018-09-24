package <missing>;

public class GlobalMembers
{
	/*
	 * huixing2.cpp
	 *
	 *  Created on: 2012-12-5
	 *      Author: wangyinzhi
	 */


	public static int mins(int x,int y)
	{
		if (x > y)
		{
			return y;
		}
		else
		{
			return x;
		}
	}

	public static int maxs(int x, int y)
	{
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
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
		int[][] a = new int[row][col];
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < mins(row, col); i++)
		{
			for (j = 0; j <= i; j++)
			{
				System.out.print(a[j][i - j]);
				System.out.print("\n");
			}
		}

			if (row >= col)
			{
				for (i = col ; i < row; i++)
				{
				for (j = i - col + 1 ; j <= i; j++)
				{
					System.out.print(a[j][i - j]);
					System.out.print("\n");
				}
				}
				for (i = row;i <= row + col - 2;i++)
				{
							for (j = i - col + 1;j < row;j++)
							{
								System.out.print(a[j][i - j]);
								System.out.print("\n");
							}
				}
			}
		   else
		   {
			for (i = row;i < col;i++)
			{
				for (j = 0;j < row;j++)
				{
					System.out.print(a[j][i - j]);
					System.out.print("\n");
				}
			}
			for (i = col;i <= row + col - 2;i++)
			{
				for (j = i - col + 1;j < row;j++)
				{
					System.out.print(a[j][i - j]);
					System.out.print("\n");

				}
			}
		   }

		return 0;
	}
}

