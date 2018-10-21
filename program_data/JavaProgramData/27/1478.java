package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int j;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }

	 double[] a = new double[100];
	 double[] b = new double[100];
	 double[] c = new double[100];
	 double[] deta = new double[100];
	 double[] x1 = new double[100];
	 double[] x2 = new double[100];
	 double[] real = new double[100];
	 double[] inmag = new double[100];
	 for (j = 0;j <= n - 1;j++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[j] = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[j] = Double.parseDouble(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  c[j] = Double.parseDouble(tempVar4);
	  }

	 deta[j] = b[j] * b[j] - 4 * a[j] * c[j];
	 }

	 for (j = 0;j <= n - 1;j++)
	 {
	  if (Math.abs(deta[j]) < 1e-6)
	  {
		  if (b[j] != 0)
		  {
		  System.out.printf("x1=x2=%.5lf\n",-b[j] / (2 * a[j]));
		  }
	  else
	  {
		  System.out.printf("x1=x2=%.5lf\n",b[j] / (2 * a[j]));
	  }
	  }
	  else
	  {
		if ((deta[j]) > 1e-6)
		{
		   if (b[j] != 0)
		   {
			x1[j] = (-b[j] + Math.sqrt(deta[j])) / (2 * a[j]);
		x2[j] = (-b[j] - Math.sqrt(deta[j])) / (2 * a[j]);
		System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[j],x2[j]);
		   }
		else
		{
			x1[j] = (b[j] + Math.sqrt(deta[j])) / (2 * a[j]);
		x2[j] = (b[j] - Math.sqrt(deta[j])) / (2 * a[j]);
		System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[j],x2[j]);
		}
		}
		else
		{
			if (b[j] != 0)
			{
			real[j] = -b[j] / (2 * a[j]);
					inmag[j] = Math.sqrt(-deta[j]) / (2 * a[j]);
		System.out.printf("x1=%.5lf+%.5lfi;",real[j],inmag[j]);
		System.out.printf("x2=%.5lf-%.5lfi\n",real[j],inmag[j]);
			}

		else
		{
			real[j] = b[j] / (2 * a[j]);
					inmag[j] = Math.sqrt(-deta[j]) / (2 * a[j]);
		System.out.printf("x1=%.5lf+%.5lfi;",real[j],inmag[j]);
		System.out.printf("x2=%.5lf-%.5lfi\n",real[j],inmag[j]);
		}
		}

	  }

	 }
	}
}

