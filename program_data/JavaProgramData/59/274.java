package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = m;m > 1;m--)
		{
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					if (i + 1 < n)
					{
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = 'b';
						}
					}

					if (i - 1 >= 0)
					{
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = 'b';
						}
					}

					if (j + 1 < n)
					{
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = 'b';
						}
					}

					if (j - 1 >= 0)
					{
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = 'b';
						}
					}
				}
			}
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == 'b')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		int k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					k++;
				}
			}
		}
		System.out.print(k);
		System.out.print("\n");
		return 0;
	}

}

