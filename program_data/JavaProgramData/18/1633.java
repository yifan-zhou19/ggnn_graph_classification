package <missing>;

public class GlobalMembers
{
	public static int f(int n, int[][] a)
	{
		int i;
		int j;
		int min;
		int k;
		for (i = 1; i <= n; i++)
		{
			min = a[i][1];
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 1; j <= n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (i = 1; i <= n; i++)
		{
			min = a[1][i];
			for (j = 1; j <= n; j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (j = 1; j <= n; j++)
			{
					a[j][i] -= min;
			}
		}
		if (n == 2)
		{
			return a[2][2];
		}
		else
		{
			k = a[2][2];
			for (i = 3; i <= n; i++)
			{
				a[1][i - 1] = a[1][i];
				a[i - 1][1] = a[i][1];
			}
			for (i = 3; i <= n; i++)
			{
				for (j = 3; j <= n; j++)
				{
					a[i - 1][j - 1] = a[i][j];
				}
			}
			n--;
			return k + f(n, a);
		}
	}
	public static int Main()
	{
		int[][] a = new int[101][101];
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(f(n, a));
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
		}
		return 0;
	}
}

