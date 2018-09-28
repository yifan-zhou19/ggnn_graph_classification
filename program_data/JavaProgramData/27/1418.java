package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[len];
		double[] b = new double[len];
		double[] c = new double[len];
		double[] x = new double[len];
		double[] y = new double[len];
		double x1;
		double x2;
		double d;
		int n;
		int i;
		char m = 'i';
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((b[i] * b[i] - 4 * a[i] * c[i]) > 0)
			{
				x[i] = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				y[i] = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x[i],y[i]);
			}
			if ((b[i] * b[i] - 4 * a[i] * c[i]) == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",-b[i] / (2 * a[i]));
			}
			if ((b[i] * b[i] - 4 * a[i] * c[i]) < 0)
			{
			   d = Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]);
			   System.out.printf("x1=%.5lf+%.5lf%c;x2=%.5lf-%.5lfi\n",-b[i] / (2 * a[i]),d,m,-b[i] / (2 * a[i]),d,m);
			}
		}
		return 0;
	}
}

