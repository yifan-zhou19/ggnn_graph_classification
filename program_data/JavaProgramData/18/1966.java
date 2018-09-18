package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 5.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int n;
	public static int m;
	public static int imin;
	public static int[][] matrix = new int[110][110];
	public static void submin(int x, int y, int dx, int dy)
	{
		if (x == m || y == m)
		{
			return;
		}
		if (matrix[x][y] < imin)
		{
			imin = matrix[x][y];
		}
		submin(x + dx, y + dy, dx, dy);
		matrix[x][y] = matrix[x][y] - imin;
	}
	public static void sub()
	{
		int i;
		int j;
		for (i = 0; i < m; i++)
		{
			for (j = 1; j < m; j++)
			{
				matrix[i][j] = matrix[i][j + 1];
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 1; j < m; j++)
			{
				matrix[j][i] = matrix[j + 1][i];
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int sum;
		int t;
		for ((n, t = 0; t < n; t++ = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0; j < n; j++)
				{
					matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (sum = 0,m = n; m >= 1; m--)
			{
				for (i = 0; i < 2 * m; i++)
				{
					imin = 10000;
					submin((i % m) * (1 - i / m), (i % m) * (i / m), i / m, 1 - i / m);
				}
				sum = sum + matrix[1][1];
				sub();
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	}
}

