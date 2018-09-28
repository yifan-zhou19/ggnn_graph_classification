package <missing>;

public class GlobalMembers
{
	/* title:???????? *
	 * author:???*
	 * time:2011.10.28*/





	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int k;
		int h;
		int m = 0;
		int r1;
		int r2;
		int n = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r1 = row;
		r2 = col;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (m = 0; m <= r2 / 2 && m <= r1 / 2; m++)
		{
			for (j = m; j < col; j++)
			{
				n++;
				if (n > r1 * r2)
				{
					break;
				}
				System.out.print(array[m][j]);
				System.out.print("\n");
			}
			for (i = m + 1; i < row; i++)
			{
				n++;
				if (n > r1 * r2)
				{
					break;
				}
				System.out.print(array[i][col - 1]);
				System.out.print("\n");
			}
			for (k = col - 2; k >= m; k--)
			{
				n++;
				if (n > r1 * r2)
				{
					break;
				}
				System.out.print(array[row - 1][k]);
				System.out.print("\n");
			}
			for (h = row - 2; h > m; h--)
			{
				n++;
				if (n > r1 * r2)
				{
					break;
				}
				System.out.print(array[h][m]);
				System.out.print("\n");
			}
			row = row - 1;
			col = col - 1;
		}
		return 0;
	}


}

