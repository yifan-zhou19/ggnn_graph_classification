package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 int i;
	 int k;
	 for (i = 0;i < m;i++)
	 {
	  int n;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  double[] a = new double[n];
	  double[] b = new double[n];
	  double sum;
	  if (n >= 2)
	  {
	  a[0] = 2;
	  a[1] = 3;
	  b[0] = 1;
	  b[1] = 2;
	  sum = 2 / 1 + 3 / 2;
	  for (k = 2;k < n;k++)
	  {
		 a[k] = a[k - 2] + a[k - 1];
	   b[k] = b[k - 1] + b[k - 2];
	   sum = sum + (a[k] / b[k]);
	  }
	  System.out.printf("%.3lf\n",sum + 0.5);
	  }
	 if (n == 1)
	 {
		 System.out.printf("%.3lf\n",2.000);
	 }
	 }
	return 0;
	}

}

