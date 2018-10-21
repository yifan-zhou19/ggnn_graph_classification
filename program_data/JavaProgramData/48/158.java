package <missing>;

public class GlobalMembers
{
	public static int[][][] num = new int[9][9][5];
	public static int day;
	public static int zz(int d)
	{
		int i;
		int j;
		if (d == day + 1)
		{
			return 0;
		}
		if (d != day + 1)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
						num[i][j][d] += 2 * num[i][j][d - 1];
						num[i - 1][j - 1][d] += num[i][j][d - 1];
						num[i - 1][j][d] += num[i][j][d - 1];
						num[i - 1][j + 1][d] += num[i][j][d - 1];
						num[i + 1][j - 1][d] += num[i][j][d - 1];
						num[i + 1][j][d] += num[i][j][d - 1];
						num[i + 1][j + 1][d] += num[i][j][d - 1];
						num[i][j + 1][d] += num[i][j][d - 1];
						num[i][j - 1][d] += num[i][j][d - 1];
				}
			}
		}
		zz(d + 1);
		return 0;
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < day;k++)
				{
					num[i][j][k] = 0;
				}
			}
		}
		num[4][4][0] = m;
		zz(1);
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j != 8)
				{
					System.out.print(num[i][j][day]);
					System.out.print(" ");
				}
				if (j == 8)
				{
					System.out.print(num[i][j][day]);
					System.out.print('\n');
				}
			}
		}
		return 0;
	}
}

