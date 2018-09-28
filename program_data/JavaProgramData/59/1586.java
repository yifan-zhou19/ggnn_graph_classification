package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //k????
		int m;
		int i;
		int j;
		int k;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][][] a = new char[110][110][110];
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				a[1][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 1;j++)
				{
					a[k + 1][i][j] = a[k][i][j]; //??k????????k+1?
				}
			}
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 1;j++)
				{
					if (a[k][i][j] == '@') //????????????????????????
					{
						if (a[k][i - 1][j] == '.')
						{
							a[k + 1][i - 1][j] = '@';
						}
						if (a[k][i + 1][j] == '.')
						{
							a[k + 1][i + 1][j] = '@';
						}
						if (a[k][i][j - 1] == '.')
						{
							a[k + 1][i][j - 1] = '@';
						}
						if (a[k][i][j + 1] == '.')
						{
							a[k + 1][i][j + 1] = '@';
						}
					}
				}
			}
		}
		for (i = 1;i < n + 1;i++)
		{
				for (j = 1;j < n + 1;j++)
				{
					if (a[m][i][j] == '@')
					{
						count++;
					}
				}
		}
			System.out.print(count);
		return 0;
	}
}

