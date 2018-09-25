package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[101][101];
	public static int xiao(int n)
	{
		int i;
		int j;
		int t;
		int[] minh = new int[101];
		int[] minl = new int[101];
		int temp = 0;
		if (n == 2)
		{
			for (i = 0; i < n; i++)
			{
			minh[i] = a[i][0];
			for (j = 0; j < n; j++)
			{
				if (a[i][j] < minh[i])
				{
					minh[i] = a[i][j];
				}
			}
			for (t = 0; t < n; t++)
			{
				a[i][t] -= minh[i];
			}
			}
		for (i = 0; i < n; i++)
		{
			minl[i] = a[0][i];
			for (j = 0; j < n; j++)
			{
				if (a[j][i] < minl[i])
				{
					minl[i] = a[j][i];
				}
			}
			for (t = 0; t < n; t++)
			{
				a[t][i] -= minl[i];
			}
		}
			return a[1][1];
		}
		if (n >= 2)
		{
		for (i = 0; i < n; i++)
		{
			minh[i] = a[i][0];
			for (j = 0; j < n; j++)
			{
				if (a[i][j] < minh[i])
				{
					minh[i] = a[i][j];
				}
			}
			for (t = 0; t < n; t++)
			{
				a[i][t] -= minh[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			minl[i] = a[0][i];
			for (j = 0; j < n; j++)
			{
				if (a[j][i] < minl[i])
				{
					minl[i] = a[j][i];
				}
			}
			for (t = 0; t < n; t++)
			{
				a[t][i] -= minl[i];
			}
		}
		temp = a[1][1];
		for (i = 2;i < n;i++)
		{
			a[i - 1][0] = a[i][0];
			a[0][i - 1] = a[0][i];
			for (j = 2;j < n;j++)
			{
				a[i - 1][j - 1] = a[i][j];
			}
		}
		return temp + xiao(n - 1);
		}
	}
	public static int Main()
	{
		int n;
		int k;
		int l;
		int m;
		int[] ans = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;m <= n;m++)
		{
			for (k = 0; k < n; k++)
			{
				for (l = 0; l < n; l++)
				{
					a[k][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			ans[m] = xiao(n);
		}
		for (k = 1;k <= n;k++)
		{
			System.out.print(ans[k]);
			System.out.print("\n");
		}
		int f;
		f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;

	}

}

