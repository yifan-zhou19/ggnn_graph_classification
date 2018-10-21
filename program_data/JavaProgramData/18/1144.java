package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static void ope(int m, int[][] a)
	{
		if (m == 1)
		{
			return;
		}
		else
		{
			int i;
			int j;
			int q;
			int min = 100000;
			for (i = 0; i <= m - 1; i++)
			{
				for (j = 0; j <= m - 1; j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				for (q = 0; q <= m - 1; q++)
				{
					a[i][q] = a[i][q] - min;
				}
				min = 100000;
			}
			for (i = 0; i <= m - 1; i++)
			{
				for (j = 0; j <= m - 1; j++)
				{
					if (a[j][i] < min)
					{
						min = a[j][i];
					}
				}
				for (q = 0; q <= m - 1; q++)
				{
					a[q][i] = a[q][i] - min;
				}
				min = 100000;
			}
			sum = sum + a[1][1];
			for (i = 2; i <= m - 1; i++)
			{
				for (j = 2; j <= m - 1; j++)
				{
					a[i - 1][j - 1] = a[i][j];
				}
				a[0][i - 1] = a[0][i];
				a[i - 1][0] = a[i][0];
			}
			ope(m - 1, a);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[101][101];
		int i;
		int j;
		int k;
		for (k = 1; k <= n; k++)
		{
			for (i = 0; i <= n - 1; i++)
			{
				for (j = 0; j <= n - 1; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0;
			ope(n, a);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

