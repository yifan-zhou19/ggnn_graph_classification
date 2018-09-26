package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static int s(int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		if (n == 0)
		{
			for (int i = 0;i <= 8;i++)
			{
				for (int j = 0;j <= 8;j++)
				{
					System.out.print(a[i][j]);
					if (j != 8)
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}
		else
		{
			for (int i = 0;i <= 8;i++)
			{
				for (int j = 0;j <= 8;j++)
				{
					if (a[i][j] != 0)
					{
						b[i][j] = b[i][j] + 2 * a[i][j];
						b[i][j + 1] = b[i][j + 1] + a[i][j];
						b[i][j - 1] = b[i][j - 1] + a[i][j];
						b[i + 1][j + 1] = b[i + 1][j + 1] + a[i][j];
						b[i + 1][j] = b[i + 1][j] + a[i][j];
						b[i + 1][j - 1] = b[i + 1][j - 1] + a[i][j];
						b[i - 1][j + 1] = b[i - 1][j + 1] + a[i][j];
						b[i - 1][j] = b[i - 1][j] + a[i][j];
						b[i - 1][j - 1] = b[i - 1][j - 1] + a[i][j];
					}
				}
			}
			for (int i = 0;i <= 8;i++)
			{
				for (int j = 0;j <= 8;j++)
				{
					a[i][j] = b[i][j];
				}
			}
			return s(n - 1);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		s(n);
		return 0;
	}
}

