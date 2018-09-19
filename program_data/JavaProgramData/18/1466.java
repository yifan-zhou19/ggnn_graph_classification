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
		int[][] a = new int[100][100];
		int min = 0;
		int[] sum = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++) //n???
		{
			sum[k] = 0;
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (l = 1;l <= n - 1;l++) //????n-1???
		{
			for (i = 0;i <= n - l;i++) //???
			{
				min = a[i][0];
			for (j = 1;j <= n - l;j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0;j <= n - l;j++)
			{
				a[i][j] = a[i][j] - min;
			}
			}
			for (j = 0;j <= n - l;j++) //???
			{
				min = a[0][j];
				for (i = 1;i <= n - l;i++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				for (i = 0;i <= n - l;i++)
				{
					a[i][j] = a[i][j] - min;
				}
			}

			sum[k] = sum[k] + a[1][1];

			{
				for (j = 0;j <= n - l;j++)
				{
					for (i = 1;i <= n - l - 1;i++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
				for (i = 0;i <= n - l - 1;i++)
				{
					for (j = 1;j <= n - l - 1;j++)
					{
						a[i][j] = a[i][j + 1];
					}
				}
			}

		}
		}
		for (k = 1;k <= n;k++)
		{
			System.out.printf("%d\n",sum[k]);
		}
		return 0;
	}
}

