package <missing>;

public class GlobalMembers
{
	public static double dis(double x,double y)
	{
		  double s;
		  s = Math.sqrt(x * x + y * y);
		  return s;
	}
	public static int Main()
	{
		  double[] a = new double[L];
		  double[] b = new double[L];
		  double[] S = new double[L];
		  int n;
		  int i;
		  int j;
		  int k;
		  double D;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i] = Double.parseDouble(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 b[i] = Double.parseDouble(tempVar3);
				 }
		  }
		  for (i = 1;i < n;i++)
		  {
				double max = 0;
				double s = 0;
				for (j = i + 1;j <= n;j++)
				{
					   double x = a[i] - a[j];
					   double y = b[i] - b[j];
					   s = dis(x, y);
					   if (s > max)
					   {
					   max = s;
					   }
				}
				S[i] = max;
		  }
		  for (i = 1;i < n;i++)
		  {
				if (S[i] > D)
				{
				D = S[i];
				}
		  }
		  System.out.printf("%.4lf",D);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

