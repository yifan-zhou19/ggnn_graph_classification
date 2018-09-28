package <missing>;

public class GlobalMembers
{
	/*
	 * ??(6-4) ??????????
	 *
	 *  Created on: 2012-12-12
	 *      Author: zhuyongfu
	 */



	public static int row; //???????
	public static int col;
	public static int[][] array = new int[101][101]; //???????
	public static int[] p = array; //???????
	public static int f(int m,int n)
	{
		int i;
		if (m == row - 1 && n == col - 1) //????
		{
			System.out.print((p[m] + n));
			return 0;
		}
		for (i = 0;m + i <= row - 1 && n - i >= 0;i++) //????
		{
			System.out.print((p[m + i] + n - i));
			System.out.print("\n");
		}
		if (n < col - 1) //????
		{
			return f(0, n + 1);
		}
		if (n >= col - 1) //????
		{
			return f(m + 1, col - 1);
		}
	}


	public static int Main()
	{
		int i; //??????
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++) //????
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		f(0, 0);
		return 0;
	}
}

