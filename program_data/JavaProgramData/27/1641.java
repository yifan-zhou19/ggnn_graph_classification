package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
	   int i;
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
		 if (a[i] != 0)
		 {
		   double delta;
		   double m;
		   double n;
		   double x1;
		   double x2;
		   delta = b[i] * b[i] - 4 * a[i] * c[i];
			if (b[i] == 0)
			{
				 m = 0;
			}
			else
			{
			m = -(b[i] / (2 * a[i]));
			}
			n = Math.sqrt(Math.abs(delta)) / (2 * a[i]);
			if (delta == 0)
			{
			  System.out.printf("x1=x2=%.5lf\n",m);
			}
			  else if (delta > 0)
			  {
				   x1 = m + n;
				x2 = m - n;
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			  }
			 else
			 {
				 m = -Math.abs(m);
				 System.out.printf("x1=%.5lf+%.5lfi;",m,n);
				 System.out.printf("x2=%.5lf-%.5lfi\n",m,n);
			 }

		 }

	   }

	}


}

