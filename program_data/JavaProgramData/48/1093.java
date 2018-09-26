package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????   **
	//*?????? 1300012861 **
	//*???2013.12.04  **
	//********************************
	public static int[][] a = new int[12][12];
	public static int[][] b = new int[12][12];
	public static int m;
	public static int n;
	public static void result(int day, int[][] a)
	{
		int i;
		int j;
		if (day == n) //??????
		{
			for (i = 1; i <= 9; i++) //?????
			{
				for (j = 1; j < 9; j++)
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
				System.out.print(a[i][9]);
				System.out.print("\n");
				System.out.print("\n");
			}
			return;
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				if (a[i][j] != 0)
				{
					b[i][j] = a[i][j]; //???????? ????
				}
			}
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				if (b[i][j] != 0) //???????
				{
					a[i][j] += b[i][j]; //????2?
					a[i - 1][j - 1] += b[i][j]; //?????????
					a[i - 1][j] += b[i][j];
					a[i - 1][j + 1] += b[i][j];
					a[i][j - 1] += b[i][j];
					a[i][j + 1] += b[i][j];
					a[i + 1][j - 1] += b[i][j];
					a[i + 1][j] += b[i][j];
					a[i + 1][j + 1] += b[i][j];
				}
			}
		}
		result(day + 1, a); //???????
		return;
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m; //????????
		result(0, a); //???????
		return 0;
	}
}

