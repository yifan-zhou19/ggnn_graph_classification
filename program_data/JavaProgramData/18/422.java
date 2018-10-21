package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		while (i < n)
		{
			int[][] a = new int[n][n];
			int[] b = new int[n];
			int[] c = new int[n];
			int t = 1;
			int j;
			int k;
			int sum = 0;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (t < n)
			{
				for (j = 0;j < n;j++)
				{
							if (a[j][0] < 0)
							{
								j++;
							}
							b[j] = a[j][0];
							for (k = 0;k < n;k++)
							{
								if (b[j] > a[j][k] && a[j][k] >= 0)
								{
									b[j] = a[j][k];
								}
							}
				}
				for (j = 0;j < n;j++)
				{
					for (k = 0;k < n;k++)
					{
						if (a[j][k] >= 0)
						{
						a[j][k] = a[j][k] - b[j];
						}
					}
				}
				for (j = 0;j < n;j++)
				{
					if (a[0][j] < 0)
					{
						j++;
					}
					c[j] = a[0][j];
					for (k = 0;k < n;k++)
					{
						if (c[j] > a[k][j] && a[k][j] >= 0)
						{
							c[j] = a[k][j];
						}
					}
				}
				for (j = 0;j < n;j++)
				{
					for (k = 0;k < n;k++)
					{
						if (a[k][j] >= 0)
						{
						a[k][j] = a[k][j] - c[j];
						}
					}
				}
				sum = sum + a[t][t];
				for (j = 0;j < n;j++)
				{
					a[t][j] = -1;
					a[j][t] = -1;
				}
				t++;
			}
				i++;
				System.out.print(sum);
				System.out.print("\n");
				sum = 0;
		}
		return 0;
	}
}

