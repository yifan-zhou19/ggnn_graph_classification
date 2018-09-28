package <missing>;

public class GlobalMembers
{
	public static double f(double x1,double y1,double x2,double y2)
	{
		   return Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
	}
	public static double[] x = new double[10000];
	public static double[] y = new double[10000];
	public static double[] d = new double[10000];
	public static int i = 0;
	public static int j = 0;
	public static int k = 0;
	public static int n;
	public static int Main()
	{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i <= n - 1;i++,j++)
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
		  }
		  for (i = 0;i <= n - 1;i++)
		  {
						   for (j = i;j <= n - 1;j++)
						   {
											d[k] = f(x[i], y[i], x[j], y[j]);
											k++;
						   }
		  }
		  for (i = k - 1;i >= 1;i--)
		  {
		  if (d[i] > d[i - 1])
		  {
		  d[i - 1] = d[i];
		  }
		  }
		  System.out.printf("%.4f\n",d[0]);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

