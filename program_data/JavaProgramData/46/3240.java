package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int r;
		int k;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
			System.out.print("\n");
			for (r = 0,k = 0;;r++)
			{
				for (i = r,j = r;j <= n - r - 1;j++)
				{
					k++;
					System.out.printf("%d\n",a[i][j]);
				}
				if (k == m * n)
				{
					break;
				}
				for (i = r + 1,j = n - 1 - r;i <= m - 1 - r;i++)
				{
					k++;
					System.out.printf("%d\n",a[i][j]);
				}
				if (k == m * n)
				{
					break;
				}
				for (i = m - 1 - r,j = n - r - 2;j >= r;j--)
				{
					k++;
					System.out.printf("%d\n",a[i][j]);
				}
				if (k == m * n)
				{
					break;
				}
				for (i = m - 2 - r,j = r;i >= r + 1;i--)
				{
					k++;
					System.out.printf("%d\n",a[i][j]);
				}
				if (k == m * n)
				{
					break;
				}
			}
		return 0;
	}
}

