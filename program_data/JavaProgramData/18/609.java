package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[101][101];
		int[] small = new int[101];
		int sum = 0;
		int i;
		int j;
		int k;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			sum = 0;
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 1;j <= n - 1;j++) //??
			{
				for (k = 1;k <= n - j + 1;k++) //?????
				{
					small[k] = a[k][1];
				}
				for (k = 1;k <= n - j + 1;k++)
				{
					for (l = 1;l <= n - j + 1;l++)
					{
						if (a[k][l] < small[k])
						{
							small[k] = a[k][l];
						}
					}
				}
				for (k = 1;k <= n - j + 1;k++)
				{
					for (l = 1;l <= n - j + 1;l++)
					{
						a[k][l] = a[k][l] - small[k];
					}
				}

				for (k = 1;k <= n - j + 1;k++) //?????
				{
					small[k] = a[1][k];
				}
				for (l = 1;l <= n - j + 1;l++)
				{
					for (k = 1;k <= n - j + 1;k++)
					{
						if (a[k][l] < small[l])
						{
							small[l] = a[k][l];
						}
					}
				}
				for (l = 1;l <= n - j + 1;l++)
				{
					for (k = 1;k <= n - j + 1;k++)
					{
						a[k][l] = a[k][l] - small[l];
					}
				}

				sum = sum + a[2][2];
				for (k = 2;k <= n - j + 1;k++)
				{
					for (l = 1;l <= n - j + 1;l++)
					{
						a[k][l] = a[k + 1][l];
					}
				}
				for (k = 1;k <= n - j + 1;k++)
				{
					for (l = 2;l <= n - j + 1;l++)
					{
						a[k][l] = a[k][l + 1];
					}
				}
			}
			System.out.print(sum);
			System.out.print('\n');
		}
		return 0;
	}





}

