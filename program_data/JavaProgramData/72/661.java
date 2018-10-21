package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[30][30];
		for (i = 0; i < 30; i++)
		{
			for (j = 0; j < 30; j++)
			{
				a[i][j] = 0;
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
				{
					System.out.print(i - 1);
					System.out.print(' ');
					System.out.print(j - 1);
					System.out.print('\n');
				}
			}
		}
		return 0;


	}

}

