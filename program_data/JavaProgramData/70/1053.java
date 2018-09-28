package <missing>;

public class GlobalMembers
{
	public static double dist(double x1,double y1,double x2,double y2)
	{
		   double dist;
		   dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		   return dist;
	}
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  int j;
		  int k;
		  double[][] length = new double[n][n];
		  double[] x = new double[n];
		  double[] y = new double[n];
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
		  for (i = 0;i < n;i++)
		  {
		  for (j = 0;j < n;j++)
		  {
		  length[i][j] = dist(x[i], y[i], x[j], y[j]);
		  }
		  }
		  double t = 0;
		  for (i = 0;i < n;i++)
		  {
		  for (j = 0;j < n;j++)
		  {
		  if (length[i][j] > t)
		  {
		  t = length[i][j];
		  }
		  }
		  }
		  System.out.printf("%.4lf",t);
		  System.in.read();
		  System.in.read();
	}
}

