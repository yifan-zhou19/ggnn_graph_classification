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
		int sum;
		int min;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (l = 0;l < n - 1;l++)
			{
			for (j = 0;j < n - l;j++)
			{
				min = a[j][0];
				for (k = 1;k < n - l;k++)
				{
					if (min > a[j][k])
					{
						min = a[j][k];
					}
				}
				for (k = 0;k < n - l;k++)
				{
					a[j][k] = a[j][k] - min;
				}
			}
			for (j = 0;j < n - l;j++)
			{
				min = a[0][j];
				for (k = 1;k < n - l;k++)
				{
					if (min > a[k][j])
					{
						min = a[k][j];
					}
				}
				for (k = 0;k < n - l;k++)
				{
					a[k][j] = a[k][j] - min;
				}
			}
			sum = sum + a[1][1];
			for (j = 1;j < n - l - 1;j++)
			{
				a[j][0] = a[j + 1][0];
			}
			for (j = 1;j < n - l - 1;j++)
			{
				a[0][j] = a[0][j + 1];
			}
			for (j = 2;j < n - l;j++)
			{
				for (k = 2;k < n - l;k++)
				{
					a[j - 1][k - 1] = a[j][k];
				}
			}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}


}

