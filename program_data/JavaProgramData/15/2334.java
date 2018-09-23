package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n][n];
		int i;
		int j;
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] == 0)
				{
					x1 = i;
					y1 = j;
				}
			}
		}

		for (i = n - 1; i >= 0; i--)
		{
			for (j = n - 1; j >= 0; j--)
			{
				if (a[i][j] == 0)
				{
					x2 = i;
					y2 = j;
				}
			}
		}

		System.out.print((x1 - x2 - 1) * (y1 - y2 - 1));

		return 0;
	}
}

