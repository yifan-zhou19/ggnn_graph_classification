package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{'a', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int k;
		int i;
		int j;
		int l;
		int[][] b = new int[100][100];
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l < k;l++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						b[i][j] = 1;
						if (a[i - 1][j] == '.' && i != 0)
						{
							b[i - 1][j] = 1;
						}
						if (a[i + 1][j] == '.' && i != n - 1)
						{
							b[i + 1][j] = 1;
						}
						if (a[i][j - 1] == '.' && j != 0)
						{
							b[i][j - 1] = 1;
						}
						if (a[i][j + 1] == '.' && j != n - 1)
						{
							b[i][j + 1] = 1;
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (b[i][j] == 1)
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i][j] == 1)
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}

}

