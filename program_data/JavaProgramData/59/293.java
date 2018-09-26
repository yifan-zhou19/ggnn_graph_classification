package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] ch = new char[101][101];
		int n;
		int num = 0;
		int[][] day = new int[101][101];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0;i < n + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				day[i][j] = 0;
			}
		}
		for (i = 0;i < n + 2;i++)
		{
			\
			{
			ch[0][i] = '#';
			ch[n + 1][i] = '#';
			}
		}
		for (i = 1;i < n + 1;i++)
		{
			ch[i][0] = '#';
			ch[i][n + 1] = '#';
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				ch[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		for (i = 0;i <= n + 1;i++)
		{
				for (j = 0;j <= n + 1;j++)
				{
					if (ch[i][j] == '@')
					{
						num++;
						day[i][j] = 0;
					}
				}
		}
		int m = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 1;j++)
				{
					if (ch[i][j] == '@' && day[i][j] < k)
					{
						if (ch[i + 1][j] == '.')
						{
							ch[i + 1][j] = '@';
							day[i + 1][j] = k;
							num++;
						}
						if (ch[i - 1][j] == '.')
						{
							ch[i - 1][j] = '@';
							day[i - 1][j] = k;
							num++;
						}
						if (ch[i][j + 1] == '.')
						{
							ch[i][j + 1] = '@';
							num++;
							day[i][j + 1] = k;
						}
						if (ch[i][j - 1] == '.')
						{
							ch[i][j - 1] = '@';
							num++;
							day[i][j - 1] = k;
						}
					}
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
	}
}

