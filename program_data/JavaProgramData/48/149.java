package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int d;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int i;
		int j;
		for (i = 0;i <= 10;i++)
		{
		for (j = 0;j <= 10;j++)
		{
			a[i][j] = 0;
			b[i][j] = 0;
		}
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = num;
		b[5][5] = num;
		while (d-- != 0)
		{
		for (i = 0;i <= 10;i++)
		{
		for (j = 0;j <= 10;j++)
		{
			a[i][j] = 0;
		}
		}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (b[i][j] != 0)
					{
						a[i][j] += (2 * b[i][j]);
						a[i - 1][j] += b[i][j];
						a[i + 1][j] += b[i][j];
						a[i - 1][j - 1] += b[i][j];
						a[i + 1][j - 1] += b[i][j];
						a[i - 1][j + 1] += b[i][j];
						a[i + 1][j + 1] += b[i][j];
						a[i][j - 1] += b[i][j];
						a[i][j + 1] += b[i][j];

					}


				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = a[i][j];
				}
			}

		}
		for (i = 1;i <= 9;i++)
		{
		for (j = 1;j <= 9;j++)
		{
			if (j != 1)
			{
				System.out.print(" ");
			}
			System.out.print(a[i][j]);
		}
		System.out.print("\n");
		}
		return 0;
	}
}

