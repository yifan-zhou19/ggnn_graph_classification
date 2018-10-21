package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static void xijunfanzhi(int day)
	{
		int i;
		int j;
		if (day == n + 1)
		{
			return;
		}
		else
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (a[i][j] != 0)
					{
						b[i + 1][j] = b[i + 1][j] + a[i][j];
						b[i - 1][j] = b[i - 1][j] + a[i][j];
						b[i + 1][j + 1] = b[i + 1][j + 1] + a[i][j];
						b[i + 1][j - 1] = b[i + 1][j - 1] + a[i][j];
						b[i - 1][j + 1] = b[i - 1][j + 1] + a[i][j];
						b[i - 1][j - 1] = b[i - 1][j - 1] + a[i][j];
						b[i][j + 1] = b[i][j + 1] + a[i][j];
						b[i][j - 1] = b[i][j - 1] + a[i][j];
						b[i][j] = b[i][j] + a[i][j];

					}

				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = a[i][j] + b[i][j];
					b[i][j] = 0;
				}
			}
			xijunfanzhi(day + 1);

		}
	}
	public static int Main()
	{
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		xijunfanzhi(1);
		for (i = 0;i < 9;i++)
		{

			for (j = 0;j < 9;j++)
			{
				if (j != 8)
				{
				System.out.print(a[i][j]);
				System.out.print(' ');
				}
				else
				{
				System.out.print(a[i][j]);
				System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

