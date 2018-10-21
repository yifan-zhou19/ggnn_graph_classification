package <missing>;

public class GlobalMembers
{
	/*
	 * 2.Cap
	 *
	 *  Created on: 2011-11-22
	 *      Author: Administrator
	 */

	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];
	public static void born(int i, int j)
	{
		int num = b[i][j];
		if (i > 1)
		{
			a[i - 1][j] += num;
		}
		if (i > 1 && j > 1)
		{
			a[i - 1][j - 1] += num;
		}
		if (j > 1)
		{
			a[i][j - 1] += num;
		}
		if (i < 9 && j > 1)
		{
			a[i + 1][j - 1] += num;
		}
		if (i < 9)
		{
			a[i + 1][j] += num;
		}
		if (i < 9 && j < 9)
		{
			a[i + 1][j + 1] += num;
		}
		if (j < 9)
		{
			a[i][j + 1] += num;
		}
		if (i > 1 && j < 9)
		{
			a[i - 1][j + 1] += num;
		}
		a[i][j] += num;
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (k = 1; k <= n; k++)
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					b[i][j] = a[i][j];
				}

			}
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					born(i, j);
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 8; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}
		return 0;
	}


}

