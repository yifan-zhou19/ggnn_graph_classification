package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int day;
		int i;
		int j;
		int k;
		int num = 0;
		char[][] x = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				x[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2; k <= day; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (x[i][j] == '!')
					{
						x[i][j] = '@';
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (x[i][j] == '@' && x[i - 1][j] == '.')
					{
						x[i - 1][j] = '!';
					}
					if (x[i][j] == '@' && x[i + 1][j] == '.')
					{
						x[i + 1][j] = '!';
					}
					if (x[i][j] == '@' && x[i][j - 1] == '.')
					{
						x[i][j - 1] = '!';
					}
					if (x[i][j] == '@' && x[i][j + 1] == '.')
					{
						x[i][j + 1] = '!';
					}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (x[i][j] == '@' || x[i][j] == '!')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		return 0;
	}
}

