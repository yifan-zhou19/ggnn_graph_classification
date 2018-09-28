package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		float[] a = new float[10];
		float[] b = new float[10];
		float[] c = new float[10];
		double[] x1 = new double[10];
		double[] x2 = new double[10];
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
				a[j] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[j] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[j] = Float.parseFloat(tempVar4);
			}
		}

		for (j = 0;j < n;j++)
		{
			if ((b[j] * b[j] - 4 * a[j] * c[j]) > 0)
			{
			x1[j] = (-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
			x2[j] = (-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
			System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[j],x2[j]);
			}


			if ((b[j] * b[j] - 4 * a[j] * c[j]) == 0)
			{
			x2[j] = (-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
			System.out.printf("x1=x2=%.5lf\n",x2[j]);
			}


			if ((b[j] * b[j] - 4 * a[j] * c[j]) < 0)
			{
				double m;
				double n;
				m = -b[j] / (2 * a[j]);
				n = Math.sqrt(4 * a[j] * c[j] - b[j] * b[j]) / (2 * a[j]);
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m,n,m,n);
			}
		}
		return 0;
	}
}

