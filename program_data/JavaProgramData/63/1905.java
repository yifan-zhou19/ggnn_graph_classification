package <missing>;

public class GlobalMembers
{
	/**
	 * @file 2.cpp
	 * @author ??? 1300012960
	 * @date 2013-11-01
	 * @description
	 * ??????: ???? */
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int tmp = 0;
		// x1 y1 x2 y2?????????  a[100][100] b[100][100]????????? tmp??????????

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= x1 - 1; i++)
		{
			for (int j = 0; j <= y1 - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= x2 - 1; i++)
		{
			for (int j = 0; j <= y2 - 1; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int k = 0; k <= x1 - 1; k++) // ????????k?l???? ????????????????
		{
			for (int l = 0; l <= y2 - 2; l++) // ????????? ????y2 - 2???
			{
				for (int m = 0; m <= y1 - 1; m++)
				{
					tmp += (a[k][m] * b[m][l]); // tmp?????+ a[k][m] * b[m][l]
				}
				System.out.print(tmp);
				System.out.print(' ');
				tmp = 0;
			}
			for (int m = 0; m <= y1 - 1; m++) // ???????? ???
			{
				tmp += (a[k][m] * b[m][y2 - 1]);
			}
			System.out.print(tmp);
			System.out.print("\n");
			tmp = 0; // tmp???0
		}
		return 0;
	}
}

