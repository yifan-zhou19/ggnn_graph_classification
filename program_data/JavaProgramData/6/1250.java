package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int c;
		int i;
		int j;
		int m;
		int n;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (c = 1;c <= k;c++)
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
			int sum;
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			for (i = 1;i <= m;i++)
			{
				sum1 = sum1 + a[i][1];
				sum2 = sum2 + a[i][n];
			}
			for (j = 1;j <= n;j++)
			{
				sum3 = sum3 + a[1][j];
				sum4 = sum4 + a[m][j];
			}
			sum = sum1 + sum2 + sum3 + sum4 - a[1][1] - a[1][n] - a[m][1] - a[m][n];
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

