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
		int num = 0;
		char[][] a = new char[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		String t = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n; i++)
		{
			t = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j <= n - 1;j++)
			{
				if (t.charAt(j) == '#')
				{
					b[i][j + 1] = -1;
				}
				else if (t.charAt(j) == '@')
				{
					b[i][j + 1] = 1;
				}
				else
				{
					b[i][j + 1] = 0;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= m - 1;k++)
		{
			for (i = 1;i <= n; i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (b[i][j] == 1)
					{
						if (b[i - 1][j] != -1)
						{
							c[i - 1][j] = 1;
						}
						if (b[i + 1][j] != -1)
						{
							c[i + 1][j] = 1;
						}
						if (b[i][j - 1] != -1)
						{
							c[i][j - 1] = 1;
						}
						if (b[i][j + 1] != -1)
						{
							c[i][j + 1] = 1;
						}
						c[i][j] = b[i][j];
					}
					if (b[i][j] == -1)
					{
						c[i][j] = -1;
					}
				}
			}
			for (i = 1;i <= n; i++)
			{
				for (j = 1;j <= n;j++)
				{
					b[i][j] = c[i][j];
					c[i][j] = 0;
				}
			}
		}
		for (i = 1;i <= n; i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (b[i][j] == 1)
				{
					num++;
				}
			}
		}
		System.out.print(num);
		return 0;
	}
}

