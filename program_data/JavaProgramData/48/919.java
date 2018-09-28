package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[10][10];
		int k;
		int[][] b = new int[10][10];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (k = 1; k <= n; k++)
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					if (a[i][j] != 0)
					{
						b[i][j] += 2 * a[i][j];
						b[i][j - 1] += a[i][j];
						b[i][j + 1] += a[i][j];
						b[i - 1][j] += a[i][j];
						b[i + 1][j] += a[i][j];
						b[i - 1][j - 1] += a[i][j];
						b[i + 1][j - 1] += a[i][j];
						b[i - 1][j + 1] += a[i][j];
						b[i + 1][j + 1] += a[i][j];
					}
				}
			}
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					a[i][j] = b[i][j];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 8; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}
		return 0;
	}

}

