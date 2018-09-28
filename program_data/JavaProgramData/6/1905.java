package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c1;
		int c2;
		int d;
		int i;
		int x = 0;
		int k;
		int m;
		int n;
		int[] sum = new int[L];
		int[][] a = new int[L][L];
		int[] b = new int[L];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < L;i++)
		{
			sum[i] = 0;
		}
		for (i = 0;i < k;i++)
		{
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
		for (c1 = 0;c1 < m;c1++)
		{
			for (c2 = 0;c2 < n;c2++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[c1][c2] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (d = 0;d < m;d++)
		{
			sum[x] += a[d][0] + a[d][n - 1];
		}
		for (d = 1;d < n - 1;d++)
		{
			sum[x] += a[0][d] + a[m - 1][d];
		}
		x++;
		}
		for (i = 0;i < x;i++)
		{
		System.out.printf("%d\n",sum[i]);
		}
		return 0;

	}
}

