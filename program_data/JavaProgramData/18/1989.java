package <missing>;

public class GlobalMembers
{
	public static int[][][] a = new int[100][100][100];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] sum = new int[100];
		int l;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[i][j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			l = n;
			while (l > 1)
			{
				for (j = 0;j < l;j++)
				{
					min = 100000;
					for (k = 0;k < l;k++)
					{
						if (a[i][j][k] < min)
						{
							min = a[i][j][k];
						}
					}
					for (k = 0;k < l;k++)
					{
						a[i][j][k] -= min;
					}
				}
					for (k = 0;k < l;k++)
					{
					min = 100000;
					for (j = 0;j < l;j++)
					{
						if (a[i][j][k] < min)
						{
							min = a[i][j][k];
						}
					}
					for (j = 0;j < l;j++)
					{
						a[i][j][k] -= min;
					}
					}
				sum[i] += a[i][1][1];
				for (j = 2;j < l;j++)
				{
					for (k = 0;k < l;k++)
					{
						a[i][j - 1][k] = a[i][j][k];
					}
				}
				for (k = 2;k < l;k++)
				{
					for (j = 0;j < l;j++)
					{
						a[i][j][k - 1] = a[i][j][k];
					}
				}
				l--;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(sum[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

