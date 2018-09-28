package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int m;
		int n;
		int p;
		int q;
		int i;
		int j;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		m = 0;
		p = 0;
		n = row - 1;
		q = col - 1;

		while ((n - m > 1) && (q - p) > 1)
		{
			for (i = p;i <= q;i++)
			{
				System.out.printf("%d\n",a[m][i]);
			}
			for (i = m + 1;i <= n;i++)
			{
				System.out.printf("%d\n",a[i][q]);
			}
			for (i = q - 1;i >= p;i--)
			{
				System.out.printf("%d\n",a[n][i]);
			}
			for (i = n - 1;i >= m + 1;i--)
			{
				System.out.printf("%d\n",a[i][p]);
			}
			m++;
			p++;
			n--;
			q--;
		}
		if (n == m)
		{
			for (i = p;i <= q;i++)
			{
				System.out.printf("%d\n",a[m][i]);
			}
		}
		else if (n == m + 1)
		{
			for (i = p;i <= q;i++)
			{
				System.out.printf("%d\n",a[m][i]);
			}
			for (i = q;i >= p;i--)
			{
				System.out.printf("%d\n",a[n][i]);
			}
		}
		else if (p == q)
		{
			for (i = m;i <= n;i++)
			{
				System.out.printf("%d\n",a[i][p]);
			}
		}
		else if (q == p + 1)
		{
			for (i = p;i <= q;i++)
			{
				System.out.printf("%d\n",a[m][i]);
			}
			for (i = m + 1;i <= n;i++)
			{
				System.out.printf("%d\n",a[i][q]);
			}
			for (i = q - 1;i >= p;i--)
			{
				System.out.printf("%d\n",a[n][i]);
			}
			for (i = n - 1;i >= m + 1;i--)
			{
				System.out.printf("%d\n",a[i][p]);
			}
		}
			return 0;
	}
}

