package <missing>;

public class GlobalMembers
{
	public static int[][] germ = new int[10][10]; //???????????
	public static int m = 0;
	public static int n = 0;
	public static void work()
	{
		germ[5][5] = m;
		int[][] ngerm = new int[10][10]; //????????????
		for (int i = 0;i < n;i++)
		{
			int j;
			int k;
			int p;
			int q;
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++) // ?????????
				{ // ????????
						if (germ[j][k] != 0)
						{
							for (p = j - 1;p <= j + 1;p++)
							{
								for (q = k - 1;q <= k + 1;q++)
								{
									ngerm[p][q] += germ[j][k];
								}
							}
							ngerm[j][k] += germ[j][k];
						}
				}
			}
			for (j = 1;j <= 9;j++) //????????????
			{
				for (k = 1;k <= 9;k++) //??????
				{
					germ[j][k] = ngerm[j][k];
					ngerm[j][k] = 0;
				}
			}
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		work();
		for (int i = 1;i < 10;i++) //??
		{
			for (int j = 1;j < 9;j++)
			{
				System.out.print(germ[i][j]);
				System.out.print(' ');
			}
			System.out.print(germ[i][9]);
			System.out.print("\n");
		}
		return 0;
	}

}

