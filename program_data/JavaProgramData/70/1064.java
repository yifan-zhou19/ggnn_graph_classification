package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int t;
		  double[] x = new double[100];
		  double[] y = new double[100];
		  double e;
		  double[][] f = new double[100][100];
		  double[] g = new double[100];
		  double k;
		  f[0][0] = 0;
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
				  x[i] = Double.parseDouble(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  y[i] = Double.parseDouble(tempVar3);
			  }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
			  for (t = i + 1;t < n;t++)
			  {
			  e = (x[i] - x[t]) * (x[i] - x[t]) + (y[i] - y[t]) * (y[i] - y[t]);
			f[i][t] = Math.sqrt(e);
		   if (f[i][t] < f[i][t - 1])
		   {
				f[i][t] = f[i][t - 1];
		   }
			  }
			g[i] = f[i][n - 1];
			f[i + 1][0] = 0;
		  }
		   for (i = 0;i < n - 1;i++)
		   {
			  if (g[i] > g[i + 1])
			  {
			  k = g[i];
			  g[i] = g[i + 1];
			  g[i + 1] = k;
			  }
		   }
		  System.out.printf("%.4lf",g[n - 1]);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

