package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[m][n];
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			int[] p = new int[n];
			p = a;
			for (j = 0; j < n - 1; j++)
			{
				sum += *(p[0] + j);
			}
			for (i = 0; i < m - 1; i++)
			{
				sum += *(p[i] + n - 1);
			}
			for (j = 1; j < n; j++)
			{
				sum += *(p[m - 1] + j);
			}
			for (i = 1; i < m; i++)
			{
				sum += p[i];
			}
				System.out.print(sum);
				System.out.print("\n");

		}
		return 0;
	}

}

