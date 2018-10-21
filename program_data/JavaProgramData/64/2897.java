package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int p;
		int t;
		int zong;
		double ju;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] xe = new int[100];
		int[] f = new int[100];
		int[] g = new int[100];
		int[] h = new int[100];
		int[] l = new int[100];
		int[] he = new int[100];
		double[] juli = new double[100];
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
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c[i] = Integer.parseInt(tempVar4);
		}
			}
		k = 0;
		 int x;
		 for (m = 0;m < n;m++)
		 {
			for (p = m + 1;p < n;p++)
			{

	x = (a[m] - a[p]) * (a[m] - a[p]) + (b[m] - b[p]) * (b[m] - b[p]) + (c[m] - c[p]) * (c[m] - c[p]);
	 juli[k] = Math.sqrt(x);
	  xe[k] = a[m];
		  f[k] = b[m];
		  g[k] = c[m];
	  h[k] = a[p];
		  l[k] = b[p];
		  he[k] = c[p];
	  k++;
			}
		 }
	zong = n * (n - 1) / 2;
				for (i = 0;i < zong;i++)
				{
					for (k = 0;k < zong - i - 1;k++)
					{
						if (juli[k] < juli[k + 1])
						{
							ju = juli[k];
							juli[k] = juli[k + 1];
							juli[k + 1] = ju;
							t = xe[k];
							xe[k] = xe[k + 1];
							xe[k + 1] = t;
							t = f[k];
							f[k] = f[k + 1];
							f[k + 1] = t;
							t = g[k];
							g[k] = g[k + 1];
							g[k + 1] = t;
							t = he[k];
							he[k] = he[k + 1];
							he[k + 1] = t;
							t = h[k];
							h[k] = h[k + 1];
							h[k + 1] = t;
							t = l[k];
							l[k] = l[k + 1];
							l[k + 1] = t;
						}
					}
				}
			for (i = 0;i < zong;i++)
			{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",xe[i],f[i],g[i],h[i],l[i],he[i],juli[i]);
			}
			return 0;
	}

}

