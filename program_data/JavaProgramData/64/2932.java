package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		int q;
		int w;
		int[][] a = new int[10000][4];
		int[] c = new int[10000];
		int[] d = new int[10000];
		double[] b = new double[10000];
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n * (n - 1) / 2;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[k] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
				c[k] = i;
				d[k] = j;
				k++;
			}
		}
		for (j = 1;j < m;j++)
		{
			for (i = 0;i < m - j;i++)
			{
				if (b[i + 1] > b[i])
				{
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
					q = c[i];
					c[i] = c[i + 1];
					c[i + 1] = q;
					w = d[i];
					d[i] = d[i + 1];
					d[i + 1] = w;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[c[i]][0],a[c[i]][1],a[c[i]][2],a[d[i]][0],a[d[i]][1],a[d[i]][2],b[i]);
		}
		return 0;
	}
}

