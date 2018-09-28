package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9]; //???????

	public static void exp(int n)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int[][] b = new int[9][9];
		int[][] c = new int[9][9];

		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (a[i][j] != 0)
				{
					b[i][j] = 1; //??????
				}
			}
		}


		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if ((a[i][j] != 0) && (b[i][j] == 1))
				{
					if ((i - 1 >= 0) && (j - 1 >= 0))
					{
						c[i - 1][j - 1] = c[i - 1][j - 1] + a[i][j];
					}
					if ((i - 1 >= 0) && (j + 1 >= 0))
					{
						c[i - 1][j + 1] = c[i - 1][j + 1] + a[i][j];
					}
					if ((i + 1 <= 8) && (j - 1 >= 0))
					{
						c[i + 1][j - 1] = c[i + 1][j - 1] + a[i][j];
					}
					if ((i + 1 <= 8) && (j + 1 <= 8))
					{
						c[i + 1][j + 1] = c[i + 1][j + 1] + a[i][j];
					}
					if (i - 1 >= 0)
					{
						c[i - 1][j] = c[i - 1][j] + a[i][j];
					}
					if (i + 1 <= 8)
					{
						c[i + 1][j] = c[i + 1][j] + a[i][j];
					}
					if (j - 1 >= 0)
					{
						c[i][j - 1] = c[i][j - 1] + a[i][j];
					}
					if (j + 1 <= 8)
					{
						c[i][j + 1] = c[i][j + 1] + a[i][j];
					}
					c[i][j] = c[i][j] + a[i][j] * 2;
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				a[i][j] = c[i][j];
			}
		}

		if (n > 1)
		{
			exp(n - 1);
		}
	}

	public static int Main()
	{
		int m = 0; //m????????n???
		int n = 0;
		int i = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m; //?????
		exp(n); //??????
		for (i = 0; i < 9; i++)
		{
			System.out.print(a[i][0]);
			for (j = 1; j < 9; j++)
			{
				System.out.print(' ');
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

