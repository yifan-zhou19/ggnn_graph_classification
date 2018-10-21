package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		int[][] a = new int[101][101];
		int[] x = {0, 1, 0, -1};
		int[] y = {1, 0, -1, 0};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 1,j = 0,k = 0;
		while (a[i + x[k]][j + y[k]] != 0)
		{
			System.out.print(a[i + x[k]][j + y[k]]);
			t++;
			a[i + x[k]][j + y[k]] = 0;
			if (t < m * n)
			{
				System.out.print("\n");
			}
			i += x[k],j += y[k];
			if (a[i + x[k]][j + y[k]] == 0)
			{
				k = (k + 1) % 4;
			}
		}
	}

}

