package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[20][20];
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
		for (k = 0;k < n;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][k] = Integer.parseInt(tempVar3);
			}
		}
		}
		for (i = 0;i < m;i++)
		{
		for (k = 0;k < n;k++)
		{
			if (i == 0)
			{
			if (k == 0 && (a[i][k] >= a[i + 1][k]) && (a[i][k] >= a[i][k + 1]))
			{
			System.out.printf("%d %d\n",i,k);
			}
			else
			{
				if (k < n - 1)
				{
					if ((a[i][k] >= a[i + 1][k]) && (a[i][k] >= a[i][k + 1]) && (a[i][k] >= a[i][k - 1]))
					{
						System.out.printf("%d %d\n",i,k);
					}
				}
				if (k == n - 1 && (a[i][k] >= a[i + 1][k]) && (a[i][k] >= a[i][k - 1]))
				{
					System.out.printf("%d %d\n",i,k);
				}
			}
			}
			 else
			 {
				if (i > 0 && i < m - 1)
				{
						 if (k == 0)
						 {
						if ((a[i][k] >= a[i + 1][k]) && (a[i][k] >= a[i - 1][k]) && (a[i][k] >= a[i][k + 1]))
						{
						System.out.printf("%d %d\n",i,k);
						}
						 }
						if (k == n - 1)
						{
						if ((a[i][k] >= a[i + 1][k]) && (a[i][k] >= a[i - 1][k]) && (a[i][k] >= a[i][k - 1]))
						{
						System.out.printf("%d %d\n",i,k);
						}
						}

						 if (k > 0 && k < n - 1)
						 {
							 if ((a[i][k] >= a[i + 1][k]) && (a[i][k] >= a[i - 1][k]) && (a[i][k] >= a[i][k + 1]) && (a[i][k] >= a[i][k - 1]))
							 {
									 System.out.printf("%d %d\n",i,k);
							 }
						 }
				}
					else if (i == m - 1)
					{
					if (k == 0 && (a[i][k] >= a[i - 1][k]) && (a[i][k] >= a[i][k + 1]))
					{
			System.out.printf("%d %d\n",i,k);
					}
			else
			{
				if (k < n - 1)
				{
					if ((a[i][k] >= a[i - 1][k]) && (a[i][k] >= a[i][k + 1]) && (a[i][k] >= a[i][k - 1]))
					{
						System.out.printf("%d %d\n",i,k);
					}
				}
				if (k == n - 1 && (a[i][k] >= a[i - 1][k]) && (a[i][k] >= a[i][k - 1]))
				{
					System.out.printf("%d %d\n",i,k);
				}
			}
					}

			 }
		}
		}
		 return 0;
	}

}

