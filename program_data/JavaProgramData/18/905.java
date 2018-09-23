package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int n1 = n;
	while (n1 != 0)
	{
		int[][] a = new int[n][n];
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = n;i > 1;i--)
		{
			for (j = 0;j < i;j++)
			{
				int min = a[j][0];
				for (k = 1;k < i;k++)
				{
					if (a[j][k] < min)
					{
						min = a[j][k];
					}
				}
				for (k = 0;k < i;k++)
				{
					a[j][k] = a[j][k] - min;
				}
			}
			for (j = 0;j < i;j++)
			{
				int min = a[0][j];
				for (k = 1;k < i;k++)
				{
					if (a[k][j] < min)
					{
						min = a[k][j];
					}
				}
				for (k = 0;k < i;k++)
				{
					a[k][j] = a[k][j] - min;
				}

			}
			sum = sum + a[1][1];
			for (j = 2;j < i;j++)
			{
				for (k = 0;k < i;k++)
				{
					a[k][j - 1] = a[k][j];
				}
			}
			for (j = 2;j < i;j++)
			{
				for (k = 0;k < i;k++)
				{
					a[j - 1][k] = a[j][k];
				}
			}

		}
		System.out.print(sum);
		System.out.print("\n");
	n1--;
	}
	}

}

