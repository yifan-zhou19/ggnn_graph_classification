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
		int sum = 0;
		char[][] x = new char[100][100];
		char[][] y = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				x[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				y[i][j] = x[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (x[i][j] == '@')
					{
						if (i > 1 && x[i - 1][j] == '.')
						{
							y[i - 1][j] = '@';
						}
						if (i < n && x[i + 1][j] == '.')
						{
							y[i + 1][j] = '@';
						}
						if (j < n && x[i][j + 1] == '.')
						{
							y[i][j + 1] = '@';
						}
						if (j > 1 && x[i][j - 1] == '.')
						{
							y[i][j - 1] = '@'; //??????????
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					x[i][j] = y[i][j]; //??????????????
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
					if (x[i][j] == '@')
					{
						sum++; //?????
					}
				}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

