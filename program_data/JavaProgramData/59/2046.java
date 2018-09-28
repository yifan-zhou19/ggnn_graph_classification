package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int num = 0;
		int[][] boo = new int[100][100];
		char[][] p = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				p[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j <= n + 1;j++)
		{
			p[0][j] = '#';
			p[n + 1][j] = '#';
		}
		for (i = 1;i <= n;i++)
		{
			p[i][0] = '#';
			p[i][n + 1] = '#';
		}
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					boo[i][j] = 1;
				}
			}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (p[i][j] == '@' && boo[i][j] == 1)
				{
					if (p[i - 1][j] == '.')
					{
						p[i - 1][j] = '@';
						boo[i - 1][j] = 0;
					}
					if (p[i + 1][j] == '.')
					{
						p[i + 1][j] = '@';
						boo[i + 1][j] = 0;
					}
					if (p[i][j - 1] == '.')
					{
						p[i][j - 1] = '@';
						boo[i][j - 1] = 0;
					}
					if (p[i][j + 1] == '.')
					{
						p[i][j + 1] = '@';
						boo[i][j + 1] = 0;
					}
				}
			}
		}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (p[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		return 0;
	}
}

