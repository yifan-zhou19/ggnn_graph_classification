package <missing>;

public class GlobalMembers
{
	/*
	 * 123.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11096
	 */
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++) //??????
			{
				if ((a[i][j] >= a[i][1]) && (a[i][j] >= a[i][2]) && (a[i][j] >= a[i][3]) && (a[i][j] >= a[i][4]) && (a[i][j] >= a[i][0]) && (a[i][j] <= a[1][j]) && (a[i][j] <= a[2][j]) && (a[i][j] <= a[3][j]) && (a[i][j] <= a[4][j]) && (a[i][j] <= a[0][j]))
				{
						System.out.print(i + 1);
						System.out.print(" ");
						System.out.print(j + 1);
						System.out.print(" ");
						System.out.print(a[i][j]);
						k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}
		return 0;

	}

}

