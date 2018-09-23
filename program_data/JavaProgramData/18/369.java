package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int x;
		int y;
		int min;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			for (x = 0;x < n;x++)
			{
				for (y = 0;y < n;y++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[x][y] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (j = n;j > 1;j--)
			{
				for (x = 0;x < j;x++)
				{
					min = a[x][0];
					for (y = 1;y < j;y++)
					{
						if (a[x][y] < min)
						{
							min = a[x][y];
						}
					}
					for (y = 0;y < j;y++)
					{
						a[x][y] = a[x][y] - min;
					}
				}
				for (y = 0;y < j;y++)
				{
					min = a[0][y];
					for (x = 1;x < j;x++)
					{
						if (a[x][y] < min)
						{
							min = a[x][y];
						}
					}
					for (x = 0;x < j;x++)
					{
						a[x][y] = a[x][y] - min;
					}
				}
				for (k = 2;k < j;k++)
				{
					a[0][k - 1] = a[0][k];
				}
				for (k = 2;k < j;k++)
				{
					a[k - 1][0] = a[k][0];
				}
				sum = sum + a[1][1];
				for (x = 2;x < j;x++)
				{
					for (y = 2;y < j;y++)
					{
						a[x - 1][y - 1] = a[x][y];
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

