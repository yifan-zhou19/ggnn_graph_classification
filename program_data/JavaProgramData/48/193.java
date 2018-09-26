package <missing>;

public class GlobalMembers
{
	//********************************
	//* ??? ????????                      
	//* ?????                   *
	//********************************
	public static int[][] a = new int[9][9]; //??????????
	public static int[][] b = new int[9][9]; //??????????

	public static void f(int n)
	{
		int i;
		int j;
		if (n > 0)
		{
		for (i = 1;i <= 7;i++)
		{
			for (j = 1;j <= 7;j++)
			{
				if (a[i][j] > 0)
				{
					b[i][j] += 2 * a[i][j];
					b[i][j + 1] += a[i][j];
					b[i][j - 1] += a[i][j];
					b[i + 1][j] += a[i][j];
					b[i - 1][j] += a[i][j];
					b[i - 1][j + 1] += a[i][j];
					b[i + 1][j - 1] += a[i][j];
					b[i + 1][j + 1] += a[i][j];
					b[i - 1][j - 1] += a[i][j];
				}
			}
		}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i][j];
					b[i][j] = 0;
				}
			}
				f(n - 1);
		}
		else if (n == 0)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (j == 0)
					{
						System.out.print(a[i][j]);
					}
					else
					{
						System.out.print(" ");
						System.out.print(a[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		int m;
		int day;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		f(day);
		return 0;
	}
}

