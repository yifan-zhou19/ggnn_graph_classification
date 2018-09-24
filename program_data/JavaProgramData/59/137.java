package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		int[][] a = new int[102][102];
		int[][] b = new int[102][102];
		int i;
		int j;
		int n;
		int m;
		int num = 0;
		char temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (temp)
				{
				case '.':
					a[i][j] = 1;
					break;
				case '#':
					a[i][j] = 0;
					break;
				case '@':
					a[i][j] = 2;
					break;
				}
				b[i][j] = a[i][j];
			}
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (--m != 0)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == 2)
					{
						if (a[i - 1][j] != 0)
						{
							b[i - 1][j] = 2;
						}
						if (a[i + 1][j] != 0)
						{
							b[i + 1][j] = 2;
						}
						if (a[i][j - 1] != 0)
						{
							b[i][j - 1] = 2;
						}
						if (a[i][j + 1] != 0)
						{
							b[i][j + 1] = 2;
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == 2)
				{
					num++;
				}
			}
		}
		System.out.print(num);
		return 0;
	}

}

