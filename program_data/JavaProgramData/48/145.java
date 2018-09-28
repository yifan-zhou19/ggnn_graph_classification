package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static int start;
	public static int days;

	public static void initial()
	{ //make a and b all 0
		int i;
		int j;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
			}
		}
	}


	public static void input()
	{ //set the start germ number
		start = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = start;
	}
	public static void output()
	{ //print a
		int i = 0;
		int j = 0;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (j == 0)
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(' ');
					System.out.print(a[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
	public static void grow(int day)
	{ //germs grow one day
		if (day > days)
		{
			return;
		}
		int i = 0;
		int j = 0;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (a[i][j] > 0)
				{
					b[i][j] += a[i][j];
					if ((i - 1) >= 0 && (i - 1) <= 9)
					{
						b[i - 1][j] += a[i][j];
					}
					if ((i + 1) >= 0 && (i + 1) <= 9)
					{
						b[i + 1][j] += a[i][j];
					}
					if ((j - 1) >= 0 && (j - 1) <= 9)
					{
						b[i][j - 1] += a[i][j];
					}
					if ((j + 1) >= 0 && (j + 1) <= 9)
					{
						b[i][j + 1] += a[i][j];
					}

					if ((i - 1) >= 0 && (i - 1) <= 9 && (j - 1) >= 0 && (j - 1) <= 9)
					{
						b[i - 1][j - 1] += a[i][j];
					}
					if ((i - 1) >= 0 && (i - 1) <= 9 && (j + 1) >= 0 && (j + 1) <= 9)
					{
						b[i - 1][j + 1] += a[i][j];
					}
					if ((i + 1) >= 0 && (i + 1) <= 9 && (j + 1) >= 0 && (j + 1) <= 9)
					{
						b[i + 1][j + 1] += a[i][j];
					}
					if ((i + 1) >= 0 && (i + 1) <= 9 && (j - 1) >= 0 && (j - 1) <= 9)
					{
						b[i + 1][j - 1] += a[i][j];
					}

				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				a[i][j] += b[i][j];
				b[i][j] = 0;
			}
		}
		grow(day + 1);
	}
	public static int Main()
	{
		initial();
		input();
		grow(1);
		output();
		return 0;
	}

}

