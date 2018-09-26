package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int l = 0;
		int p;
		int q;
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
		p = m,q = n;
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
		while (p > 2 && q > 2)
		{
			for (j = l;j < n - l;j++)
			{
				System.out.printf("%d\n",a[l][j]);
			}
			for (i = l + 1;i < m - l;i++)
			{
				System.out.printf("%d\n",a[i][n - l - 1]);
			}
			for (j = n - l - 2;j > l;j--)
			{
				System.out.printf("%d\n",a[m - l - 1][j]);
			}
			for (i = m - l - 1;i > l;i--)
			{
				System.out.printf("%d\n",a[i][l]);
			}
			l++;
			p = m - 2 * l;
			q = n - 2 * l;
		}
		if (p == 1)
		{
			for (j = l;j < n - l;j++)
			{
				System.out.printf("%d\n",a[l][j]);
			}
		}
		else if (q == 1)
		{
			for (i = l;i < m - l;i++)
			{
				System.out.printf("%d\n",a[i][l]);
			}
		}
			else if (p == 2)
			{
				for (j = l;j < n - l;j++)
				{
					System.out.printf("%d\n",a[l][j]);
				}
				for (j = n - l - 1;j >= l;j--)
				{
					System.out.printf("%d\n",a[l + 1][j]);
				}
			}
			else if (q == 2)
			{
				System.out.printf("%d\n",a[l][l]);
				for (i = l;i < m - l;i++)
				{
					System.out.printf("%d\n",a[i][l + 1]);
				}
				for (i = m - l - 1;i > l;i--)
				{
					System.out.printf("%d\n",a[i][l]);
				}
			}
	}
}

