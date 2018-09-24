package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int sum = 0;
		int x;
		int q;
		int w;
		int e;
		int r;
		int[] ss = new int[100];
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (x = 0;x < k;x++)
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

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		q = 0;
		w = 0;
		e = 0;
		r = 0;
		for (j = 0;j < n;j++)
		{
			q = q + sz[0][j];
		}
		for (j = 0;j < n;j++)
		{
			w = w + sz[m - 1][j];
		}
		for (i = 1;i < m - 1;i++)
		{
			e = e + sz[i][0];
		}
		for (i = 1;i < m - 1;i++)
		{
			r = r + sz[i][n - 1];
		}
		sum = q + w + e + r;

		System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

