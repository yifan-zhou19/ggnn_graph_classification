package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int n;
		int sum = 0;
		int k;
		int l;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++) //n???
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (l = 1; l < n ; l++) //??n-1?
			{
				for (i = 0; i < n; i++) // - row min
				{
					min = a[i][0];
					for (j = 1; j < n; j++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (j = 0; j < n; j++)
					{
						a[i][j] -= min;
					}
				}
				for (j = 0; j < n; j++) // - col min
				{
					min = a[0][j];
					for (i = 1; i < n; i++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (i = 0; i < n; i++)
					{
						a[i][j] -= min;
					}

				}

				sum += a[1][1];

				for (i = 2; i < n; i++)
				{
					for (j = 0; j < n; j++)
					{
						a[i - 1][j] = a[i][j];
					}
				}
				for (j = 2; j < n; j++)
				{
					for (i = 0; i < n; i++)
					{
						a[i][j - 1] = a[i][j];
					}
				}

			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

