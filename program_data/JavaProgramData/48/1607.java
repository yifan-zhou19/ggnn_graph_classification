package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] baci = new int[5][9][9];
		int count;
		int days;
		int i;
		int j;
		int k;
		count = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		baci[0][4][4] = count;
		for (i = 0;i < days;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					if (baci[i][j][k] != 0)
					{
						int n = baci[i][j][k];
						baci[i + 1][j][k] += 2 * n;
						baci[i + 1][j - 1][k] += n;
						baci[i + 1][j + 1][k] += n;
						baci[i + 1][j][k - 1] += n;
						baci[i + 1][j][k + 1] += n;
						baci[i + 1][j - 1][k - 1] += n;
						baci[i + 1][j - 1][k + 1] += n;
						baci[i + 1][j + 1][k - 1] += n;
						baci[i + 1][j + 1][k + 1] += n;
					}
				}
			}
		}
		for (j = 0;j < 9;j++)
		{
			System.out.print(baci[days][j][0]);
			for (k = 1;k < 9;k++)
			{
				System.out.print(' ');
				System.out.print(baci[days][j][k]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

