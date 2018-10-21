package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];
	public static void fa(int i,int j)
	{
		a[i][j] = 2 * b[i][j] + b[i - 1][j] + b[i + 1][j] + b[i - 1][j - 1] + b[i - 1][j + 1] + b[i][j + 1] + b[i][j - 1] + b[i + 1][j - 1] + b[i + 1][j + 1];
	}
	public static int Main()
	{

		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i <= 10;i++)
		{
				for (j = 0;j <= 10;j++)
				{
					a[i][j] = 0;
					b[i][j] = 0;
				}
		}
		a[5][5] = m;
		for (int z = 1;z <= n;z++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = a[i][j];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					fa(i, j);
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][9]);
			System.out.print('\n');
		}
		return 0;
	}


}

