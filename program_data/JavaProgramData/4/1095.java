package <missing>;

public class GlobalMembers
{
	/********************************************
	 *@file                                     *
	 *@author ??                              *
	 *@date   2014-1-15                         *
	 *@description                              *
	 *?????????????????        *
	 ********************************************
	 */
	public static int Main()
	{
		int col;
		int row;
		int[][] array = new int[110][110];
		int i;
		int j;
		int p = 0;
		int q = 0;
		int sum;
		int count = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		sum = row * col;
		while (count != sum)
		{
			if (q != 0 && p != row - 1)
			{
				System.out.print(array[p][q]);
				System.out.print("\n");
				count++;
				p++;
				q--;
				continue;
			}
			if (q == 0 && p != row - 1)
			{
				System.out.print(array[p][q]);
				System.out.print("\n");
				count++;
				if (q != col - 2)
				{
					q = p + 1;
					p = 0;
					if (q > col - 1)
					{
					p = q - col + 1;
					q = col - 1;
					}
				}
				else if (q == col - 2)
				{
					p = p - col + 2;
					q = col - 1;
				}
				continue;
			}
			if (p == row - 1)
			{
				System.out.print(array[p][q]);
				System.out.print("\n");
				count++;
				q = p + q + 1;
				p = 0;
				if (q > col - 1)
				{
					p = q - col + 1;
					q = col - 1;
				}
			}
		}
		return 0;
	}
}

