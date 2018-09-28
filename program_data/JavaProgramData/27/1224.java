package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
	   int j;
	   float[] a = new float[100];
	   float[] b = new float[100];
	   float[] c = new float[100];
	   double x1;
	   double x2;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (j = 0;j < n;j++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[j] = Float.parseFloat(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[j] = Float.parseFloat(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 c[j] = Float.parseFloat(tempVar4);
		 }
		 if (0 <= (b[j] * b[j] - 4 * a[j] * c[j]))
		 {
		   x1 = (double)(-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
		   x2 = (double)(-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
		   if (x1 == x2)
		   {
			   System.out.printf("x1=x2=%.5lf\n",x1);
		   }
		   else
		   {
			   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);

		   }
		 }
		 else
		 {
			double m;
			double l;
			m = (double) - b[j] / (2 * a[j]);
			l = (double)Math.sqrt(4 * a[j] * c[j] - b[j] * b[j]) / (2 * a[j]);
			System.out.printf("x1=%.5lf+%.5fi;x2=%.5lf-%.5fi\n",m,l,m,l);
		 }
	   }
	}
}

