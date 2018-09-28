package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int i;
		double[] a = new double[50];
		double[] b = new double[50];
		double[] c = new double[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		for (i = 0;i < e;i++)
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
		double delta;
		double m;
		double n;
		double x1;
		double x2;
		for (i = 0;i < e;i++)
		{
			delta = b[i] * b[i] - 4 * a[i] * c[i];
			m = -(b[i] / (2 * a[i]));
			n = Math.sqrt(Math.abs(delta)) / (a[i] * 2);
			if (a[i] != 0)
			{

			if (delta == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",m);
			}
			else if (delta > 0)
			{
				x1 = m + n;
				x2 = m - n;
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else
			{
				System.out.printf("x1=%.5lf+%.5lfi;",m,n);
				System.out.printf("x2=%.5lf-%.5lfi\n",m,n);
			}
			}

			else if (a[i] == 0)
			{
				double g;
				g = -c[i] / b[i];
				System.out.printf("x1=x2=%.5lf",g);
			}
		}
		return 0;
	}
}

