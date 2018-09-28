package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int count;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (count = 0; count < k; count++)
		{
			int i;
			int j;
			int n;
			int m;
			int[][] a = new int[100][100];
			int sum = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < m; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 1; j < m - 1; j++)
			{
				sum = sum + a[0][j] + a[n - 1][j];
			}
			for (i = 0; i < n; i++)
			{
				sum = sum + a[i][0] + a[i][m - 1];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

