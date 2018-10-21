package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		double d;
		double e;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		for (m = 0;m < n;m++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[m] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b[m] = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 c[m] = Double.parseDouble(tempVar4);
		 }
		}
		for (k = 0;k < n;k++)
		{
			d = b[k] * b[k] - 4 * a[k] * c[k];
		  if (d > 0)
		  {
		   e = (-b[k] + Math.sqrt(d)) / (2 * a[k]);
		   f = (-b[k] - Math.sqrt(d)) / (2 * a[k]);
			System.out.printf("x1=%.5lf;x2=%.5lf\n",e,f);
		  }
		  else if (d == 0)
		  {
			e = (-b[k]) / (2 * a[k]);
			System.out.printf("x1=x2=%.5lf\n",e);
		  }
		  else if (d < 0)
		  {
			  e = (-b[k]) / (2 * a[k]);
			  f = Math.sqrt(-d) / (2 * a[k]);
			  if (b[k] == 0)
			  {
				  System.out.printf("x1=0.00000+%.5lfi;x2=0.00000-%.5lfi\n",f,f);
			  }
			  else
			  {
				  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",e,f,e,f);
			  }
		  }
		}
	return 0;
	}
}

