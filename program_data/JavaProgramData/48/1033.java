package <missing>;

public class GlobalMembers
{
	public static void reproduce(int n, int[] a)
	{
		if (n == 0)
		{
			return;
		}
		int[][] temp = new int[9][9];
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				if (a[i][j] != 0)
				{
					temp[i][j] += 2 * a[i][j];
					if (i > 0)
					{
						temp[i - 1][j] += a[i][j];
						if (j > 0)
						{
							temp[i - 1][j - 1] += a[i][j];
							temp[i][j - 1] += a[i][j];
							if (i < 8)
							{
								temp[i + 1][j - 1] += a[i][j];
								temp[i + 1][j] += a[i][j];
							}
						}
						if (j < 8)
						{
							temp[i - 1][j + 1] += a[i][j];
							temp[i][j + 1] += a[i][j];
							if (i < 8)
							{
								temp[i + 1][j + 1] += a[i][j];
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				a[i][j] = temp[i][j];
			}
		}
		return reproduce(n - 1, a);
	}

	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		reproduce(n, a);
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				System.out.print(a[i][j]);
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

