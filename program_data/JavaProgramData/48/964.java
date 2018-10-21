package <missing>;

public class GlobalMembers
{
	public static int[][] q = new int[9][9]; //????
	public static int[][] mark = new int[9][9];
	public static int[][] a = new int[9][9];
	public static int[][] d =
	{
		{-1, 0},
		{0, -1},
		{1, 0},
		{0, 1},
		{-1, -1},
		{-1, 1},
		{1, -1},
		{1, 1}
	}; //??????
	public static void kuosan(int i,int n) //????
	{
		if (i == n + 1) //????n?
		{
			for (int k = 0;k < 9;k++)
			{
				for (int l = 0;l < 9;l++)
				{
					if (l == 0)
					{
						System.out.print(q[k][0]);
					}
					else
					{
						System.out.print(' ');
						System.out.print(q[k][l]);
					}
				}
				System.out.print("\n");
			}
		} //????
		else
		{
			for (int j = 0;j < 9;j++)
			{
				for (int k = 0;k < 9;k++)
				{
					a[j][k] = q[j][k]; //???q?????a?
				}
			}
			for (int j = 0;j < 9;j++)
			{
				for (int k = 0;k < 9;k++)
				{
					if (mark[j][k] > 0 && mark[j][k] <= i)
					{
						a[j][k] = a[j][k] + 2 * q[j][k];
						for (int p = 0;p < 8;p++)
						{
							a[j + d[p][0]][k + d[p][1]] = a[j + d[p][0]][k + d[p][1]] + q[j][k];
							if (mark[j + d[p][0]][k + d[p][1]] == 0)
							{
								mark[j + d[p][0]][k + d[p][1]] = i + 1;
							}
						}
					} //????
				}
			}
			for (int j = 0;j < 9;j++)
			{
				for (int k = 0;k < 9;k++)
				{
					q[j][k] = a[j][k] - q[j][k]; //??????
				}
			}
			kuosan(i + 1, n); //??????
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q[4][4] = m;
		mark[4][4] = 1; //???
		kuosan(1, n);
		return 0;
	}
}

