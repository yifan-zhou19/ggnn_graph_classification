package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int[] c = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			c[k] = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (m = n;m > 1;m--)
			{
				for (i = 0;i < m;i++)
				{
					b[i] = a[i][0];
					for (j = 1;j < m;j++)
					{
						if (b[i] > a[i][j])
						{
							b[i] = a[i][j];
						}
					}
					for (j = 0;j < m;j++)
					{
						a[i][j] = a[i][j] - b[i];
					}
				}
				for (i = 0;i < m;i++)
				{
					b[i] = a[0][i];
					for (j = 1;j < m;j++)
					{
						if (b[i] > a[j][i])
						{
							b[i] = a[j][i];
						}
					}
					for (j = 0;j < m;j++)
					{
						a[j][i] = a[j][i] - b[i];
					}
				}
				c[k] += a[1][1];
				for (i = 1;i < m - 1;i++)
				{
					a[i][0] = a[i + 1][0];
				}
				for (j = 1;j < m - 1;j++)
				{
					a[0][j] = a[0][j + 1];
				}
				for (i = 1;i < m - 1;i++)
				{
					for (j = 1;j < m - 1;j++)
					{
						a[i][j] = a[i + 1][j + 1];
					}
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			System.out.print(c[k]);
			System.out.print("\n");
		}
		return 0;
	}
}

