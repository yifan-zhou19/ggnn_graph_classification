package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] k = new int[10][3];
		int t;
		int n;
		int i;
		int j;
		int a;
		int b;
		int[] g = new int[100];
		double[] h = new double[100];
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			g[i] = i;
		}
		for (i = 0;i < 100;i++)
		{
			h[i] = -1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					k[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				h[i * n + j] = 1.0 * Math.sqrt((k[i][0] - k[j][0]) * (k[i][0] - k[j][0]) + (k[i][1] - k[j][1]) * (k[i][1] - k[j][1]) + (k[i][2] - k[j][2]) * (k[i][2] - k[j][2]));
			}
		}

		for (i = 0;i < 100;i++)
		{
			for (j = 99;j > i;j--)
			{
				if (h[j - 1] < h[j])
				{
					t = g[j];
					g[j] = g[j - 1];
					g[j - 1] = t;
					e = h[j];
					h[j] = h[j - 1];
					h[j - 1] = e;
				}
			}
		}
		for (i = 0;i < 100;i++)
		{
			if (h[i] != -1)
			{
			a = g[i] / n;
			b = g[i] % n;
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",k[a][0],k[a][1],k[a][2],k[b][0],k[b][1],k[b][2],h[i]);
			}
		}
			return 0;
	}
}

