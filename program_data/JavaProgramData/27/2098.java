package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[30];
		double[] b = new double[30];
		double[] c = new double[30];
		double x1;
		double x2;
		double m;
		double q;
		double p;
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
				x1 = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				System.out.printf("x1=%.5lf;",x1);
				System.out.printf("x2=%.5lf\n",x2);
			}
			else if ((b[i] * b[i] - 4 * a[i] * c[i]) == 0)
			{
				x1 = x2 = (-b[i]) / (2 * a[i]);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				m = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]);
				q = -(Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]));
				p = (-b[i]) / (2 * a[i]);
				if (a > 0)
				{
				System.out.printf("x1=%.5lf+%.5lfi;",p,m);
				System.out.printf("x2=%.5lf%.5lfi\n",p,q);
				}
				else
				{
				System.out.printf("x1=%.5lf%.5lfi;",p,m);
				System.out.printf("x2=%.5lf+%.5lfi\n",p,q);
				}
			}
		}
		return 0;
	}
}

