package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int u = 0;
	  int i;
	  int k;
	  int t;
	  int n;
	  int j;
	  int s;
	  int g;
	  int[] a = new int[1000];
	  int[] b = new int[1000];
	  int[] c = new int[1000];
	  int[] e = new int[1000];
	  int[] f = new int[1000];
	  double[] d = new double[1000];
	  double m;
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
	  for (j = 0;j < n - 1;j++)
	  {
		for (i = j,t = j + 1;t < n;t++)
		{
		  d[u] = Math.sqrt(Math.pow(a[i] - a[t],2) + Math.pow(b[i] - b[t],2) + Math.pow(c[i] - c[t],2));
		  e[u] = i;
		  f[u] = t;
		  u++;
		}
	  }
	  for (k = 1;k <= u;k++)
	  {
		for (i = 0;i < u - k;i++)
		{
		  if (d[i] < d[i + 1])
		  {
			m = d[i];
			d[i] = d[i + 1];
			d[i + 1] = m;
			s = e[i];
			e[i] = e[i + 1];
			e[i + 1] = s;
			g = f[i];
			f[i] = f[i + 1];
			f[i + 1] = g;
		  }
		}
	  }
	for (i = 0;i < u;i++)
	{
	  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[e[i]],b[e[i]],c[e[i]],a[f[i]],b[f[i]],c[f[i]],d[i]);
	}

	return 0;
	}
}

