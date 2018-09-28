package <missing>;

public class GlobalMembers
{
	//*************************
	//*??:???????? **
	//*??:??? 1300013007**
	//*??:2013.12.6        **
	//*************************


	public static int[][] bacteria = new int[11][11];
	public static int[][] flag = new int[11][11];
	public static int[][] add = new int[11][11];

	public static void reproduce(int x, int y)
	{
		if (x > 1)
		{
			add[x - 1][y] += (bacteria[x][y] / 2);
		}
		if (x < 9)
		{
			add[x + 1][y] += (bacteria[x][y] / 2);
		}
		if (y > 1)
		{
			add[x][y - 1] += (bacteria[x][y] / 2);
		}
		if (y < 9)
		{
			add[x][y + 1] += (bacteria[x][y] / 2);
		}
		if (x > 1 && y > 1)
		{
			add[x - 1][y - 1] += (bacteria[x][y] / 2);
		}
		if (x < 9 && y < 9)
		{
			add[x + 1][y + 1] += (bacteria[x][y] / 2);
		}
		if (x > 1 && y < 9)
		{
			add[x - 1][y + 1] += (bacteria[x][y] / 2);
		}
		if (x < 9 && y > 1)
		{
			add[x + 1][y - 1] += (bacteria[x][y] / 2);
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bacteria[5][5] = m;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				for (k = 1; k <= 9; k++)
				{
					if (bacteria[j][k] != 0)
					{
						flag[j][k] = 1;
						bacteria[j][k] *= 2;
					}
				}
			}
			for (j = 1; j <= 9; j++)
			{
				for (k = 1; k <= 9; k++)
				{
					if (flag[j][k] != 0)
					{
						flag[j][k] = 0;
						reproduce(j, k);
					}
				}
			}
			for (j = 1; j <= 9; j++)
			{
				for (k = 1; k <= 9; k++)
				{
					bacteria[j][k] += add[j][k];
					add[j][k] = 0;
				}
			}
		}
		for (j = 1; j <= 9; j++)
		{
			for (k = 1; k <= 9; k++)
			{
				if (k == 1)
				{
					System.out.print(bacteria[j][k]);
				}
				else
				{
					System.out.print(' ');
					System.out.print(bacteria[j][k]);
					if (k == 9)
					{
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

