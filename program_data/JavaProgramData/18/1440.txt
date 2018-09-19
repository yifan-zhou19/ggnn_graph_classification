package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int sum = 0;
		int i;
		int j;
		int k;
		int m;
		int z;
		int x;
		int p = 0;
		int[] min1 = new int[100];
		int[] min2 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
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
			sum = 0;
			p = 0;
			while (p < n)
			{
				for (m = 0;m < n - p;m++)
				{
					min1[m] = a[m][0];
					for (k = 0;k < n - p;k++)
					{

						if (min1[m] > a[m][k])
						{
							min1[m] = a[m][k];
						}
					}
				}
				for (z = 0;z < n - p;z++)
				{
					for (x = 0;x < n - p;x++)
					{
						a[z][x] = a[z][x] - min1[z];
					}

				}
				for (m = 0;m < n - p;m++)
				{
					min2[m] = a[0][m];
					for (k = 0;k < n - p;k++)
					{

						if (min2[m] > a[k][m])
						{
							min2[m] = a[k][m];
						}
					}
				}
				for (z = 0;z < n - p;z++)
				{
					for (x = 0;x < n - p;x++)
					{
						a[z][x] = a[z][x] - min2[x];
					}
				}
				sum = sum + a[1][1];
				for (z = 0;z < n - p;z++)
				{
					for (m = 1;m < n - p;m++)
					{
						a[z][m] = a[z][m + 1];
					}
				}
				for (z = 0;z < n - p;z++)
				{
					for (m = 1;m < n - p;m++)
					{
						a[m][z] = a[m + 1][z];
					}
				}
				p++;
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

