package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int days;
		int[][] left = new int[9][9];
		int[][] seperate = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[9][9];
		a[4][4] = m;
		for (days = 0; days < n; days++)
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					left[i][j] = a[i][j] * 2;
					a[i][j] *= 10;
					seperate[i][j] = (a[i][j] - left[i][j]) / 8;
					a[i][j] = left[i][j];
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					a[i + 1][j] += seperate[i][j];
					a[i - 1][j] += seperate[i][j];
					a[i + 1][j + 1] += seperate[i][j];
					a[i - 1][j - 1] += seperate[i][j];
					a[i + 1][j - 1] += seperate[i][j];
					a[i - 1][j + 1] += seperate[i][j];
					a[i][j + 1] += seperate[i][j];
					a[i][j - 1] += seperate[i][j];
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
				for (j = 0; j < 8; j++)
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
				System.out.print(a[i][8]);
				System.out.print("\n");
		}
		return 0;
	}



}

