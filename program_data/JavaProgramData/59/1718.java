package <missing>;

public class GlobalMembers
{
	// * * * * * * * * * * * * * * *
	// *???????             *
	// *??????  1300013011   *
	// *???2013.11.7            *
	// * * * * * * * * * * * * * * *
	public static int Main()
	{
		char[][] str = new char[101][101];
		int n;
		int m;
		int[][] a = new int[100][100];
		int num = 0;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				str[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (str[i][j] == '#')
				{
					a[i][j] = 0;
				}
				else if (str[i][j] == '.')
				{
					a[i][j] = 1;
				}
				else if (str[i][j] == '@')
				{
					a[i][j] = 2;
				}
				else
				{
					a[i][j] = 0;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 2; k <= m; k++)
		{
			for (int h = 0; h < n; h++)
			{
				for (int l = 0; l < n; l++)
				{
					if ((h > 0) && (str[h][l] == '@') && (str[h - 1][l] == '.'))
					{
						a[h - 1][l] *= 2;
					}
					if ((h < n - 1) && (str[h][l] == '@') && (str[h + 1][l] == '.'))
					{
						a[h + 1][l] *= 2;
					}
					if ((l > 0) && (str[h][l] == '@') && (str[h][l - 1] == '.'))
					{
						a[h][l - 1] *= 2;
					}
					if ((l < n - 1) && (str[h][l] == '@') && (str[h][l + 1] == '.'))
					{
						a[h][l + 1] *= 2;
					}
				}
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] >= 2)
					{
						str [i][j] = '@';
					}
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (a[i][j] >= 2)
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

