package <missing>;

public class GlobalMembers
{
	//*********************
	//  ????????
	//  ???  1300062709
	//  2013.12.09
	//*********************
	public static int[][] shu = new int[9][9];
	public static int[][] aa = new int[9][9];
	public static int x;
	public static int y;
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static void grems(int x, int y)
	{
		if (x + 1 < 9 && y + 1 < 9 && x - 1 >= 0 && y - 1 >= 0)
		{
			shu[x + 1][y + 1] += aa[x][y];
			shu[x + 1][y] += aa[x][y];
			shu[x + 1][y - 1] += aa[x][y];
			shu[x][y + 1] += aa[x][y];
			shu[x][y - 1] += aa[x][y];
			shu[x - 1][y] += aa[x][y];
			shu[x - 1][y + 1] += aa[x][y];
			shu[x - 1][y - 1] += aa[x][y];
		}
		 shu[x][y] += 2 * aa[x][y];
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		aa[4][4] = m;
		while (n != 0)
		{
			for (i = 0 ; i < 9 ; i++)
			{
				for (j = 0 ; j < 9; j++)
				{
					if (aa[i][j] > 0)
					{
						grems(i, j);
					}
				}
			}
			for (i = 0 ; i < 9 ; i++)
			{
				for (j = 0 ; j < 9; j++)
				{
					aa[i][j] = shu[i][j];
				}
			}
			if (n > 0)
			{
				for (i = 0 ; i < 9 ; i++)
				{
					for (j = 0 ; j < 9; j++)
					{
						shu[i][j] = 0;
					}
				}
			}
			n--;
		}
		for (i = 0 ; i < 9 ; i++)
		{
			for (j = 0 ; j < 8 ; j++)
			{
				System.out.print(aa[i][j]);
				System.out.print(' ');
			}
			System.out.print(aa[i][8]);
			System.out.print("\n");
		}
		return 0;
	}
}

