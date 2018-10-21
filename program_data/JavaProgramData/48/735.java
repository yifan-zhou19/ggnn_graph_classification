package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int i = 1;
		int j = 1;
		int t = 1;
		int number;
		int time;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = number;
		for (i = 1;i <= time;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				for (t = 1;t <= 9;t++)
				{
					if (a[j][t] != 0)
					{
						b[j][t] += 2 * a[j][t];
						b[j + 1][t] += a[j][t];
						b[j - 1][t] += a[j][t];
						b[j + 1][t + 1] += a[j][t];
						b[j - 1][t + 1] += a[j][t];
						b[j + 1][t - 1] += a[j][t];
						b[j - 1][t - 1] += a[j][t];
						b[j][t + 1] += a[j][t];
						b[j][t - 1] += a[j][t];
					}
				}
			}
			for (j = 1;j <= 9;j++)
			{
				for (t = 1;t <= 9;t++)
				{
					a[j][t] = b[j][t];
					b[j][t] = 0;
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

