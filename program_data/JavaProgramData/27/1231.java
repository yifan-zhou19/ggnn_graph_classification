package <missing>;

public class GlobalMembers
{
	// sqart.cpp : Defines the entry point for the console application.
	//

	public static void Main(String[] args)
	{
	 int i;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 double[] a = new double[100];
	 double[] b = new double[100];
	 double[] d = new double[100];
	 double x1;
	 double x2;
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 d[i] = Double.parseDouble(tempVar4);
		 }
	 }
	 for (i = 0;i < n;i++)
	 {

	  if ((b[i] * b[i] - 4 * a[i] * d[i]) < 0)
	  {
		  double m;
		  double n;
	   m = -b[i] / (2 * a[i]);
	   n = Math.sqrt(4 * a[i] * d[i] - b[i] * b[i]) / (2 * a[i]);
	   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m,n,m,n);
	  }
	  else if ((b[i] * b[i] - 4 * a[i] * d[i]) > 0)
	  {
	   x1 = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * d[i])) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * d[i])) / (2 * a[i]);
	   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	  }
	  else
	  {
	   double k;
	   k = -b[i] / (2 * a[i]);
	   System.out.printf("x1=x2=%.5lf\n",k);
	  }
	 }
	}

}

