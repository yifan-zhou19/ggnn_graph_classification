package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int t;
		int a;
		int b;
		int r = 0;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		double e;
		double[][] sz = new double[45][3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (t = j + 1;t < n;t++)
			{
				sz[r][0] = j;
				sz[r][1] = t;
				sz[r][2] = Math.sqrt((x[j] - x[t]) * (x[j] - x[t]) + (y[j] - y[t]) * (y[j] - y[t]) + (z[j] - z[t]) * (z[j] - z[t]));
				r++;
			}
		}
		for (j = 1;j <= r;j++)
		{
			for (t = 0;t < r - j;t++)
			{
				if (sz[t][2] < sz[t + 1][2])
				{
					e = sz[t][2];
					sz[t][2] = sz[t + 1][2];
					sz[t + 1][2] = e;
					e = sz[t][0];
					sz[t][0] = sz[t + 1][0];
					sz[t + 1][0] = e;
					e = sz[t][1];
					sz[t][1] = sz[t + 1][1];
					sz[t + 1][1] = e;
				}
			}
		}
		for (j = 0;j < r;j++)
		{
			int a = sz[j][0];
			int b = sz[j][1];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a],y[a],z[a],x[b],y[b],z[b],sz[j][2]);
		}
		return 0;
	}
}

