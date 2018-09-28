package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//int array_edge_sum(int * b,int m,int n);
		int i;
		int j;
		int t;
		int r;
		int k;
		int m;
		int n;
		int[] a = new int[1000];
		int[][] b = new int[100][100];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}

			for (t = 0;t < m;t++)
			{
				for (r = 0;r < n;r++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						b[t][r] = Integer.parseInt(tempVar4);
					}
					if (r == n - 1)
					{
						scanf("\n");
					}
				}
			}
			if (m == 1)
			{
				for (j = 0;j <= n - 1;j++)
				{
					sum += b[0][j];
				}
			}
		else if (n == 1)
		{
			for (j = 0;j <= m - 1;j++)
			{
					sum += b[j][0];
			}
		}
		else
		{
		for (j = 0;j < n - 1;j++)
		{
			sum += *(b[0] + j);
		}
		for (j = 0;j < m - 1;j++)
		{
			sum += *(b[j] + n - 1);
		}
		for (j = n - 1;j > 0;j--)
		{
			sum += *(b[m - 1] + j);
		}
		for (j = m - 1;j > 0;j--)
		{
			sum += *(b[j] + 0);
		}
		}
		a[i] = sum;
		sum = 0;
		}

		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}
}

