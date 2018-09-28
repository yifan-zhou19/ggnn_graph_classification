package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double x1;
		double x2;
		double t;
		double u;
		double v;
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
			t = b[j] * b[j] - 4 * a[j] * c[j];
			if (t > 0)
			{
				x1 = (-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				x2 = (-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if (t == 0)
			{
				x1 = (-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				x2 = (-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (t < 0)
			{
				u = -b[j] / (2 * a[j]);
				v = Math.sqrt(-(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",u,v,u,v);
			}
		}
	return 0;
	}
}

