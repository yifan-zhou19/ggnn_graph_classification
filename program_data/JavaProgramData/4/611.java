package <missing>;

public class GlobalMembers
{
	/*
	 * ewsz.cpp
	 *
	 *  Created on: 2011-11-8
	 *      Author: FXD
	 */
	public static int Main()
	{
		int[][] a = new int[100][100];
		int col;
		int row;
		int t;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (row > col)
		{
			t = row;
		}
		else
		{
			t = col; //t?row?col?????
		}
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			}
		}



		for (i = 2;i <= 2 * t;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (j <= row != 0 && i - j <= col)
				{
					System.out.print(a[j][i - j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

