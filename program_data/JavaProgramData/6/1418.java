package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int a;
		int b;
		int c;
		int d;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[100][100];
		int[] yi = new int[100];
		int[] er = new int[100];
		for (c = 0;c < k;c++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		for (a = 0;a < m;a++)
		{
			for (b = 0;b < n;b++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[a][b] = Integer.parseInt(tempVar4);
				}
			}
		}
			d = 0;
			for (b = 0;b < n;b++)
			{
				d += sz[0][b];
			}
			yi[a] = d;
			d = 0;
			for (b = 0;b < n;b++)
			{
				d += sz[m - 1][b];
			}
			er[a] = d;
			d = yi[a] + er[a];
			for (b = 1;b <= (m - 2);b++)
			{
				d += sz[b][0];
			}
			for (b = 1;b <= (m - 2);b++)
			{
				d += sz[b][n - 1];
			}

			System.out.printf("%d\n",d);

		}
		return 0;
	}

}

