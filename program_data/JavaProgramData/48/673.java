package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int i;
		int j;
		int k;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
			}
		}
		a[5][5] = m;
		for (k = 0;k < n;k++)
		{
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					b[i][j] = a[i][j];
				}
			}

			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					if (b[i][j] != 0)
					{
						a[i][j] = a[i][j] + b[i][j];
						a[i][j + 1] += b[i][j];
						a[i][j - 1] += b[i][j];
						a[i + 1][j] += b[i][j];
						a[i - 1][j] += b[i][j];
						a[i + 1][j + 1] += b[i][j];
						a[i - 1][j - 1] += b[i][j];
						a[i + 1][j - 1] += b[i][j];
						a[i - 1][j + 1] += b[i][j];
					}

				}
			}
		}
		k = 0;
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				System.out.print(a[i][j]);
				k++;
				if (k % 9 != 0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

