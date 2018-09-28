package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int p;
	  int l;
	  double[] x = new double[10];
	  double[] y = new double[10];
	  double[] z = new double[10];
	  double m;
	  double[] d = new double[100];
	  double[] c = new double[100];
	  int[] a = new int[100];
	  int[] b = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= n - 1;++i)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[i] = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			z[i] = Double.parseDouble(tempVar4);
		}
	  }
	  k = 0;
	  for (i = 0;i <= n - 2;++i)
	  {
		for (j = i + 1;j <= n - 1;++j)
		{

	  d[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
		  a[k] = i;
		  b[k] = j;
		  c[k] = d[k];
		  k++;
		}
	  }
	  for (i = 0;i <= k - 2;++i)

	  {
		for (j = i + 1;j <= k - 1;++j)
		{
		  if (c[i] < c[j])
		  {
			m = c[i];
			c[i] = c[j];
			c[j] = m;
		  }
		}
	  }
	  for (i = 0;i <= k - 1;++i)
	  {
		for (j = 0;j <= k - 1;++j)
		{
		  if (c[i] == d[j])
		  {

	  System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",x[a[j]],y[a[j]],z[a[j]],x[b[j]],y[b[j]],z[b[j]],c[i]);
			d[j] = -1;
		  }
		}
	  }
	  return 0;
	}

}

