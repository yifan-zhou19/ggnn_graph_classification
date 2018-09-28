package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:????????
	 ***??:2012?10?30?
	 *************************/
	public static int Main()
	{
		int row;
		int col;
		int sub_rowS;
		int sub_rowE;
		int sub_colS;
		int sub_colE;
		int times = 0;
		int i;
		int j;
		int k;
		int[][] matrix = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (sub_rowS = 0, sub_rowE = row - 1, sub_colS = 0, sub_colE = col - 1; ; sub_rowS++, sub_rowE--, sub_colS++, sub_colE--) //???????????
		{
			for (i = sub_colS; i <= sub_colE; i++)
			{
				System.out.print(matrix[sub_rowS][i]);
				System.out.print("\n");
				times++;
			}
			for (i = sub_rowS + 1; i <= sub_rowE; i++)
			{
				System.out.print(matrix[i][sub_colE]);
				System.out.print("\n");
				times++;
			}
			if (times == row * col) //????????,??
			{
				break;
			}
			for (i = sub_colE - 1; i >= sub_colS; i--)
			{
				System.out.print(matrix[sub_rowE][i]);
				System.out.print("\n");
				times++;
			}
			for (i = sub_rowE - 1; i > sub_rowS; i--)
			{
				System.out.print(matrix[i][sub_colS]);
				System.out.print("\n");
				times++;
			}
			if (times == row * col) //????????,??
			{
				break;
			}
		}
		return 0;
	}
}

