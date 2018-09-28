package <missing>;

public class GlobalMembers
{
	/*
	 * 6.cpp
	 *
	 *  Created on: 2012-11-9
	 *      Author: AK
	 */
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int head;
		int bottom;
		int left;
		int right;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		head = 0,bottom = row - 1,left = 0,right = col - 1;
		i = 0;
		for (;head <= bottom != 0 && left <= right;)
		{
			if (head > bottom || left > right)
			{
				break;
			}
			for (j = left;j <= right;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
			j--;
			head++;
			if (head > bottom || left > right)
			{
				break;
			}
			for (i = head;i <= bottom;i++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
			i--;
			right--;
			if (head > bottom || left > right)
			{
				break;
			}
			for (j = right;j >= left;j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
			j++;
			bottom--;
			if (head > bottom || left > right)
			{
				break;
			}
			for (i = bottom;i >= head;i--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
			i++;
			left++;
		}
		return 0;
	}
}

