package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int h;
		int l;
		int result = 0;
		int[][] a = new int[101][101];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (h = 1;h <= m;h++)
			{
				for (l = 1;l <= n;l++)
				{
					a[h][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (l = 1;l <= n;l++)
			{
				result = result + a[1][l] + a[m][l];
			}
			for (h = 2;h <= m - 1;h++)
			{
				result = result + a[h][1] + a[h][n];
			}
			System.out.print(result);
			System.out.print("\n");
			for (h = 1;h <= m;h++)
			{
				for (l = 1;l <= n;l++)
				{
					a[h][l] = 0;
				}
			}
			result = 0;
		}
		return 0;
	}

}

