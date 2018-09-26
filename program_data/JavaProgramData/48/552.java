package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int i;
		int j;
		int n;
		int d;
		int days;
		int k;
		int l;
		for (i = 0;i <= 10;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = n;
		for (d = 1;d <= days;d++)
		{
			for (k = 0;k <= 10;k++)
			{
				for (l = 0;l <= 10;l++)
				{
					b[k][l] = 0;
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (a[i][j] != 0)
					{
						b[i][j] = a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1] + a[i][j] * 2;
					}
					else
					{
						if (a[i][j] == 0 && ((a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1]) != 0))
						{
							b[i][j] = a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
						}
					}
				}
			}
			for (k = 1;k <= 9;k++)
			{
				for (l = 1;l <= 9;l++)
				{
					a[k][l] = b[k][l];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}
		return 0;
	}

}

