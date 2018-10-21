package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //??????
		int m; //????
		int n; //????
		int i;
		int j;
		int t;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (t = 1;t <= k;t++)
		{
			int sum = 0;
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
			for (i = 0;i <= m - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 0;i <= m - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					sum = sum + a[i][j];
				}
			}
			for (i = 1;i <= m - 2;i++)
			{
				for (j = 1;j <= n - 2;j++)
				{
					sum = sum - a[i][j];
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}



}

