package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[25][25];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n + 2;i++)
		{
				a[0][i] = 0;
				a[m + 1][i] = 0;
		}
		for (int i = 1;i < m + 1;i++)
		{
				a[i][0] = 0;
				a[i][n + 1] = 0;
				for (int j = 1;j < n + 1;j++)
				{
						a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		for (int i = 1;i < m + 1;i++)
		{
				for (int j = 1;j < n + 1;j++)
				{
						if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
						{
						System.out.print(i - 1);
						System.out.print(' ');
						System.out.print(j - 1);
						System.out.print("\n");
						}
				}
		}

		return 0;
	}
}

