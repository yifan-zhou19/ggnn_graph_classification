package <missing>;

public class GlobalMembers
{
	/*
	 * Matrix.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: user
	 */



	public static int[][] matrix = new int[100][100];
	public static int sum = 0;

	public static void SUM(int n)
	{
		if (n == 1)
		{
			return;
		}
		int i;
		int j;

		//??
		//??
		int min;
		for (i = 0; i < n; i++)
		{
			min = matrix[i][0];
			for (j = 0; j < n; j++)
			{
				if (min > matrix[i][j])
				{
					min = matrix[i][j];
				}
			}

			for (j = 0; j < n; j++)
			{
				matrix[i][j] -= min;
			}
		}
		//??
		for (j = 0; j < n; j++)
		{
			min = matrix[0][j];
			for (i = 0; i < n; i++)
			{
				if (min > matrix[i][j])
				{
					min = matrix[i][j];
				}
			}

			for (i = 0; i < n; i++)
			{
				matrix[i][j] -= min;
			}
		}

		sum += matrix[1][1];

		//???
		for (j = 1; j < n - 1; j++)
		{
			matrix[0][j] = matrix[0][j + 1];
		}

		for (i = 1; i < n - 1; i++)
		{
			matrix[i][0] = matrix[i + 1][0];
		}

		for (i = 1; i < n - 1; i++)
		{
			for (j = 1; j < n - 1; j++)
			{
				matrix[i][j] = matrix[i + 1][j + 1];
			}
		}

		SUM(n - 1);

	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					matrix[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			SUM(n);
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}

		return 0;
	}

}

