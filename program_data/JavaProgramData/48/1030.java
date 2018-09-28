package <missing>;

public class GlobalMembers
{
	public static int[][] xi = new int[11][11];
	public static int[][] jun = new int[11][11];
	public static int i;
	public static int j;
	public static void fanzhi(int t)
	{
		if (t == 0)
		{
			return;
		}
		int[][] jun = new int[11][11];
		for (i = 1 ; i <= 9 ; i++)
		{
			for (j = 1 ; j <= 9 ; j++)
			{
				jun[i - 1][j - 1] += xi[i][j];
				jun[i - 1][j] += xi[i][j];
				jun[i - 1][j + 1] += xi[i][j];
				jun[i][j - 1] += xi[i][j];
				jun[i][j + 1] += xi[i][j];
				jun[i + 1][j - 1] += xi[i][j];
				jun[i + 1][j] += xi[i][j];
				jun[i + 1][j + 1] += xi[i][j];
			}
		}
		for (i = 1 ; i <= 9 ; i++)
		{
			for (j = 1 ; j <= 9 ; j++)
			{
				xi[i][j] = 2 * xi[i][j] + jun[i][j];
			}
		}
		fanzhi(t - 1);
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		xi[5][5] = m;
		fanzhi(n);
		for (i = 1 ; i <= 9 ; i++)
		{
			for (j = 1 ; j <= 9 ; j++)
			{
				if (j >= 2)
				{
					System.out.print(' ');
				}
				System.out.print(xi[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

