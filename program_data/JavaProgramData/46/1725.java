package <missing>;

public class GlobalMembers
{
	/*
	 * 1104-1.cpp
	 *
	 *  Created on: 2011-11-5
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		int i;
		int j;
		int k;
		int m;
		int s = 0;
		m = row * col;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}




		for (i = 0;i < row / 2;i++)
		{
			for (j = i;j < col - i - 1;j++)
			{
				if (s >= m)
				{
											break;
				}
				else
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					s++;
				}

			}


			for (k = i;k < row - i - 1;k++)
			{
				if (s >= m)
				{
									break;
				}
				else
				{

				System.out.print(a[k][col - i - 1]);
				System.out.print("\n");
					s++;
				}

			}


			for (j = col - i - 1;j > i;j--)
			{
				if (s >= m)
				{
									break;
				}
				else
				{
					System.out.print(a[row - 1 - i][j]);
					System.out.print("\n");
					s++;
				}

			}

			for (k = row - i - 1;k > i;k--)
			{
				if (s >= m)
				{
									break;
				}
				else
				{
					System.out.print(a[k][i]);
					System.out.print("\n");
					s++;
				}


			}





		}
		if (row % 2 != 0)
		{
			for (j = row / 2;j < col - row / 2;j++)
			{
				System.out.print(a[row / 2][j]);
				System.out.print("\n");
			}
		}

		return 0;

	}

}

