package <missing>;

public class GlobalMembers
{
	/*
	 * ju.cpp
	 *
	 *  Created on: 2012-10-31
	 *      Author: 7
	 */
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i = 0;
		int j;
		int k;
		int l;
		int min;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i < n)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (l = 0;l < n - 1;l++)
			{
				for (j = 0;j < n - l;j++)
				{
					min = a[j][0];
								for (k = 0;k < n - l;k++)
								{
									if (min > a[j][k])
									{
										min = a[j][k];
									}
								}
								for (k = 0;k < n - l;k++)
								{
									a[j][k] -= min;
								}
				}
				for (k = 0;k < n - l;k++)
				{
					min = a[0][k];
								for (j = 0;j < n - l;j++)
								{
									if (min > a[j][k])
									{
										min = a[j][k];
									}
								}
								for (j = 0;j < n - l;j++)
								{
									a[j][k] -= min;
								}
				}
				sum += a[1][1];
				for (j = 0;j < n - l;j++)
				{
					for (k = 1;k < n - l;k++)
					{
						a[j][k] = a[j][k + 1];
					}
				}
				for (k = 0;k < n - l;k++)
				{
					for (j = 1;j < n - l;j++)
					{
						a[j][k] = a[j + 1][k];
					}
				}
			}
			//sum+=a[0][0];
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
			i++;
		}
	}

}

