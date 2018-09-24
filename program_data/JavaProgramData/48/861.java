package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int n;
		int i;
		int j;
		a[4][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			n--;
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (a[i][j] != 0)
					{
						b[i][j] = a[i][j] * 2;
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (a[i][j] != 0)
					{
						b[i + 1][j] = a[i][j] + b[i + 1][j];
						b[i - 1][j] = a[i][j] + b[i - 1][j];
						b[i][j + 1] = a[i][j] + b[i][j + 1];
						b[i][j - 1] = a[i][j] + b[i][j - 1];
						b[i + 1][j + 1] = a[i][j] + b[i + 1][j + 1];
						b[i - 1][j - 1] = a[i][j] + b[i - 1][j - 1];
						b[i + 1][j - 1] = a[i][j] + b[i + 1][j - 1];
						b[i - 1][j + 1] = a[i][j] + b[i - 1][j + 1];
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i][j];
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					b[i][j] = 0;
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print(a[i][8]);
			System.out.print("\n");
		}
		return 0;
	}
}

