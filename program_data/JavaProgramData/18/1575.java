package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[110][110];
	public static int[] rmin = new int[110];
	public static int[] cmin = new int[110];
	public static void clear(int n)
	{
		for (int i = 0;i < n;i++)
		{
			rmin[i] = a[i][0];
			for (int j = 0;j < n;j++)
			{
				if (a[i][j] < rmin[i])
				{
					rmin[i] = a[i][j];
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - rmin[i];
			}
		}
		for (int i = 0;i < n;i++)
		{
			cmin[i] = a[0][i];
			for (int j = 0;j < n;j++)
			{
				if (a[j][i] < cmin[i])
				{
					cmin[i] = a[j][i];
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[j][i] = a[j][i] - cmin[i];
			}
		}
	}
	public static void del(int n)
	{
		for (int i = 1;i < n - 1;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (int i = 1;i < n - 1;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[j][i] = a[j][i + 1];
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum;
		for (int m = 0;m < n;m++)
		{
			sum = 0;
			for (int j = 0;j < n;j++)
			{
				for (int k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int i = n;i > 1;i--)
			{
				clear(i);
				sum += a[1][1];
				del(i);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

