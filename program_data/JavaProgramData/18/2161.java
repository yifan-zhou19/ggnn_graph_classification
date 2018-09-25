package <missing>;

public class GlobalMembers
{
	public static void hang(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 2;i <= n - 1;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[j][i] = a[j][i + 1];
			}
		}
	}
	public static void lie(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 2;i <= n - 1;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}
	public static void xiaohang(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			int min = 100000000;
			for (j = 1;j <= n;j++)
			{
				if (min > a[i][j])
				{
					min = a[i][j];
				}
			}
			for (j = 1;j <= n;j++)
			{
				a[i][j] -= min;
			}
		}
	}
	public static void xiaolie(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			int min = 100000000;
			for (j = 1;j <= n;j++)
			{
				if (min > a[j][i])
				{
					min = a[j][i];
				}
			}
			for (j = 1;j <= n;j++)
			{
				a[j][i] -= min;
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int i;
		int j;
		int p;
		for (p = 1;p <= n;p++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int o;
			int sum = 0;
			int m = n;
			for (o = 1;o <= n - 1;o++)
			{
				xiaohang(a, m);
				xiaolie(a, m);
				sum += a[2][2];
				hang(a, m);
				lie(a, m);
				m--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

