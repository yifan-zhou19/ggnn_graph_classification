package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		b[5][5] = m;
		while (n != 0)
		{
			n--;
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					if (a[i][j] > 0)
					{
						b[i][j] += a[i][j];
						b[i + 1][j] += 1 * a[i][j];
						b[i][j + 1] += 1 * a[i][j];
						b[i - 1][j] += 1 * a[i][j];
						b[i][j - 1] += 1 * a[i][j];
						b[i + 1][j + 1] += 1 * a[i][j];
						b[i + 1][j - 1] += 1 * a[i][j];
						b[i - 1][j + 1] += 1 * a[i][j];
						b[i - 1][j - 1] += 1 * a[i][j];
					}
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 9;j++)
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

