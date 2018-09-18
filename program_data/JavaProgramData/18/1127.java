package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: lenovo
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int min = 0;
		int l;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n;
		for (k = 0;k < l;k++)
		{
			sum = 0;
			int[][] a = new int[l][l];
			for (i = 0; i < l; i++)
			{
				for (j = 0; j < l; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			n = l;
			while (n > 1)
			{
				for (i = 0; i < n; i++)
				{
					min = a[i][0];
					for (j = 0; j < n; j++)
					{
						if (min > a[i][j])
						{
							min = a[i][j];
						}
					}
					for (j = 0; j < n; j++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				for (j = 0; j < n; j++)
				{
					min = a[0][j];
					for (i = 0; i < n; i++)
					{
						if (min > a[i][j])
						{
							min = a[i][j];
						}
					}
					for (i = 0; i < n; i++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				sum = sum + a[1][1];
				for (i = 1; i < n - 1; i++)
				{
					for (j = 0; j < n; j++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
				for (j = 1; j < n - 1; j++)
				{
					for (i = 0; i < n; i++)
					{
						a[i][j] = a[i][j + 1];
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

