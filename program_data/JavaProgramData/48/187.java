package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static void bac(int n)
	{
		int i;
		int j;
		int[][] b = new int[10][10];
		if (n == 0)
		{
			return;
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				if (a[i][j] != 0)
				{

					b[i - 1][j] += a[i][j];
					b[i + 1][j] += a[i][j];
					b[i - 1][j - 1] += a[i][j];
					b[i - 1][j + 1] += a[i][j];
					b[i + 1][j - 1] += a[i][j];
					b[i + 1][j + 1] += a[i][j];
					b[i][j - 1] += a[i][j];
					b[i][j + 1] += a[i][j];
					a[i][j] = a[i][j] * 2;
				}
			}
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				a[i][j] += b[i][j];
			}
		}
		bac(n - 1);
		return;

	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		bac(n);
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 8; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][j]);
			System.out.print("\n");
		}
		return 0;
	}
}

