package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012809-38.cpp
	 *
	 *  Created on: 2010-11-17
	 *      Author: dell
	 */
	public static int Main()
	{
		int i;
		int s = 0;
		int j;
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
			for (j = 0;j < 5;j++)
			{
				if (((((a[i][j] - a[i][0]) > 0) + ((a[i][j] - a[i][1]) > 0) + ((a[i][j] - a[i][2]) > 0) + ((a[i][j] - a[i][3]) > 0) + ((a[i][j] - a[i][4]) > 0)) == 4) && (((a[i][j] - a[0][j]) < 0) + ((a[i][j] - a[1][j]) < 0) + ((a[i][j] - a[2][j]) < 0) + ((a[i][j] - a[3][j]) < 0) + ((a[i][j] - a[4][j]) < 0) == 4))
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					s = 1;
				}
			}
		}
		if (s == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

