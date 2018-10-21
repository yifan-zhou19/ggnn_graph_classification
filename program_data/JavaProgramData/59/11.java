package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			char[][][] a = new char[102][102][101];
			int n;
			int m;
			int i;
			int j;
			int l;
			int k;
			int ill = 0;
			for (i = 0;i <= 101;i++)
			{
			for (j = 0;j <= 101;j++)
			{
			for (l = 0;l <= 100;l++)
			{
				a[i][j][l] = '#';
			}
			}
			}

			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i <= n;i++)
			{
			for (j = 1;j <= n;j++)
			{
				a[i][j][1] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
			}
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i <= n;i++)
			{
			for (j = 0;j <= n;j++)
			{
			for (l = 2;l <= m;l++)
			{
				a[i][j][l] = a[i][j][1];
			}
			}
			}

			for (k = 2;k <= m;k++)
			{
					for (i = 1;i <= n;i++)
					{
					for (j = 1;j <= n;j++)
					{
					   if (a[i][j][k - 1] == '@')
					   {
							if (a[i + 1][j][k] == '.')
							{
								a[i + 1][j][k] = '@';
							}
							if (a[i - 1][j][k] == '.')
							{
								a[i - 1][j][k] = '@';
							}
							if (a[i][j + 1][k] == '.')
							{
								a[i][j + 1][k] = '@';
							}
							if (a[i][j - 1][k] == '.')
							{
								a[i][j - 1][k] = '@';
							}
					   }
					}
					}
			}

			for (i = 1;i <= n;i++)
			{
			   for (j = 1;j <= n;j++)
			   {
				   if (a[i][j][m] == '@')
				   {
					   ill++;
				   }
			   }
			}
			System.out.print(ill);
			return 0;
	}
}

