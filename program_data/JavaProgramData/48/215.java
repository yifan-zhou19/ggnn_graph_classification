package <missing>;

public class GlobalMembers
{
	//fanzhi
	public static int[][] a = new int[10][10];
	public static void fanzhi()
	{
		int[][] b = new int[10][10];
		for (int i = 1; i < 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				b[i][j] += 2 * a[i][j];
				b[i + 1][j] += a[i][j];
				b[i - 1][j] += a[i][j];
				b[i][j + 1] += a[i][j];
				b[i][j - 1] += a[i][j];
				b[i + 1][j + 1] += a[i][j];
				b[i - 1][j - 1] += a[i][j];
				b[i + 1][j - 1] += a[i][j];
				b[i - 1][j + 1] += a[i][j];
			}
		}
		for (int i = 1; i < 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				a[i][j] = b[i][j];
			}
		}
		return;
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (int i = 0; i < n; i++)
		{
			fanzhi();
		}
		for (int i = 1; i <= 9;i++)
		{
			for (int j = 1; j <= 8; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}

		System.in.read();
		System.in.read();
		return 0;
	}

}

