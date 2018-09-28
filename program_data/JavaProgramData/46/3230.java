package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : ex4.6.cpp
	// Author      : Zhang Yu
	// Version     :
	// Copyright   : Your copyright notice
	// Description : ????????
	//============================================================================

	public static int[][] array = new int[100][100];

	public static int Main()
	{
		int row;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int col;
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= row - 1;++i)
		{
			for (int j = 0;j <= col - 1;++j)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int row0 = 0;
		int col0 = 0;
		int row1 = row;
		int col1 = col;
		for (;;)
		{
			for (int j = col0;j <= col1 - 1;++j) //????????
			{
				System.out.print(array[row0][j]);
				System.out.print("\n");
			}
			++row0; //?????????
			for (int k = row0;k <= row1 - 1;++k) //????????
			{
				System.out.print(array[k][col1 - 1]);
				System.out.print("\n");
			}
			--col1; //?????????
			for (int p = col1 - 1;row1 - 1 >= row0 != 0 && p >= col0;--p) //????????
			{
				System.out.print(array[row1 - 1][p]);
				System.out.print("\n");
			}
			--row1; //?????????
			for (int q = row1 - 1;col0 <= col1 - 1 && q >= row0;--q) //????????
			{
				System.out.print(array[q][col0]);
				System.out.print("\n");
			}
			++col0; //?????????
			if (row0 >= row1 != 0 || col0 >= col1)
			{
				break;
			}
		}
		return 0;
	}
}

