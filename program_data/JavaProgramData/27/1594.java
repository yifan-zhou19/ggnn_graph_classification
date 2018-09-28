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
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double d;
		double e;
		double f;
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
			d = (-1) * b[i] / (2 * a[i]);
			e = b[i] * b[i] - 4 * a[i] * c[i];
			if (e > 0)
			{
				x1[i] = d + Math.sqrt(e) / (2 * a[i]);
				x2[i] = d - Math.sqrt(e) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[i],x2[i]);
			}
			if (e == 0)
			{
				x1[i] = d;
				x2[i] = d;
				System.out.printf("x1=x2=%.5lf\n",x1[i]);
			}
			if (e < 0)
			{
				e = (-1) * e;
				f = Math.sqrt(e) / (2 * a[i]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",d,f,d,f);
			}
		}
	}
}

