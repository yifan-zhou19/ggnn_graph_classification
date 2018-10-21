package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[][] a = new int[100][100];
			int i;
			int k;
			int t;
			int m;
			int n;
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
			for (t = 0;t < (m + 1) / 2 && t < (n + 1) / 2;t++)
			{
					for (i = t,k = t;k < n - t;k++)
					{
							System.out.printf("%d\n",a[i][k]);
					}
					if (t != m - t - 1)
					{
							for (k = n - t - 1,i = t + 1;i < m - t;i++)
							{
									System.out.printf("%d\n",a[i][k]);
							}
						if (t != n - t - 1)
						{
							for (i = m - t - 1,k = n - t - 2;k >= t;k--)
							{
									System.out.printf("%d\n",a[i][k]);
							}
							for (k = t,i = m - t - 2;i > t;i--)
							{
									System.out.printf("%d\n",a[i][k]);
							}
						}
					}
			}
			return 0;
	}

}

