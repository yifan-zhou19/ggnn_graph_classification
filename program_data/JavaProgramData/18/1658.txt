package <missing>;

public class GlobalMembers
{
	public static int min(int[][] a, int s, int l, int n)
	{
		int t;
		if (s == 0)
		{
			t = a[l][0];
			for (int i = 0; i < n; i++)
			{
				if (t > a[l][i])
				{
					t = a[l][i];
				}
			}
		}
		else
		{
			t = a[0][l];
			for (int j = 0; j < n; j++)
			{
				if (t > a[j][l])
				{
					t = a[j][l];
				}
			}
		}
		return t;
	}
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int m;
		int j;
		int k;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			m = 0;
			for (int l = 0; l < n - 1; l++)
			{
				for (j = 0; j < n - l; j++)
				{
					t = min(a, 0, j, n - l);
					for (k = 0; k < n - l; k++)
					{
						a[j][k] -= t;
					}
				}
				for (j = 0; j < n - l; j++)
				{
					t = min(a, 1, j, n - l);
					for (k = 0; k < n - l; k++)
					{
						a[k][j] -= t;
					}
				}
				m += a[1][1];
				for (j = 0; j < n - l; j++)
				{
					for (k = 1; k < n - l - 1; k++)
					{
						a[j][k] = a[j][k + 1];
					}
				}
				for (j = 0; j < n - l - 1; j++)
				{
					for (k = 1; k < n - l - 1; k++)
					{
						a[k][j] = a[k + 1][j];
					}
				}
			}
			System.out.print(m);
			System.out.print("\n");
		}
		return 0;
	}
}

