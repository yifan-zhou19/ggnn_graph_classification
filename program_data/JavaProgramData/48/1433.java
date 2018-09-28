package <missing>;

public class GlobalMembers
{
	public static void fanzhi(int day)
	{
		if (day == n + 1)
		{
			return;
		}
		else
		{
			int i;
			int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 1; i < 10; i++)
			{
				for (j = 1; j < 10; j++)
				{
					if (b[i][j] != 0)
					{
						a[i][j] += 2 * b[i][j];
						if (i > 1 && j > 1)
						{
							a[i - 1][j - 1] += b[i][j];
						}
						if (i > 1)
						{
							a[i - 1][j] += b[i][j];
						}
						if (i > 1 && j < 9)
						{
							a[i - 1][j + 1] += b[i][j];
						}
						if (j < 9)
						{
							a[i][j + 1] += b[i][j];
						}
						if (j < 9 && i < 9)
						{
							a[i + 1][j + 1] += b[i][j];
						}
						if (i < 9)
						{
							a[i + 1][j] += b[i][j];
						}
						if (i < 9 && j > 1)
						{
							a[i + 1][j - 1] += b[i][j];
						}
						if (j > 1)
						{
							a[i][j - 1] += b[i][j];
						}
					}
				}
			}
			for (i = 1; i < 9; i++)
			{
				for (j = 1; j < 9; j++)
				{
					b[i][j] = a[i][j];
				}
			}
			fanzhi(day + 1);
		}
	}
	public static int n;
	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];

	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[5][5] = m;
		fanzhi(1);

		for (int i = 1; i < 10; i++)
		{
			System.out.print(a[i][1]);
			for (int j = 2; j < 10; j++)
			{
				System.out.print(' ');
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

