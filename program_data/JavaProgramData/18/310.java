package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int min;
		int p;
		int sum;
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
			for (l = n;l > 1;l--)
			{
				for (j = 0;j < l;j++)
				{
					min = a[j][0];
					for (k = 1;k < l;k++)
					{
						if (a[j][k] < min)
						{
							min = a[j][k];
						}
					}
					for (k = 0;k < l;k++)
					{
						a[j][k] = a[j][k] - min;
					}
				}
				for (j = 0;j < l;j++)
				{
					min = a[0][j];
					for (k = 1;k < l;k++)
					{
						if (a[k][j] < min)
						{
							min = a[k][j];
						}
					}
					for (k = 0;k < l;k++)
					{
						a[k][j] = a[k][j] - min;
					}
				}
				sum = sum + a[1][1];
				for (j = 0;j < l;j++)
				{
					for (k = 1;k < l - 1;k++)
					{
						a[j][k] = a[j][k + 1];
					}
				}
				for (j = 0;j < l - 1;j++)
				{
					for (k = 1;k < l - 1;k++)
					{
						a[k][j] = a[k + 1][j];
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
	}
}

