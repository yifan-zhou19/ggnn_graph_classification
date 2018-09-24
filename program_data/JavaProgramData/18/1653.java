package <missing>;

public class GlobalMembers
{
	/*
	 * final6.cpp
	 *
	 *  Created on: 2013-1-12
	 *      Author: wangyinzhi
	 */
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		int sum = 0;
		for (int i = 0; i < m; i++)
		{
			n = m;
			int[][] a = new int[100][100];
			sum = 0;
			for (int j = 0; j < n; j++)
			{
				for (int k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (n > 1)
			{
			for (int j = 0; j < n; j++)
			{
				int min = a[j][0];
				for (int k = 0; k < n; k++)
				{
					if (a[j][k] < min)
					{
						min = a[j][k];
					}
				}
				for (int k = 0; k < n; k++)
				{
					a[j][k] = a[j][k] - min;
				}
			}
			for (int j = 0; j < n; j++)
			{
				int min = a[0][j];
				for (int k = 0; k < n; k++)
				{
					if (a[k][j] < min)
					{
						min = a[k][j];
					}
				}
				for (int k = 0; k < n; k++)
				{
					a[k][j] = a[k][j] - min;
				}
			}
			sum = sum + a[1][1];

			for (int j = 0;j < n;j++)
			{
				for (int k = 1;k < n - 1;k++)
				{
					a[j][k] = a[j][k + 1];
				}
			}
			for (int j = 0;j < n;j++)
			{
						for (int k = 1;k < n - 1;k++)
						{
							a[k][j] = a[k + 1][j];
						}
			}

			n = n - 1;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

