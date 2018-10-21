package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int p = 0;
		int[][] a = new int[23][23];
		int i = 0;
		int j = 0;
		int[] b = new int[401];
		int[] c = new int[401];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j <= n + 1;j++)
		{
			a[0][j] = 0;
			a[m + 1][j] = 0;
		}
		for (i = 0;i <= m + 1;i++)
		{
			a[i][0] = 0;
			a[i][n + 1] = 0;
		}
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
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
					{
						b[p] = i - 1;
						c[p] = j - 1;
						p++;
					}
				}
			}
				for (i = 0;i < p;i++)
				{
					System.out.print(b[i]);
					System.out.print(" ");
					System.out.print(c[i]);
					System.out.print("\n");
				}
				return 0;
	}
}

