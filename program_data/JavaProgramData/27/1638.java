package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double d;
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double e;
		double f;
		int j;
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
		}
		for (j = 0;j < n;j++)
		{
			d = b[j] * b[j] - 4 * a[j] * c[j];
			if (d > 0)
			{
				x1[j] = (-b[j] + Math.sqrt(d)) / (2 * a[j]);
				x2[j] = (-b[j] - Math.sqrt(d)) / (2 * a[j]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[j],x2[j]);
			}
			else if (d == 0)
			{
				x1[j] = x2[j] = -b[j] / (2 * a[j]);
				System.out.printf("x1=x2=%.5lf\n",x1[j]);
			}
				else
				{
					e = -b[j] / (2 * a[j]);
					f = Math.sqrt(-d) / (2 * a[j]);
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",e,f,e,f);
				}
		}
		return 0;
	}


}

