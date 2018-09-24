package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];

	public static void zuo(int x)
	{
		if (x == n)
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j < 9; j++)
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
				System.out.print(a[i][9]);
				System.out.print("\n");
			}
		}
		else
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					b[i][j] = a[i + 1][j + 1] + a[i][j] + a[i + 1][j - 1] + a[i - 1][j + 1] + a[i + 1][j] + a[i - 1][j] + a[i][j + 1] + a[i][j - 1] + a[i - 1][j - 1];
				}
			}

			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					a[i][j] += b[i][j];
					b[i][j] = 0;
				}
			}
			zuo(x + 1);
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		zuo(0);
		return 0;
	}


}

