package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		int flag = 0;
		int t;
		int[][] a = new int[123][123];
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
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (t = 0;t < 123;t++)
			{
				for (i = t;i < n - t;i++)
				{
					if (a[t][i] == -123 || flag == 1)

					{
						flag = 1;
						break;
					}
					System.out.printf("%d\n",a[t][i]);
					a[t][i] = -123;
				}
				for (j = t + 1;j < m - t;j++)
				{
					if (a[j][i - 1] == -123 || flag == 1)

					{
						flag = 1;
						break;
						flag = 1;
					}
					System.out.printf("%d\n",a[j][i - 1]);
					a[j][i - 1] = -123;
				}
				for (p = i - 2;p >= t;p--)
				{
					if (a[j - 1][p] == -123 || flag == 1)

					{
						flag = 1;
						break;
						flag = 1;
					}
					System.out.printf("%d\n",a[j - 1][p]);
					a[j - 1][p] = -123;
				}
				for (q = j - 2;q > t;q--)
				{
					if (a[q][t] == -123 || flag == 1)
					{
							flag = 1;
							break;
							flag = 1;
					}
					System.out.printf("%d\n",a[q][t]);
					a[q][t] = -123;
				}
				if (flag == 1)
				{
				break;
				}
			}
			return 0;
	}
}

