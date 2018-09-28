package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[15][15];
		int m = 0;
		int n = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (int i = 1;i <= n;i++)
		{
			int[][] b = new int[15][15];
			for (int j = 1;j <= 9;j++)
			{
				for (int k = 1;k <= 9;k++)
				{
					if (a[j][k] != 0)
					{
						//int b[15][15]={0};
						for (int p = j - 1;p <= j + 1;p++)
						{
							for (int q = k - 1;q <= k + 1;q++)
							{
								b[p][q] += a[j][k];
							}
						}
						b[j][k] += a[j][k];
					}
				}
			}
			for (int j = 1;j <= 9;j++)
			{
				for (int k = 1;k <= 9;k++)
				{
					a[j][k] = b[j][k];
				}
			}
		}
		for (int i = 1;i <= 9;i++)
		{
			for (int k = 1;k <= 8;k++)
			{
				System.out.print(a[i][k]);
				System.out.print(" ");
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}

		return 0;
	}
}

