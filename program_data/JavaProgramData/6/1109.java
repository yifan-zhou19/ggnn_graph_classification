package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int k;
	 int sum;
	 int i;
	 int j;
	 int l;
	 int[][] a = new int[101][101];
	 int m;
	 int n;
	 sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }

	 for (i = 1 ; i <= k ; i++)
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
		for (j = 1 ; j <= m ; j++)
		{
			for (l = 1; l <= n; l++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[j][l] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (j = 1 ; j <= n ; j++)
		{
			sum = sum + a[1][j] + a[m][j];
		}
		for (j = 2 ; j <= m - 1 ; j++)
		{
			sum = sum + a[j][1] + a[j][n];
		}

		System.out.printf("%d\n",sum);

	 }
	 return 0;
	}
}

