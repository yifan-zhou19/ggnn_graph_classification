package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static void copy()
	{
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				a[i][j] = b[i][j];
			}
		}
	}
	public static void guil()
	{
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				b[i][j] = 0;
			}
		}
	}


	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (int k = 1;k <= n;k++)
		{
			guil();
			for (int i = 0;i < 9;i++)
			{
				for (int j = 0;j < 9;j++)
				{
					if (a[i][j] != 0)
					{

							b[i][j] += 2 * a[i][j];
							b[i][j - 1] += a[i][j];
							b[i][j + 1] += a[i][j];
							b[i - 1][j - 1] += a[i][j];
							b[i - 1][j] += a[i][j];
							b[i - 1][j + 1] += a[i][j];
							b[i + 1][j - 1] += a[i][j];
							b[i + 1][j] += a[i][j];
							b[i + 1][j + 1] += a[i][j];

					}
				}
			}
			copy();
		}

		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 8;j++)
			{
				System.out.print(b[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][8]);
			System.out.print("\n");
		}
		return 0;
	}
}

