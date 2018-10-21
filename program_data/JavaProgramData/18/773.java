package <missing>;

public class GlobalMembers
{
	/*
	 * icecream.cpp
	 *
	 *  Created on: 2011-9-20
	 *      Author: 110012959
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum;
		int min;
		int m;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			sum = 0; //????
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (m = n;m > 1;m--)
			{
				for (i = 0;i < m;i++)
				{
					min = a[i][0];
					for (j = 1;j < m;j++) //???i????
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (j = 0;j < m;j++) //???????
					{
						a[i][j] = a[i][j] - min;
					}
				}
				for (j = 0;j < m;j++)
				{
					min = a[0][j];
					for (i = 1;i < m;i++) //???j????
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (i = 0;i < m;i++) //???????
					{
						a[i][j] = a[i][j] - min;
					}
				}
				sum = sum + a[1][1]; //sum????a[1][1]??
				for (i = 0;i < m;i++) //?????
				{
					for (j = 1;j < m - 1;j++)
					{
						a[i][j] = a[i][j + 1];
					}
				}
				for (j = 0;j < m - 1;j++) //?????
				{
					for (i = 1;i < m - 1;i++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
			}
					System.out.print(sum);
					System.out.print("\n");
		}
		return 0;
	}
}

