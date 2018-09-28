package <missing>;

public class GlobalMembers
{
	/*
	 * 321.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */

	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static void fanzhi(int n)
	{
		if (n == 0)
		{
			return;
		}
		int i;
		int j;
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (a[i][j] != 0)
				{
					b[i][j] = b[i][j] + a[i][j] * 2;
					b[i][j + 1] = b[i][j + 1] + a[i][j];
					b[i + 1][j + 1] = b[i + 1][j + 1] + a[i][j];
					b[i - 1][j + 1] = b[i - 1][j + 1] + a[i][j];
					b[i][j - 1] = b[i][j - 1] + a[i][j];
					b[i - 1][j - 1] = b[i - 1][j - 1] + a[i][j];
					b[i + 1][j - 1] = b[i + 1][j - 1] + a[i][j];
					b[i + 1][j] = b[i + 1][j] + a[i][j];
					b[i - 1][j] = b[i - 1][j] + a[i][j];
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i][j];
					b[i][j] = 0;

				}
		}
		fanzhi(n - 1);


	}


	public static int Main()
	{
		int i;
		int j;
	int m;
	int n;

	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < 9;i++)
	{
		for (j = 0;j < 9;j++)
		{
			a[i][j] = 0;
			if (i == 4 && j == 4)
			{
				a[i][j] = m;
			}
			  b[i][j] = 0;
		}
	}
	fanzhi(n);



	for (i = 0;i < 9;i++)
	{
		for (j = 0;j < 9;j++)
		{
			if (j != 8)
			{
	System.out.print(a[i][j]);
	System.out.print(" ");
			}
			else
			{
				System.out.print(a[i][j]);
			}
		}
		System.out.print("\n");
	}

	}



}

