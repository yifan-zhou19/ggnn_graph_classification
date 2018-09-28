package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] x = new int[10];
	int[] y = new int[10];
	int[] z = new int[10];
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int max;
	int k = 0;
	max = n * (n - 1) / 2;
	int[] MAX = new int[45 * 45];
	int[] MAX2 = new int[45 * 45];
	int c;
	double[][] di = new double[45][45];
	double[] sz = {0.00, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	for (i = 0;i < n;i++)
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
	for (i = 0;i < n - 1;i++)
	{
		for (k = 1;k + i < n;k++)
		{
			di[i][i + k] = Math.sqrt((x[i] - x[i + k]) * (x[i] - x[i + k]) + (y[i] - y[i + k]) * (y[i] - y[i + k]) + (z[i] - z[i + k]) * (z[i] - z[i + k]));
		}
	}
	for (c = 0;c < max;c++)
	{
		for (i = 0;i < n - 1;i++)
		{
		for (k = 1;k + i < n;k++)
		{
			if (c == 0)
			{
				if (sz[c] < di[i][i + k])
				{
					MAX[c] = i;
					MAX2[c] = i + k;
					sz[c] = di[i][i + k];
				}
			}
		else if (sz[c] < di[i][i + k] && di[i][i + k] < sz[c - 1])
		{
			MAX[c] = i;
			MAX2[c] = i + k;
			sz[c] = di[i][i + k];
		}
		else if (sz[c] < di[i][i + k] && di[i][i + k] == sz[c - 1])
		{
			if (i > MAX[c - 1])
			{
				MAX[c] = i;
				MAX2[c] = i + k;
				sz[c] = di[i][i + k];
			}
			else if (i == MAX[c - 1])
			{
				if (i + k > MAX2[c - 1])
				{
					MAX[c] = i;
					MAX2[c] = i + k;
					sz[c] = di[i][i + k];
				}
			}
		}
		}
		}
	}
	for (c = 0;c < max;c++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[MAX[c]],y[MAX[c]],z[MAX[c]],x[MAX2[c]],y[MAX2[c]],z[MAX2[c]],sz[c]);
	}
	return 0;
	}
}

