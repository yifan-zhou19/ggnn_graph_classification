package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static int n = 0;
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static void f(int day)
	{
		if (day > n)
		{
		}
		else
		{
			for (int i = 1;i <= 7;i++)
			{
				for (int j = 1;j <= 7;j++)
				{
					a[i][j] += b[i][j];
					a[i - 1][j] += b[i][j];
					a[i + 1][j] += b[i][j];
					a[i][j - 1] += b[i][j];
					a[i][j + 1] += b[i][j];
					a[i - 1][j - 1] += b[i][j];
					a[i + 1][j + 1] += b[i][j];
					a[i - 1][j + 1] += b[i][j];
					a[i + 1][j - 1] += b[i][j];
				}
			}
			for (int x = 0;x <= 8;x++)
			{
				for (int y = 0;y <= 8;y++)
				{
					b[x][y] = a[x][y];
				}
			}
			f(day + 1);
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		b[4][4] = m;
		f(1);
		for (int p = 0;p <= 8;p++)
		{
			System.out.print(a[p][0]);
			for (int q = 1;q <= 8;q++)
			{
				System.out.print(" ");
				System.out.print(a[p][q]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

