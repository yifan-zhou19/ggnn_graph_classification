package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] day = new int[5][9][9];
		int n;
		day[0][4][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {-1, 0, 1};
		int[] b = {-1, 0, 1};
		for (int d = 1;d <= 4;d++)
		{
			for (int i = 0;i < 9;i++)
			{
				for (int j = 0;j < 9;j++)
				{
					if (day[d - 1][i][j] != 0)
					{
						for (int p = 0;p < 3;p++)
						{
							for (int q = 0;q < 3;q++)
							{
								day[d][i + a[p]][j + b[q]] += day[d - 1][i][j];
							}
						}
						day[d][i][j] += day[d - 1][i][j];
					}
				}
			}
		}
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				if (j != 0)
				{
					System.out.print(" ");
				}
				System.out.print(day[n][i][j]);
			}
			System.out.print("\n");
		}

		return 0;
	}
}

