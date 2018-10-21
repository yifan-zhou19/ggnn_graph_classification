package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[20][20];
		int i = 0;
		int j;
		int k;
		int[] x = new int[1000];
		int[] y = new int[1000];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		if (a[0][0] >= a[1][0] != 0 && a[0][0] >= a[0][1])
		{
			x[i] = 0;
			y[i] = 0;
			i++;
		}
		for (j = 1; j < n - 1; j++)
		{
			if (a[0][j] >= a[1][j] != 0 && a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[0][j + 1])
			{
				x[i] = 0;
				y[i] = j;
				i++;
			}
		}
		if (a[0][n - 1] >= a[0][n - 2] != 0 && a[0][n - 1] >= a[1][n - 1])
		{
			x[i] = 0;
			y[i] = n - 1;
			i++;
		}
		for (k = 1; k < m - 1; k++)
		{
			if (a[k][0] >= a[k - 1][0] != 0 && a[k][0] >= a[k + 1][0] != 0 && a[k][0] >= a[k][1])
			{
				x[i] = k;
				y[i] = 0;
				i++;
			}
			for (j = 1; j < n - 1; j++)
			{
				if (a[k][j] >= a[k + 1][j] != 0 && a[k][j] >= a[k - 1][j] != 0 && a[k][j] >= a[k][j - 1] != 0 && a[k][j] >= a[k][j + 1])
				{
					x[i] = k;
					y[i] = j;
					i++;
				}
			}
			if (a[k][n - 1] >= a[k - 1][n - 1] != 0 && a[k][n - 1] >= a[k + 1][n - 1] != 0 && a[k][n - 1] >= a[k][n - 2])
			{
				x[i] = k;
				y[i] = n - 1;
				i++;
			}
		}
		if (a[m - 1][0] >= a[m - 2][0] != 0 && a[m - 1][0] >= a[m - 1][1])
		{
			x[i] = m - 1;
			y[i] = 0;
			i++;
		}
		for (j = 1; j < n - 1; j++)
		{
			if (a[m - 1][j] >= a[m - 1][j + 1] != 0 && a[m - 1][j] >= a[m - 1][j - 1] != 0 && a[m - 1][j] >= a[m - 2][j])
			{
				x[i] = m - 1;
				y[i] = j;
				i++;
			}
		}
		if (a[m - 1][n - 1] >= a[m - 2][n - 1] != 0 && a[m - 1][n - 1] >= a[m - 1][n - 2])
		{
			x[i] = m - 1;
			y[i] = n - 1;
			i++;
		}
		for (j = 0; j < i; j++)
		{
			System.out.print(x[j]);
			System.out.print(" ");
			System.out.print(y[j]);
			System.out.print("\n");
		}
		return 0;
	}
}

