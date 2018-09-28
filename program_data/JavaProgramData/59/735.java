package <missing>;

public class GlobalMembers
{
	/*
	 * lixurong5.cpp
	 *
	 *  Created on: 2012-11-11
	 *      Author: a
	 */


	public static int Main()
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][n]; //????
		int[][] b = new int[n][n]; //????
		for (int i = 0; i < n; i++) //????
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '.') //??????????
				{
					b[i][j] = 1;
				}
				else if (a[i][j] == '@')
				{
					b[i][j] = -1;
				}
				else
				{
					b[i][j] = 0;
				}

			}
		}


		int m; //????
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int x = 1; x < m; x++) //????
		{
			for (int i = 0; i < n; i++) //??
			{
				for (int j = 0; j < n; j++)
				{
					if (b[i][j] == (0 - x))
					{
						if (b[i][j + 1] == 1 && j + 1 < n) //???1?????????
						{
							b[i][j + 1] = 0 - x - 1;
						}
						if (b[i][j - 1] == 1 && j - 1 >= 0)
						{
							b[i][j - 1] = 0 - x - 1;
						}
						if (b[i + 1][j] == 1 && i + 1 < n)
						{
							b[i + 1][j] = 0 - x - 1;
						}
						if (b[i - 1][j] == 1 && i - 1 >= 0)
						{
							b[i - 1][j] = 0 - x - 1;
						}

					}
				}
			}

		}
		int s = 0;
		for (int i = 0; i < n; i++) //???????
		{
			for (int j = 0; j < n; j++)
			{
				if (b[i][j] < 0)
				{
					s++;
				}
			}
		}
		System.out.print(s);


		return 0;
	}
}

