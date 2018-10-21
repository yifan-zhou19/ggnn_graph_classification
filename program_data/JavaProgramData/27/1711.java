package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int n;
	   double d;
	   double e;
	   double p;
	   double q;
	   double t;
	   double[] a = new double[100];
	   double[] b = new double[100];
	   double[] c = new double[100];
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
			   a[i] = Double.parseDouble(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Double.parseDouble(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   c[i] = Double.parseDouble(tempVar4);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		 t = b[i] * b[i] - 4 * a[i] * c[i];
		 if (t < 0)
		 {
				d = -b[i] / (a[i] * 2);
				p = Math.sqrt(-t) / (2 * a[i]);
				q = Math.sqrt(-t) / (2 * a[i]);
				if (d == 0)
				{
						 d = 0.00000;
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",d,p,d,q);
		 }
		 else if (Math.abs(t - 0) < 0.00000001)
		 {
				d = -b[i] / (2 * a[i]);
				System.out.printf("x1=x2=%.5lf\n",d);
		 }
		 else
		 {
				d = (-b[i] + Math.sqrt(t)) / (2 * a[i]);
				e = (-b[i] - Math.sqrt(t)) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",d,e);
		 }
	   }
	}
}

