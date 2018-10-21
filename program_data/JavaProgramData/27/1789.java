package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = n;
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		double[] x1 = new double[n];
		double[] x2 = new double[n];
		for (;n > 0;n--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[n] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[n] = Double.parseDouble(tempVar4);
			}
			if (b[n] * b[n] - 4 * a[n] * c[n] < 0)
			{
				 x1[n] = -b[n] / (2 * a[n]);
				 x2[n] = Math.sqrt(4 * a[n] * c[n] - b[n] * b[n]) / (2 * a[n]);
			}
			else
			{
					x1[n] = (-b[n] + Math.sqrt(b[n] * b[n] - 4 * a[n] * c[n])) / (2 * a[n]);
					x2[n] = (-b[n] - Math.sqrt(b[n] * b[n] - 4 * a[n] * c[n])) / (2 * a[n]);
			}
		}
		for (;i > 0;i--)
		{
			if (b[i] * b[i] - 4 * a[i] * c[i] > 0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
			}
			else if (x1[i] - x2[i] == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",x1[i]);
			}
			else if (b[i] * b[i] - 4 * a[i] * c[i] < 0)
			{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1[i],x2[i],x1[i],x2[i]);
			}
		}
	}
}

