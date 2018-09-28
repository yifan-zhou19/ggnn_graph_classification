package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double j;
		double k;
		double p;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] d = new double[100];
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
			p = -b[i] / (2 * a[i]);
			if (p == -0.00000)
			{
				p = 0.00000;
			}
			d[i] = b[i] * b[i] - 4 * a[i] * c[i];
			if (d[i] == 0)
			{
				x1[i] = x2[i] = -b[i] / (2 * a[i]);
				System.out.printf("x1=x2=%.5lf\n",x1[i]);
			}
			if (d[i] > 0)
			{
				x1[i] = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				x2[i] = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
			}
			if (d[i] < 0)
			{
				j = p;
				k = Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",j,k,j,k);
			}
		}
	}

}

