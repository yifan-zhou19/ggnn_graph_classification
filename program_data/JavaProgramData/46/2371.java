package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int[][] a = new int[100][100];
	 int p;
	 int i;
	 int j;
	 int k;
	 int q;
	 int s;
	 int ys;
	 int hs;
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
	 for (i = 1;i <= m;i++)
	 {
	   for (j = 1;j <= n;j++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
	   }
	 }
	 if (m <= n)
	 {
	   p = m / 2;
	   ys = m % 2;
	   hs = 1;
	 }
	 else
	 {
	   p = n / 2;
	   ys = n % 2;
	   hs = 2;
	 }
	 for (i = 1;i <= p;i++)
	 {
		for (j = i;j <= n - i;j++)
		{
			System.out.printf("%d\n",a[i][j]);
		}
		for (k = i;k <= m - i;k++)
		{
			System.out.printf("%d\n",a[k][n + 1 - i]);
		}
		for (q = n - i + 1;q >= i + 1;q--)
		{
			System.out.printf("%d\n",a[m + 1 - i][q]);
		}
		for (s = m + 1 - i;s >= i + 1;s--)
		{
			System.out.printf("%d\n",a[s][i]);
		}
	 }
	 if (ys == 1)
	 {
			if (hs == 1)
			{
				for (i = (m + 1) / 2;i <= n - (m - 1) / 2;i++)
				{
					System.out.printf("%d\n",a[(m + 1) / 2][i]);
				}
			}
			if (hs == 2)
			{
				for (i = (n + 1) / 2;i <= m - (n - 1) / 2;i++)
				{
					System.out.printf("%d\n",a[i][(n + 1) / 2]);
				}
			}
	 }
	 return 0;
	}

}

