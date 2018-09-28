package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int q;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] f = new int[50];
		int[] g = new int[50];
		int[] h = new int[50];
		int[] l = new int[50];
		int[] o = new int[50];
		int[] p = new int[50];
		double[] d = new double[50];
		double e;
		for (i = 0;i < n;i++)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   b[i] = Integer.parseInt(tempVar3);
			   }
			   String tempVar4 = ConsoleInput.scanfRead(" ");
			   if (tempVar4 != null)
			   {
				   c[i] = Integer.parseInt(tempVar4);
			   }
		}
		for (i = 0;i < n;i++)
		{
			   for (m = i + 1;m < n;m++)
			   {
						e = (a[i] - a[m]) * (a[i] - a[m]) + (b[i] - b[m]) * (b[i] - b[m]) + (c[i] - c [m]) * (c[i] - c[m]);
						  d[j] = Math.sqrt(e);
						  f[j] = a[i];
						  g[j] = b[i];
						  h[j] = c[i];
						  l[j] = a[m];
						  o[j] = b[m];
						  p[j] = c[m];
						  j = j + 1;
			   }
		}
		for (k = 1 ; k <= j ; k++)
		{
			 for (i = 0; i < j - k; i++)
			 {
				if (d[i] < d[i + 1])
				{
					 e = d[i + 1];
					 d[i + 1] = d[i];
					 d[i] = e;
								q = f[i + 1];
					 f[i + 1] = f[i];
					 f[i] = q;
									   q = g[i + 1];
					 g[i + 1] = g[i];
					 g[i] = q;
									q = h[i + 1];
					 h[i + 1] = h[i];
					 h[i] = q;
									q = l[i + 1];
					 l[i + 1] = l[i];
					 l[i] = q;
									  q = o[i + 1];
					 o[i + 1] = o[i];
						  o[i] = q;
								q = p[i + 1];
					 p[i + 1] = p[i];
					 p[i] = q;
				}
			 }
		}
		for (i = 0;i < j;i++)
		{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",f[i],g[i],h[i],l[i], o[i],p[i],d[i]);
		}
		return 0;
	}


}

