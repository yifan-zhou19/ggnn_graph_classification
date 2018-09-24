package <missing>;

public class GlobalMembers
{
	// ??????
	// ??? 1100012820
	// 20111123
	//******************
	public static int[][] sqr = new int[9][9];
	public static void printsqr(int[][] a)
	{
		int i;
		int j;
		for (i = 0; i <= 8; i++)
		{
			for (j = 0; j <= 7; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][8]);
			System.out.print("\n");
		}
	}
	public static void addv()
	{
		int[][] adsqr = new int[9][9];
		int i;
		int j;
		int m;
		int n;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				for (m = i - 1; m <= i + 1; m++)
				{
					for (n = j - 1; n <= j + 1; n++)
					{
						if ((m >= 0) && (m <= 8) && (n >= 0) && (n <= 8))
						{
							adsqr[m][n] += sqr[i][j];
						}
					}
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				sqr[i][j] += adsqr[i][j];
			}
		}
		return;
	}
	public static void grow(int days)
	{
		if (days != 0)
		{
			addv();
			grow(days - 1);
		}
		return;
	}
	public static int Main()
	{
		int num;
		int day;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sqr[4][4] += num;
		grow(day);
		printsqr(sqr);
		return 0;
	}



}

