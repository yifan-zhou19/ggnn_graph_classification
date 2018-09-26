package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= k; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int r;
			int s;
			for (r = 0; r < m; r++)
			{
				for (s = 0; s < n; s++)
				{
					a[r][s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			for (r = 0; r < m; r++)
			{
				for (s = 0; s < n; s++)
				{
					if (r == 0 || r == m - 1 || s == 0 || s == n - 1)
					{
						sum = sum + a[r][s];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

