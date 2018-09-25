package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[101][101];
	public static int n;
	public static int rowmin(int i)
	{
		int minr = INT_MAX;
		for (int i1 = 0; i1 < n; i1++)
		{
			if (a[i][i1] < minr && a[i][i1] >= 0)
			{
				minr = a[i][i1];
			}
		}
		return minr;
	}
	public static int colmin(int i)
	{
		int minc = INT_MAX;
		for (int i1 = 0; i1 < n; i1++)
		{
			if (a[i1][i] < minc && a[i1][i] >= 0)
			{
				minc = a[i1][i];
			}
		}
		return minc;
	}
	public static int Main()
	{
		int t;
		int k;
		int sum;
		int min;
		int minc;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1; t <= n; t++)
		{
			k = 1;
			sum = 0;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (k < n)
			{
				for (i = 0; i < n; i++)
				{
					min = rowmin(i);
					for (j = 0; j < n; j++)
					{
						a[i][j] -= min;
					}
				}
				for (i = 0; i < n; i++)
				{
					min = colmin(i);
					for (j = 0; j < n; j++)
					{
						a[j][i] -= min;
					}
				}
				sum += a[k][k];
				for (i = 0; i < n; i++)
				{
					a[i][k] = -1;
				}
				for (i = 0; i < n; i++)
				{
					a[k][i] = -1;
				}
				k++;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

