package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int m;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (s = 0;s < x;s++)
		{
			int[][] a = new int[100][100];
			int i;
			int j;
			int k;
			int q = 0;
			int w = 0;
			int e = 0;
			int r = 0;
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (k = 0;k < n;k++)
			{
				q += a[0][k];
				w += a[m - 1][k];
			}
			k = 0;
			for (k = 0;k < m;k++)
			{
				e += a[k][0];
				r += a[k][n - 1];
			}
			sum = q + w + e + r - a[0][0] - a[m - 1][n - 1] - a[0][n - 1] - a[m - 1][0];
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

