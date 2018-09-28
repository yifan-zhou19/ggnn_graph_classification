package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int t;
		int i;
		int j;
		int l;
		int k;
		int sum = 0;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (l = 0;l < t;l++)
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
			if (m == n && n == 1)
			{
				System.out.printf("%d",a[0][0]);
			}
			else
			{
				 for (j = 0;j < n;j++)
				 {
				   sum += a[0][j];
				   sum += a[m - 1][j];
				 }
				 for (i = 0;i < m;i++)
				 {
				   sum += a[i][0];
				   sum += a[i][n - 1];
				 }
				 sum = sum - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1];
				 System.out.printf("%d\n",sum);
			}
			sum = 0;
		}


		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			i = Integer.parseInt(tempVar5);
		}
		return 0;
	}

}

