package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int l;
	public static int tot = 0;
	public static int sum(int[][] a, int n)
	{
		if (n == 1)
		{
			return tot;
		}
		for (i = 0;i <= n - 1;i++)
		{
			l = a[i][0];
			for (j = 0;j <= n - 2;j++)
			{
				l = Math.min(l,a[i][j + 1]);
			}
			for (j = 0;j <= n - 1;j++)
			{
				a[i][j] -= l;
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			l = a[0][j];
			for (i = 0;i <= n - 2;i++)
			{
				l = Math.min(l,a[i + 1][j]);
			}
			for (i = 0;i <= n - 1;i++)
			{
				a[i][j] -= l;
			}
		}
		tot += a[1][1];
		for (i = 1;i <= n - 2;i++)
		{
			for (j = 1;j <= n - 2;j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
		for (i = 1;i <= n - 2;i++)
		{
			a[i][0] = a[i + 1][0];
		}
		for (j = 1;j <= n - 2;j++)
		{
			a[0][j] = a[0][j + 1];
		}
		n--;
		sum(a, n);
	}
	public static int Main()
	{
		int[][] a = new int[101][101];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i <= n - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(sum(a, n));
			System.out.print("\n");
			tot = 0;
		}
		return 0;
	}
}

