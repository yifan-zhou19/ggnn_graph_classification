package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int s;
		int k;
		int l;
		int t;
		int[][] a = new int[100][100];
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
		s = t = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				s = s + 1;
			}
		}
		l = m / 2;
		if (n < m)
		{
			l = n / 2;
		}
		for (k = 0;k < l;k++)
		{
			for (j = k;j < n - k - 1;j++)
			{
				System.out.printf("%d\n",a[k][j]);
				t = t + 1;
			}
			for (i = k;i < m - k - 1;i++)
			{
				System.out.printf("%d\n",a[i][n - k - 1]);
				t = t + 1;
			}
			for (j = n - k - 1;j > k;j--)
			{
				System.out.printf("%d\n",a[m - k - 1][j]);
				t = t + 1;
			}
			for (i = m - k - 1;i > k;i--)
			{
				System.out.printf("%d\n",a[i][k]);
				t = t + 1;
			}
		}
		if (t != s)
		{
			if (m > n)
			{
				for (i = k;i < m - k;i++)
				{
					System.out.printf("%d\n",a[i][l]);
				}
			}
			if (m < n)
			{
				for (j = k;j < n - k;j++)
				{
					System.out.printf("%d\n",a[l][j]);
				}
			}
			if (m == n)
			{
				System.out.printf("%d\n",a[l][l]);
			}
		}
		return 0;
	}

}

