package <missing>;

public class GlobalMembers
{
	/**
	 *@file 2.cpp
	 *@author ???
	 *@date 2013-12-03
	 *@description ????????
	 */


	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];
	public static int m;
	public static int n;

	public static void xi(int n)
	{
		int i;
		int j;
		int p;
		if (n == 0)
		{
			a[5][5] = m;
		}

		else
		{
			xi(n - 1);
			p = 0;
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					if (a[i][j] != 0)
					{
						p++;
					}
				}
			}
			p = Math.sqrt(p) / 2;
			for (i = 5 - p; i <= 5 + p; i++)
			{
				for (j = 5 - p; j <= 5 + p; j++)
				{

					b[i][j] = a[i][j];
					a[i][j] = a[i][j] * 2;
				}
			}
			for (i = 5 - p; i <= 5 + p; i++)
			{
				for (j = 5 - p; j <= 5 + p; j++)
				{
					a[i - 1][j] += b[i][j];
					a[i + 1][j] += b[i][j];
					a[i][j + 1] += b[i][j];
					a[i][j - 1] += b[i][j];
					a[i - 1][j + 1] += b[i][j];
					a[i - 1][j - 1] += b[i][j];
					a[i + 1][j + 1] += b[i][j];
					a[i + 1][j - 1] += b[i][j];


				}
			}


		}



	}

	public static int Main()
	{
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		xi(n);
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				System.out.print(a[i][j]);
				if (j <= 8)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;

	}
}

