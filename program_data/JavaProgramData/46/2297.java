package <missing>;

public class GlobalMembers
{
	/*????????
	 * bookfee.cpp
	 *
	 *  Created on: 2011-12-23
	 *      Author: WJ
	 */

	public static int Main()
	{
		int[][] a = new int[101][101];
		int i;
		int j;
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int up = 0; //??????????
		int down = row - 1;
		int left = 0;
		int right = col - 1;
		int c = row * col; //????????????????
		while (c > 0)
		{
			for (j = left; j <= right; j++)
			{
				System.out.print(a[up][j]);
				System.out.print("\n");
			}
			c -= right - left + 1;
			if (c <= 0)
			{
				break;
			}
			up++;

			for (i = up; i <= down; i++)
			{
				System.out.print(a[i][right]);
				System.out.print("\n");
			}
			c -= down - up + 1;
			if (c <= 0)
			{
				break;
			}
			right--;

			for (j = right; j >= left; j--)
			{
				System.out.print(a[down][j]);
				System.out.print("\n");
			}
			c -= right - left + 1;
			if (c <= 0)
			{
				break;
			}
			down--;

			for (i = down; i >= up; i--)
			{
				System.out.print(a[i][left]);
				System.out.print("\n");
			}
			c -= down - up + 1;
			if (c <= 0)
			{
				break;
			}
			left++;
		}
		return 0;
	}

}

