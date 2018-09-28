package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int m;
		int p;
		int q;
		int[][] sz = new int[100][100];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
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
			for (p = 0;p < m;p++)
			{
				for (q = 0;q < n;q++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[p][q] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m == 1 || n == 1)
			{
				for (p = 0;p < m;p++)
				{
					 for (q = 0;q < n;q++)
					 {
					   sum += sz[p][q];
					 }
				}
			}
			else
			{
			   for (q = 0;q <= n - 1;q++)
			   {
					sum += sz[0][q];
			   }
			   for (q = 1;q < m - 1;q++)
			   {
				  sum += sz[q][n - 1];
			   }
			   for (q = 0;q < n;q++)
			   {
				  sum += sz[m - 1][q];
			   }
			   for (q = 1;q < m - 1;q++)
			   {
				  sum += sz[q][0];
			   }
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}


}

