package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int m;
		int o;
		double[] dis = new double[1000];
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = (n - 1) * n / 2;
		for (i = 1;i <= n;i++)
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
		for (i = 1,k = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				a[k] = x[i];
				b[k] = y[i];
				c[k] = z[i];
				d[k] = x[j];
				e[k] = y[j];
				f[k] = z[j];
				dis[k] = Math.sqrt((1.0 * a[k] - d[k]) * (a[k] - d[k]) + (b[k] - e[k]) * (b[k] - e[k]) + (c[k] - f[k]) * (c[k] - f[k]));
				k++;
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (k = 1;k <= m - i;k++)
			{
				if (dis[k] < dis[k + 1])
				{
					o = a[k + 1];
					a[k + 1] = a[k];
					a[k] = o;
					o = b[k + 1];
					b[k + 1] = b[k];
					b[k] = o;
					o = c[k + 1];
					c[k + 1] = c[k];
					c[k] = o;
					o = d[k + 1];
					d[k + 1] = d[k];
					d[k] = o;
					o = e[k + 1];
					e[k + 1] = e[k];
					e[k] = o;
					o = f[k + 1];
					f[k + 1] = f[k];
					f[k] = o;
					p = dis[k + 1];
					dis[k + 1] = dis[k];
					dis[k] = p;
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i],b[i],c[i],d[i],e[i],f[i],dis[i]);
		}
		return 0;
	}

}

