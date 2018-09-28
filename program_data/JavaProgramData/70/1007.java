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
		  double[] x = new double[100];
		  double[] y = new double[100];
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
		  double t;
		  double d;
		  t = 0;
		  for (i = 0;i < n;i++)
		  {
			  for (j = i;j < n;j++)
			  {
				  d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				  if (d >= t)
				  {
						   t = d;
				  }
			  }
		  }
		  System.out.printf("%.4lf\n",t);
	}

}

