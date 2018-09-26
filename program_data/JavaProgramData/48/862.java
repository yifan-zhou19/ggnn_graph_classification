package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***???????????***
	//***??????***
	//***???2013.1.13***
	//*************************************************

	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];

	public static void f()
	{
		int i;
		int j;
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				b[i][j] = 2 * a[i][j] + a[i - 1][j] + a[i + 1][j] + a[i][j - 1] + a[i][j + 1] + a[i - 1][j - 1] + a[i - 1][j + 1] + a[i + 1][j - 1] + a[i + 1][j + 1];
			}
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				a[i][j] = b[i][j];
			}
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 11; i++)
		{
			for (j = 0; j < 11; j++)
			{
				a[i][j] = 0;
			}
		}
		a[5][5] = n;
		for (i = 0; i < m; i++)
		{
			f();
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				System.out.print(a[i][j]);
				if (j != 9)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

