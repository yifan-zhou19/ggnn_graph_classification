package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int s = 0;
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
		for (int k = 0;k < (m + 1) / 2 && k < (n + 1) / 2;k++)
		{
				for (j = k;j < n - k;j++)
				{
								   s++;
								   if (s == m * n)
								   {
									 System.out.printf("%d",a[k][j]);
								   }
								   else if (s < m * n)
								   {
									 System.out.printf("%d\n",a[k][j]);
								   }
				}
				for (i = k + 1;i < m - k;i++)
				{
									 s++;
									 if (s == m * n)
									 {
									   System.out.printf("%d",a[i][n - k - 1]);
									 }
									 else if (s < m * n)
									 {
									   System.out.printf("%d\n",a[i][n - k - 1]);
									 }
				}
				for (j = n - k - 2;j > k - 1;j--)
				{
									 s++;
									 if (s == m * n)
									 {
									   System.out.printf("%d",a[m - k - 1][j]);
									 }
									 else if (s < m * n)
									 {
									   System.out.printf("%d\n",a[m - k - 1][j]);
									 }
				}
				for (i = m - k - 2;i > k;i--)
				{
									 s++;
									 if (s == m * n)
									 {
									   System.out.printf("%d",a[i][k]);
									 }
									 else if (s < m * n)
									 {
									   System.out.printf("%d\n",a[i][k]);
									 }
				}
		}
		return 0;
	}
}

