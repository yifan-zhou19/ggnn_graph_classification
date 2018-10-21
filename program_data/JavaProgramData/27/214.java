package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] d = new double[100];
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
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			c[i] = Double.parseDouble(tempVar4);
		}
		d[i] = b[i] * b[i] - 4 * a[i] * c[i];
		}
		for (i = 1;i <= n;i++)
		{
		if (d[i] > 0)
		{
				  x1[i] = (-b[i] + Math.sqrt(d[i])) / (2 * a[i]);
				  x2[i] = (-b[i] - Math.sqrt(d[i])) / (2 * a[i]);
				  System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
		}
		if (d[i] == 0)
		{
				   x1[i] = x2[i] = (-b[i] + Math.sqrt(d[i])) / (2 * a[i]);
				   System.out.printf("x1=x2=%.5lf\n",x1[i]);
		}
		if (d[i] < 0)
		{
				  if (b[i] == 0)
				  {
							 x1[i] = b[i] / (2 * a[i]);
							 x2[i] = Math.sqrt(-d[i]) / (2 * a[i]);
							 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1[i],x2[i],x1[i],x2[i]);
				  }
				  else
				  {
				  x1[i] = -(b[i] / (2 * a[i]));
				  x2[i] = Math.sqrt(-d[i]) / (2 * a[i]);
				  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1[i],x2[i],x1[i],x2[i]);
				  }
		}
		}
		return 0;
	}

}

