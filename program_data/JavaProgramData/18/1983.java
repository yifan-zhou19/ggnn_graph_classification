package <missing>;

public class GlobalMembers
{
	//?????????
	public static int[][] a = new int[100][100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static int xiao(int n)
	{
		int x;
		for (int i = 0; i < n;i++)
		{
			int min = INT_MAX;
			for (int j = 0; j < n; j++)
			{
				if (a[b[i]][c[j]] < min)
				{
					min = a[b[i]][b[j]];
				}
			}
			for (int j = 0; j < n; j++)
			{
				a[b[i]][c[j]] -= min;
			}
		}
		for (int i = 0; i < n;i++)
		{
			int min = INT_MAX;
			for (int j = 0; j < n; j++)
			{
				if (a[b[j]][c[i]] <= min)
				{
					min = a[b[j]][b[i]];
				}
			}
			for (int j = 0; j < n; j++)
			{
				a[b[j]][c[i]] -= min;
			}
		}
		x = a[b[1]][c[1]];
		if (n > 2)
		{
			for (int i = 1; i < n - 1; i++)
			{
				b[i] = b[i + 1];
				c[i] = c[i + 1];
			}
			return (x + xiao(n - 1));
		}
		else
		{
			return x;
		}
	}
	public static int Main()
	{
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int i = 0; i < n; i++)
			{
				b[i] = c[i] = i;
			}
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(xiao(n));
			System.out.print("\n");
		}

		return 0;
	}
}

