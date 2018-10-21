package <missing>;

public class GlobalMembers
{
	/*
	 * bianli2.cpp
	 *
	 *  Created on: 2011-11-5
	 *      Author: 1100012857
	 */

	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int lu_x = 0;
		int lu_y = 0;
		int rd_x = row - 1;
		int rd_y = col - 1;
		while (lu_x < rd_x && lu_y < rd_y)
		{
			   for (j = lu_y;j <= rd_y;j++)
			   {
				   System.out.print(a[lu_x][j]);
				   System.out.print("\n");
			   }
			   for (i = lu_x + 1;i <= rd_x;i++)
			   {
				   System.out.print(a[i][rd_y]);
				   System.out.print("\n");
			   }
			   for (j = rd_y - 1;j >= lu_y;j--)
			   {
				   System.out.print(a[rd_x][j]);
				   System.out.print("\n");
			   }
			   for (i = rd_x - 1;i >= lu_x + 1;i--)
			   {
				   System.out.print(a[i][lu_y]);
				   System.out.print("\n");
			   }
			   lu_x++;
			   lu_y++;
			   rd_x--;
			   rd_y--;
		}
		if (lu_x == rd_x)
		{
			for (j = lu_y;j <= rd_y;j++)
			{
				System.out.print(a[lu_x][j]);
				System.out.print("\n");
			}
		}
		else
		{
			for (i = lu_x;i <= rd_x;i++)
			{
				System.out.print(a[i][rd_y]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

