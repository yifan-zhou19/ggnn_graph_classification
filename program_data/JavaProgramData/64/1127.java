package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] h = new int[10];
		int[] z = new int[10];
		int[] s = new int[10];
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int i;
		int j;
		int l;
		int m;
		int o;
		int q;
		int r;
		int t;
		int k;
		double[] g = new double[100];
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i] = Integer.parseInt(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				g[k] = Math.pow((h[i] - h[j]) * (h[i] - h[j]) + (z[i] - z[j]) * (z[i] - z[j]) + (s[i] - s[j]) * (s[i] - s[j]),0.5);
				a[k] = h[i];
				b[k] = z[i];
				c[k] = s[i];
				d[k] = h[j];
				e[k] = z[j];
				f[k] = s[j];
				k++;
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
			for (i = 0;i < n * (n - 1) / 2 - k;i++)
			{
				if (g[i] < g[i + 1])
				{
					p = g[i];
					g[i] = g[i + 1];
					g[i + 1] = p;
					l = a[i];
					a[i] = a[i + 1];
					a[i + 1] = l;
					m = b[i];
					b[i] = b[i + 1];
					b[i + 1] = m;
					o = c[i];
					c[i] = c[i + 1];
					c[i + 1] = o;
					q = d[i];
					d[i] = d[i + 1];
					d[i + 1] = q;
					r = e[i];
					e[i] = e[i + 1];
					e[i + 1] = r;
					t = f[i];
					f[i] = f[i + 1];
					f[i + 1] = t;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i],b[i],c[i],d[i],e[i],f[i],g[i]);
		}
		return 0;
	}
}

