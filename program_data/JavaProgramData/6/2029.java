package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= k; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			for (j = 1; j <= m; j++)
			{
				for (l = 1; l <= n; l++)
				{
					a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (j == 1 || j == m || l == 1 || l == n)
					{
						sum += a[j][l];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

