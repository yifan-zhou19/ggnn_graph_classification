package <missing>;

public class GlobalMembers
{
	/*
	 * ????jizhenbianyuanqiuhe.cpp
	 * ???? ?
	 *  Created on: 2012-12-19
	 * ?????????????????????????
	*/



	public static int Main()
	{
		int k = 0;
		int i = 0;
		int j = 0;
		int lin = 0;
		int col = 0;
		int[][] array = new int[105][105];
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= k; i++)
		{
			sum = 0;
			lin = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int p = 0; p < lin; p++)
			{
				for (int q = 0; q < col; q++)
				{
					*(*(array + p) + q) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (j = 0; j < col; j++)
			{
				sum = sum + array[0][j];
			}
			for (j = 1; j < lin; j++)
			{
				sum = sum + array[j][col - 1];
			}
			for (j = 0; j < (col - 1); j++)
			{
				sum = sum + array[lin - 1][j];
			}
			for (j = 1; j < (lin - 1); j++)
			{
				sum = sum + array[j][0];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

