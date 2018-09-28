package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int[][] map =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int[][] temp =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int cnt = 0;
		char[][] chmap = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; ++i)
		{
			chmap[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; ++i)
		{
			for (j = 0; j < n; ++j)
			{
				switch (chmap[i][j])
				{
				case '.':
					map[i + 1][j + 1] = 1;
					break;
				case '#':
					map[i + 1][j + 1] = 0;
					break;
				case '@':
					map[i + 1][j + 1] = 2;
					break;
				}
			}
		}
		for (i = 0; i < m - 1; ++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp, 0, (Integer.SIZE / Byte.SIZE));
			for (j = 1; j <= n; ++j)
			{
				for (k = 1; k <= n; ++k)
				{
					temp[j][k] = map[j][k];
				}
			}
			for (j = 1; j <= n; ++j)
			{
				for (k = 1; k <= n; ++k)
				{
					if (map[j][k] == 2)
					{
						temp[j][k] = 2;
						if (map[j + 1][k] != 0)
						{
							temp[j + 1][k] = 2;
						}
						if (map[j - 1][k] != 0)
						{
							temp[j - 1][k] = 2;
						}
						if (map[j][k + 1] != 0)
						{
							temp[j][k + 1] = 2;
						}
						if (map[j][k - 1] != 0)
						{
							temp[j][k - 1] = 2;
						}
					}
				}
			}
			for (j = 1; j <= n; ++j)
			{
				for (k = 1; k <= n; ++k)
				{
					map[j][k] = temp[j][k];
				}
			}
		}
		for (i = 1; i <= n; ++i)
		{
			for (j = 1; j <= n; ++j)
			{
				if (map[i][j] == 2)
				{
					cnt++;
				}
			}
		}
		System.out.print(cnt);
		System.out.print("\n");
		return 0;
	}
}

