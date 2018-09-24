package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int num = 0;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					if (a[j][k] == '@')
					{
						if (a[j - 1][k] == '.')
						{
							a[j - 1][k] = 'a';
						}
						if (a[j + 1][k] == '.')
						{
							a[j + 1][k] = 'a';
						}
						if (a[j][k + 1] == '.')
						{
							a[j][k + 1] = 'a';
						}
						if (a[j][k - 1] == '.')
						{
							a[j][k - 1] = 'a';
						}
					}
				}
			}
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					if (a[j][k] == 'a')
					{
						a[j][k] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		return 0;
	}

}

