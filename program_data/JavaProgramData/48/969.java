package <missing>;

public class GlobalMembers
{
	public static int[][] bac = new int[9][9];

	public static void born(int x, int n)
	{
		if (x < n)
		{
			int i;
			int j;
			int k;
			int l;
			int[][] a = new int[9][9];
			for (i = 4 - x; i <= 4 + x; i++)
			{
				for (j = 4 - x; j <= 4 + x; j++)
				{
					if (bac[i][j] != 0)
					{
						a[i][j] += bac[i][j];
						for (k = i - 1; k <= i + 1; k++)
						{
							for (l = j - 1; l <= j + 1; l++)
							{
								a[k][l] += bac[i][j];
							}
						}
					}
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					bac[i][j] = a[i][j];
				}
			}
			born(x + 1, n);
		}
	}

	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bac[4][4] = m;
		born(0, n);
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				System.out.print(bac[i][j]);
				if (j != 8)
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

