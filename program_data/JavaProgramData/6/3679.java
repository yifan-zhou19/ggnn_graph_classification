package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int max = 100;
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num-- != 0)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[max][max];
			int i;
			int j;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			for (j = 0;j < n;j++)
			{
				if (m == 1)
				{
					sum += a[0][j];
				}
				else
				{
					sum += a[0][j];
					sum += a[m - 1][j];
				}
			}
			for (i = 1;i < m - 1;i++)
			{
				if (n == 1)
				{
					sum += a[i][0];
				}
				else
				{
					sum += a[i][0];
					sum += a[i][n - 1];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

