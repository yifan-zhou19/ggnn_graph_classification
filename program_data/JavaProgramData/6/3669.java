package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int i;
		int j;
		int k;
		int r;
		int p;
		int t;
		int m;
		int n;
		int s;


		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 1; p <= t; p++)
		{
			s = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (j = 1;j <= m;j++)
			{
				for (k = 1;k <= n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (m == 1 && n == 1)
			{
				System.out.print(a[1][1]);
				continue;
			}
			for (i = 1; i <= n; i++)
			{
				s = s + a[1][i] + a[m][i];
			}
			for (r = 1; r <= m; r++)
			{
				s = s + a[r][1] + a[r][n];
			}
			s = s - a[1][1] - a[1][n] - a[m][1] - a[m][n];
			System.out.print(s);
			System.out.print("\n");
		}

		return 0;
	}


}

