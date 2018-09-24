package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[20][20];
	public static int[][] b = new int[20][20];
	public static int n;
	public static int m;
	public static void day(int x)
	{
		if (x == n + 1)
		{
			return;
		}
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j <= 9;j++)
			{
				b[i][j] = 0;
			}
		}
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j <= 9;j++)
			{
				b[i][j] += a[i][j];
				b[i - 1][j] += a[i][j];
				b[i + 1][j] += a[i][j];
				b[i][j - 1] += a[i][j];
				b[i][j + 1] += a[i][j];
				b[i - 1][j - 1] += a[i][j];
				b[i - 1][j + 1] += a[i][j];
				b[i + 1][j - 1] += a[i][j];
				b[i + 1][j + 1] += a[i][j];
			}
		}
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j <= 9;j++)
			{
				a[i][j] += b[i][j];
			}
		}
		day(x + 1);
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		day(1);
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j <= 8;j++)
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

