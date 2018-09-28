package <missing>;

public class GlobalMembers
{
	public static int[][] test = new int[9][9];
	public static int[][] follow = new int[9][9];

	public static void change()
	{
		int i;
		int j;
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				test[i][j] += follow[i][j] * 2;
				test[i - 1][j] += follow[i][j];
				test[i + 1][j] += follow[i][j];
				test[i][j - 1] += follow[i][j];
				test[i][j + 1] += follow[i][j];
				test[i - 1][j - 1] += follow[i][j];
				test[i - 1][j + 1] += follow[i][j];
				test[i + 1][j - 1] += follow[i][j];
				test[i + 1][j + 1] += follow[i][j];
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				test[i][j] = test[i][j] - follow[i][j];
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				follow[i][j] = test[i][j];
			}
		}
	}


	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				test[i][j] = 0;
				follow[i][j] = 0;
			}
		}
		test[4][4] = follow[4][4] = m;
		while (n-- != 0)
		{
			change();
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
				System.out.print(test[i][j]);
				System.out.print(" ");
			}
			System.out.print(test[i][8]);
			System.out.print("\n");
		}
		return 0;
	}


}

