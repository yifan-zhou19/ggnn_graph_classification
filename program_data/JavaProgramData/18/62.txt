package <missing>;

public class GlobalMembers
{
	/*
	 * file    homework 10_1
	 * author  ??
	 * date    2010-12-03
	 * description
	           ?????????????????a[1][1]??
	*/



	public static int Matrix(int[][] a, int sum, int n)
	{
		int i;
		int j;
		int min;
		if (n == 1)
		{
			System.out.print(sum);
			System.out.print("\n");
			return 0;
		}
		for (i = 0; i < n; i++)
		{
			min = a[i][0];
			for (j = 1; j < n; j++)
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
		for (i = 0; i < n; i++)
		{
			min = a[0][i];
			for (j = 1; j < n; j++)
			{
				if (min > a[j][i])
				{
					min = a[j][i];
				}
			}
			for (j = 0; j < n; j++)
			{
				a[j][i] = a[j][i] - min;
			}
		}
		sum = sum + a[1][1];
		for (i = 0; i < n; i++)
		{
			for (j = 2; j < n; j++)
			{
				a[i][j - 1] = a[i][j];
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = 2; j < n; j++)
			{
				a[j - 1][i] = a[j][i];
			}
		}
		Matrix(a, sum, n - 1);
		return 0;
	}

	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			Matrix(a, sum, n);
		}
		return 0;
	}
}

