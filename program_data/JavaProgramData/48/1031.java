package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				for (int k = 0; k < 9; k++)
				{
					if (a[j][k] != 0)
					{
						b[j][k] += 2 * a[j][k];
						b[j][k + 1] += a[j][k];
						b[j][k - 1] += a[j][k];
						b[j - 1][k] += a[j][k];
						b[j + 1][k] += a[j][k];
						b[j - 1][k - 1] += a[j][k];
						b[j - 1][k + 1] += a[j][k];
						b[j + 1][k - 1] += a[j][k];
						b[j + 1][k + 1] += a[j][k];
					}
				}
			}
			for (int j = 0; j <= 8; j++)
			{
				for (int k = 0; k <= 8; k++)
				{
					a[j][k] = b[j][k];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
		}
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 8; j++)
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

