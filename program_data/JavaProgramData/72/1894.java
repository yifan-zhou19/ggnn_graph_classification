package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : xunzhaoshanding.cpp
	// Author      :
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================



	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[21][21];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (a[0][0] >= a[1][0] != 0 && a[0][0] >= a[0][1])
		{
			System.out.print(0);
			System.out.print(' ');
			System.out.print(0);
			System.out.print("\n");
		}

		for (int c = 1;c < n - 1;c++)
		{
			if (a[0][c] >= a[0][c - 1] != 0 && a[0][c] >= a[0][c + 1] != 0 && a[0][c] >= a[1][c])
			{
				System.out.print(0);
				System.out.print(' ');
				System.out.print(c);
				System.out.print("\n");
			}
		}

		if (a[0][n - 1] >= a[0][n - 2] != 0 && a[0][n - 1] >= a[1][n - 1])
		{
			System.out.print(0);
			System.out.print(' ');
			System.out.print(n - 1);
			System.out.print("\n");
		}

		for (int i = 1;i < m - 1;i++)
		{
				for (int j = 0;j < n;j++)
				{
					if (j == 0)
					{
						if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
					}

					else if (j == n - 1)
					{
										if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
										{
											System.out.print(i);
											System.out.print(' ');
											System.out.print(j);
											System.out.print("\n");
										}
					}
					else
					{
						if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
					}

				}
		}

		if (a[m - 1][0] >= a[m - 2][0] != 0 && a[m - 1][0] >= a[m - 1][1])
		{
			System.out.print(m - 1);
			System.out.print(' ');
			System.out.print(0);
			System.out.print("\n");
		}

			for (int c = 1;c < n - 1;c++)
			{
				if (a[m - 1][c] >= a[m - 1][c - 1] != 0 && a[m - 1][c] >= a[m - 1][c + 1] != 0 && a[m - 1][c] >= a[m - 2][c])
				{
					System.out.print(m - 1);
					System.out.print(' ');
					System.out.print(c);
					System.out.print("\n");
				}
			}

			if (a[m - 1][n - 1] >= a[m - 1][n - 2] != 0 && a[m - 1][n - 1] >= a[m - 2][n - 1])
			{
				System.out.print(m - 1);
				System.out.print(' ');
				System.out.print(n - 1);
				System.out.print("\n");
			}
		return 0;
	}

}

