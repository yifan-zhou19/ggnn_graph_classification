package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int num = 0;
		char[][] a = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k < m;k++)
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '!';
						}
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '!';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '!';
						}
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '!';
						}
					}
				}
			}
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (a[i][j] == '!')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

