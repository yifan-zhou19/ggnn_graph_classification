package <missing>;

public class GlobalMembers
{
	public static void min(int[][] a, int n)
	{
		int i;
		int j;
		int k;
		int m;
		int x;
		int y;
		int sum = 0;
		for (m = n;m > 1;m--)
		{
			for (i = 0;i < m;i++)
			{
				x = a[i][0];
				for (j = 1;j < m;j++)
				{
					if (x > a[i][j])
					{
						x = a[i][j];
					}
				}
				for (k = 0;k < m;k++)
				{
					a[i][k] -= x;
				}
			}
			for (i = 0;i < m;i++)
			{
				y = a[0][i];
				for (j = 1;j < m;j++)
				{
					if (y > a[j][i])
					{
						y = a[j][i];
					}
				}
				for (k = 0;k < m;k++)
				{
					a[k][i] -= y;
				}
			}
			sum += a[1][1];
			newa(a, m);
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	public static void newa(int[][] a, int m)
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 2;j < m;j++)
			{
				a[i][j - 1] = a[i][j];
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 2;j < m;j++)
			{
				a[j - 1][i] = a[j][i];
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			min(a, n);
		}
		return 0;
	}

}

