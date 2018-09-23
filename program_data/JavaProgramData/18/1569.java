package <missing>;

public class GlobalMembers
{
	/*
	 * matrix_sub.cpp
	 *
	 *  Created on: 2012-12-28
	 *      Author: 12001
	 */



	public static int Main()
	{
		int n;
		int[][] matrix = new int[100][100];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			int sum = 0;
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					matrix[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int m = n; m > 1; m--)
			{
				// for line
				for (int j = 0; j < m; j++)
				{
					int min = matrix[j][0];
					for (int k = 1; k < m; k++)
					{
						if (matrix[j][k] < min)
						{
							min = matrix[j][k];
						}
					}
					for (int k = 0; k < m; k++)
					{
						matrix[j][k] -= min;
					}
				}
				// for column
				for (int j = 0; j < m; j++)
				{
					int min = matrix[0][j];
					for (int k = 1; k < m; k++)
					{
						if (matrix[k][j] < min)
						{
							min = matrix[k][j];
						}
					}
					for (int k = 0;k < m;k++)
					{
						matrix[k][j] -= min;
					}
				}

				sum += matrix[1][1];
				for (int i = 1; i < m; i++)
				{
					for (int j = 1; j < m; j++)
					{
						matrix[i][j] = matrix[i + 1][j + 1];
					}
					matrix[0][i] = matrix[0][i + 1];
					matrix[i][0] = matrix[i + 1][0];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

