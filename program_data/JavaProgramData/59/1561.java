package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[102][102];
		int n;
		int m;
		int i;
		int j;
		int k;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i = i + 1)
		{
			for (j = 1;j <= n;j = j + 1)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k = k + 1)
		{
			for (i = 1;i <= n;i = i + 1)
			{
				for (j = 1;j <= n;j = j + 1)
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
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '!';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '!';
						}
					}
				}
			}
			for (i = 1;i <= n;i = i + 1)
			{
				for (j = 1;j <= n;j = j + 1)
				{
					if (a[i][j] == '!')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i = i + 1)
		{
			for (j = 1;j <= n;j = j + 1)
			{
				if (a[i][j] == '@')
				{
					sum = sum + 1;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}


}

