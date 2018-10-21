package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int k;
		int i;
		int j;
		int l;
		int m;
		int n;
		int x = 0;
		int y = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l <= k;l++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					x = x + a[i][j];
				}
			}
			for (i = 2;i <= m - 1;i++)
			{
				for (j = 2;j <= n - 1;j++)
				{
					y = y + a[i][j];
				}
			}
			System.out.print(x - y);
			System.out.print("\n");
			x = 0;
			y = 0;
		}
		return 0;
	}
}

