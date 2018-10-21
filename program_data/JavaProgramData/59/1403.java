package <missing>;

public class GlobalMembers
{
	/**
	 * @file   5.cpp
	 * @author ???
	 * @date   2013-11-1
	 * @description
	 *         ???????????
	 */



	public static int Main()
	{
		int[][] a = new int[102][102];
		int[][] b = new int[102][102];
		int n;
		int m;
		int i;
		int j;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char c;

		for (i = 1; i <= n; ++i)
		{
			for (j = 1; j <= n; ++j)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (c)
				{
				case '@': // ??????????-1??
					a[i][j] = -1;
					++sum;
					break;
				case '.':
					a[i][j] = 1; // ??????????1??
					break;
				}
			}
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (m != 0)
		{
			for (i = 1; i <= n; ++i)
			{
				for (j = 1; j <= n; ++j)
				{
					if (b[i][j] == 1 && (a[i - 1][j] == -1 || a[i + 1][j] == -1 || a[i][j - 1] == -1 || a[i][j + 1] == -1))
					{
						b[i][j] = -1;
						++sum;
					}
					else
					{
						b[i][j] = a[i][j];
					}
				}
			}

			for (i = 1; i <= n; ++i)
			{
				for (j = 1; j <= n; ++j)
				{
					a[i][j] = b[i][j];
				}
			}

			--m;
		}

		System.out.print(sum);

		return 0;
	}
}

