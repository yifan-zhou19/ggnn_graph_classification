package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int m;
		int n;
		int i;
		int j;
		int k;
		char c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;++i)
		{
			for (j = 1;j <= n;++j)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c == '.')
				{
					a[i][j] = 1;
				}
				if (c == '#')
				{
					a[i][j] = 0;
				}
				if (c == '@')
				{
					a[i][j] = 2;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2;k <= m;++k)
		{
			for (i = 1;i <= n;++i)
			{
				for (j = 1;j <= n;++j)
				{
					if (a[i][j] == k && a[i - 1][j] == 1)
					{
						a[i - 1][j] += k;
					}
					if (a[i][j] == k && a[i + 1][j] == 1)
					{
						a[i + 1][j] += k;
					}
					if (a[i][j] == k && a[i][j - 1] == 1)
					{
						a[i][j - 1] += k;
					}
					if (a[i][j] == k && a[i][j + 1] == 1)
					{
						a[i][j + 1] += k;
					}
				}
			}
		}
		int s = 0;
		for (i = 1;i <= n;++i)
		{
			for (j = 1;j <= n;++j)
			{
				s = s + (a[i][j] >= 2);
			}
		}
		System.out.print(s);
		return 0;
	}
}

