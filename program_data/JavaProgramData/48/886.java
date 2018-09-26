package <missing>;

public class GlobalMembers
{
	//????????


	public static int[][] x = new int[9][9];
	public static int[][] y = new int[9][9];

	public static void scan()
	{
		int i;
		int j;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (x[i][j] != 0)
				{
					y[i][j] += x[i][j] * 2;
					y[i - 1][j] += x[i][j];
					y[i + 1][j] += x[i][j];
					y[i - 1][j - 1] += x[i][j];
					y[i - 1][j + 1] += x[i][j];
					y[i + 1][j - 1] += x[i][j];
					y[i + 1][j + 1] += x[i][j];
					y[i][j - 1] += x[i][j];
					y[i][j + 1] += x[i][j];
				}
			}
		}

	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x[4][4] = m;
		while (n-- != 0)
		{
			scan();
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					x[i][j] = y[i][j];
					y[i][j] = 0;
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				System.out.print(x[i][j]);
				if (j == 8)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		return 0;
	}

}

