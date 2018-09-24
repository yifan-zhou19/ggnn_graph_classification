package <missing>;

public class GlobalMembers
{
	/*
	 * juzhenguiling.cpp
	 *
	 *  Created on: 2010-12-2
	 *      Author: Administrator
	 */
	public static int[][] a = new int[100][100];
	public static int zero(int n,int sum)
	{
		if (n != 1)
		{
			int min;
			int i;
			int j;
			int[][] array = new int[n][n];
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					array[i][j] = a[i][j];
				}
			}
				for (i = 0;i < n;i++)
				{ //i???
				min = array[i][0];
				for (j = 1;j < n;j++)
				{
					if (array[i][j] < min)
					{
						min = array[i][j];
					}
				}
				if (min != 0)
				{
					for (j = 0;j < n;j++)
					{
						array[i][j] = array[i][j] - min;
					}
				}
				}
			   for (i = 0;i < n;i++)
			   { //i???
				min = array[0][i];
				for (j = 1;j < n;j++)
				{
					if (array[j][i] < min)
					{
						min = array[j][i];
					}
				}
				if (min != 0)
				{
					for (j = 0;j < n;j++)
					{
						array[j][i] = array[j][i] - min;
					}
				}
			   }
		sum = sum + array[1][1];
		for (i = 0;i < n;i++)
		{ //i???
			for (j = 1;j < n - 1;j++)
			{
				a[i][j] = array[i][j] = array[i][j + 1];
			}
		}
		for (i = 0;i < n - 1;i++)
		{ //i???
			for (j = 1;j < n - 1;j++)
			{
				array[j][i] = array[j + 1][i];
			}
		}
		for (i = 0;i < n - 1;i++)
		{
				for (j = 0;j < n - 1;j++)
				{
					a[i][j] = array[i][j];
				}
		}
		return zero(n - 1, sum);
		}
		if (n == 1)
		{
			return sum;
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		int i;
		int t;
		int r;
		for (i = 1;i <= n;i++)
		{
			for (t = 0;t < n;t++)
			{
				for (r = 0;r < n;r++)
				{
					a[t][r] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(zero(n, sum));
			System.out.print("\n");
		}
		return 0;
	}


}

