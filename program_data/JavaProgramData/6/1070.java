package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int x;
		int i;
		int j;
		int sum;
		int m;
		int n;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (x = 0;x < k;x++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if ((m >= 3) & (n >= 3))
			{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				sum += a[i][0];
			}
			for (i = 0;i < m;i++)
			{
				sum += a[i][n - 1];
			}
			for (j = 0;j < n;j++)
			{
				sum += a[0][j];
			}
			for (j = 0;j < n;j++)
			{
				sum += a[m - 1][j];
			}
			sum = sum - a[0][0] - a[m - 1][0] - a[0][n - 1] - a[m - 1][n - 1];
			b[x] = sum;
			}
			else
			{
				for (i = 0;i < m;i++)
				{
				 for (j = 0;j < n;j++)
				 {
					 String tempVar5 = ConsoleInput.scanfRead();
					 if (tempVar5 != null)
					 {
						 a[i][j] = Integer.parseInt(tempVar5);
					 }
	sum = sum + a[i][j];
				 }
				}
			 b[x] = sum;
			}
		}
		for (x = 0;x < k;x++)
		{
			System.out.printf("%d\n",b[x]);
		}
		return 0;
	}
}

