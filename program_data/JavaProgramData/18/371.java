package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int min;
		int sum;
		int[][] a = new int[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			l = n;
			sum = 0;
			while (n >= 2)
			{
				for (j = 1;j <= n;j++)
				{
					min = a[j][1];
					for (k = 1;k <= n;k++)
					{
						if (a[j][k] < min)
						{
							min = a[j][k];
						}
					}
					for (k = 1;k <= n;k++)
					{
						a[j][k] -= min;
					}
				}
				for (k = 1;k <= n;k++)
				{
					min = a[1][k];
					for (j = 1;j <= n;j++)
					{
						if (a[j][k] < min)
						{
							min = a[j][k];
						}
					}
					for (j = 1;j <= n;j++)
					{
						a[j][k] -= min;
					}
				}
				sum += a[2][2];
				for (j = 2;j <= n - 1;j++)
				{
					for (k = 1;k <= n;k++)
					{
						a[j][k] = a[j + 1][k];
					}
				}
				for (k = 2;k <= n - 1;k++)
				{
					for (j = 1;j <= n - 1;j++)
					{
						a[j][k] = a[j][k + 1];
					}
				}
				n--;
			}
			n = l;
			System.out.print(sum);
			System.out.print("\n");
		}
	}

}

