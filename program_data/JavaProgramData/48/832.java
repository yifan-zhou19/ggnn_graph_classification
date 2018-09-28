package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int i;
		int j;
		int[][] t = new int[11][11];
		int m;
		int n;
		final int[][] move =
		{
			{-1, 0},
			{1, 0},
			{0, 1},
			{0, -1},
			{-1, -1},
			{1, -1},
			{1, 1},
			{-1, 1}
		};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		while (n-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(t, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 1; i < 10; i++)
			{
				for (j = 1; j < 10; j++)
				{
					for (int k = 0; k < 8; k++)
					{
						t[i + move[k][0]][j + move[k][1]] += a[i][j];
					}
					t[i][j] += a[i][j];
				}
			}
			for (i = 1; i < 10; i++)
			{
				for (j = 1; j < 10; j++)
				{
					a[i][j] += t[i][j];
				}
			}
		}
		for (i = 1; i < 10; i++)
		{
			for (j = 1; j < 10; j++)
			{
				if (j > 1)
				{
					System.out.print(" ");
				}
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

