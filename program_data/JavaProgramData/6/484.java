package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i = 1;
		int j;
		int[][] a = new int[101][101];
		int s;
		int k;
		int sum1;
		int sum2;
		int sum3;
		int sum4;
		int sum;
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= s)
		{
			sum1 = 0;
			sum2 = 0;
			sum3 = 0;
			sum4 = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0;j < n;j++)
			{
				sum1 += a[0][j];
			}
			for (j = 0;j < n;j++)
			{
				sum2 += a[m - 1][j];
			}
			for (j = 0;j < m;j++)
			{
				sum3 += a[j][0];
			}
			for (j = 0;j < m;j++)
			{
				sum4 += a[j][n - 1];
			}
			sum = sum1 + sum2 + sum3 + sum4;
			System.out.print(sum - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1]);
			System.out.print("\n");
			i++;
		}
		return 0;
	}
}

