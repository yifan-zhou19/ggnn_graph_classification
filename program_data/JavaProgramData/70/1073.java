package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[] x = new double[n];
		  double[] y = new double[n];
		  int i;
		  int j;
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
		  double[][] c = new double[n][n];
		  double dis = 0;
		  for (i = 0;i < n;i++)
		  {
						  for (j = 0;j < n;j++)
						  {
										  c[i][j] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
										  if (c[i][j] > dis)
										  {
										  dis = c[i][j];
										  }
						  }
		  }
		  System.out.printf("%.4lf",Math.sqrt(dis));
	}
}

