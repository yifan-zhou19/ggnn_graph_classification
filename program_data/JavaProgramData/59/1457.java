package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[102][102];
	public static int Main()
	{
		int m;
		int n;
		char b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1;i <= n;++i)
		{
			for (int j = 1;j <= n;++j)
			{
				b = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (b == '#')
				{
				a[i][j] = 1;
				}
				if (b == '.')
				{
				a[i][j] = 2;
				}
				if (b == '@')
				{
				a[i][j] = 3;
				}
			}
		}
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < m - 1;++i)
			{
				int[][] temp = new int[102][102];
				for (int i = 0;i < 102;++i)
				{
					for (int j = 0;j < 102;++j)
					{
						temp[i][j] = a[i][j];
					}
				}
				for (int i = 1;i <= n;++i)
				{
					for (int j = 1;j <= n;++j)
					{
						if (a[i][j] == 3 && a[i][j] == temp[i][j])
						{
							if (a[i][j - 1] == 2)
							{
								a[i][j - 1] = 3;
							}
							if (a[i][j + 1] == 2)
							{
								a[i][j + 1] = 3;
							}
							if (a[i + 1][j] == 2)
							{
								a[i + 1][j] = 3;
							}
							if (a[i - 1][j] == 2)
							{
								a[i - 1][j] = 3;
							}
						}
					}
				}
			}
			int s = 0;
			for (int i = 1;i <= n;++i)
			{
					for (int j = 1;j <= n;++j)
					{
						if (a[i][j] == 3)
						{
							s += 1;
						}
					}
			}
					System.out.print(s);

		return 0;
	}
}

