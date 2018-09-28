package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int k;
	 int n;
	 double[] a = new double[100];
	 double[] b = new double[100];
	 double[] c = new double[100];
	 double[] x1 = new double[100];
	 double[] x2 = new double[100];
	 double[] p = new double[100];
	 double[] q = new double[100];
	 double[] d = new double[100];
		char i = 'i';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[k] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[k] = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 c[k] = Double.parseDouble(tempVar4);
		 }
		}
		 for (k = 1;k <= n;k++)
		 {
			 d[k] = b[k] * b[k] - 4 * a[k] * c[k];
			 if (b[k] != 0)
			 {
			 if (d[k] >= 0)
			 {
				if (d[k] > 0)
				{
				x1[k] = (-b[k] + Math.sqrt(d[k])) / (2 * a[k]);
				 x2[k] = (-b[k] - Math.sqrt(d[k])) / (2 * a[k]);
			   System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[k],x2[k]);
				}
				 else
				 {
				x1[k] = x2[k] = -b[k] / (2 * a[k]);
				System.out.printf("x1=x2=%.5lf\n",x1[k],x2[k]);
				 }
			 }
			  else
			  {
				p[k] = (-b[k]) / (2 * a[k]);
				q[k] = Math.sqrt(-d[k]) / (2 * a[k]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p[k],q[k],p[k],q[k]);
			  }
			 }
			 else
			 {
				 if (d[k] >= 0)
				 {
					 if (d[k] > 0)
					 {
					 x1[k] = (Math.sqrt(d[k])) / (2 * a[k]);
				 x2[k] = (Math.sqrt(d[k])) / (2 * a[k]);
				  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[k],x2[k]);
					 }
					 else
					 {
						 x1[k] = 0;
					 x2[k] = 0;
					 System.out.printf("x1=x2=%.5lf\n",x1[k],x2[k]);
					 }
				 }
					 else
					 {
						 q[k] = (Math.sqrt(-d[k])) / (2 * a[k]);
					 p[k] = 0;
					  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p[k],q[k],p[k],q[k]);
					 }
			 }
		 }
	}

}

