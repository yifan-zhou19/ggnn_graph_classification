package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double x1;
		double x2;
		double xi;
		double x0;
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

			if ((b[j] * b[j] - 4 * a[j] * c[j]) >= 0)
			{
				x1 = (-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				x2 = (-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				if (x1 != x2)
				{
					System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				}
				else
				{
					System.out.printf("x1=x2=%.5lf\n",x1);
				}
			}

			if ((b[j] * b[j] - 4 * a[j] * c[j]) < 0)
			{
				xi = Math.sqrt(-b[j] * b[j] + 4 * a[j] * c[j]) / (2 * a[j]);
				x0 = b[j] / (2 * a[j]);
				if (x0 != 0)
				{
					x0 = -x0;
				}

				System.out.printf("x1=%.5lf+%.5lfi;",x0,xi);
				System.out.printf("x2=%.5lf-%.5lfi\n",x0,xi);

			}

		}

	}

}

