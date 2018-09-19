package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int sum;
		int min;
		int[][] a = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (k = n;k > 1;k--)
			{
				for (i = 0;i < k;i++)
				{
					min = a[i][0];
					for (j = 0;j < k;j++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (j = 0;j < k;j++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				for (j = 0;j < k;j++)
				{
					min = a[0][j];
					for (i = 0;i < k;i++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (i = 0;i < k;i++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				sum = sum + a[1][1];
				for (i = 2;i < k;i++)
				{
					for (j = 0;j < k;j++)
					{
						a[i - 1][j] = a[i][j];
					}
				}
				for (j = 2;j < k;j++)
				{
					for (i = 0;i < k - 1;i++)
					{
						a[i][j - 1] = a[i][j];
					}
				}

			}
			System.out.printf("%d\n",sum);
		}



		return 0;
	}
}

