package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[200][200];
	public static int sum = 0;
	public static void xj(int n)
	{
		int i;
		int j;
		if (n >= 2)
		{
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = a[i + 1][j];
				}
			}
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[j][i] = a[j][i + 1];
				}
			}
		}
	}

	public static void gl(int n)
	{
		int i;
		int j;
		if (n >= 2)
		{
			for (i = 0;i < n;i++)
			{
				int min = a[i][0];
				for (j = 1;j < n;j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				for (j = 0;j < n;j++)
				{
					a[i][j] -= min;
				}
			}
			for (i = 0;i < n;i++)
			{
				int min = a[0][i];
				for (j = 1;j < n;j++)
				{
					if (a[j][i] < min)
					{
						min = a[j][i];
					}
				}
				for (j = 0;j < n;j++)
				{
					a[j][i] -= min;
				}
			}
			sum += a[1][1];
			xj(n);
			gl(n - 1);
		}
		else
		{
			return;
		}
	}
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			sum = 0;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			gl(n);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

