package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		double[] a = new double[20];
		double[] b = new double[20];
		double[] c = new double[20];
		double[] x1 = new double[20];
		double[] x2 = new double[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= n - 1;j++)
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
		for (j = 0;j <= n - 1;j++)
		{
			if (b[j] * b[j] - 4 * a[j] * c[j] >= 0)
			{
				if (b[j] * b[j] - 4 * a[j] * c[j] > 0)
				{
					x1[j] = (-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
					x2[j] = (-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
					System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[j],x2[j]);
				}
				else
				{
					x1[j] = x2[j] = -b[j] / (2 * a[j]);
					System.out.printf("x1=x2=%.5lf\n",x1[j]);
				}
			}
			else
			{
				x1[j] = -b[j] / (2 * a[j]);
				x2[j] = Math.sqrt(4 * a[j] * c[j] - b[j] * b[j]) / (2 * a[j]);
				if (-b[j] / (2 * a[j]) != 0)
				{
				  System.out.printf("x1=%.5lf",x1[j]);
				  System.out.print("+");
				  System.out.printf("%.5lf",x2[j]);
				  System.out.print("i;");
				  System.out.printf("x2=%.5lf",x1[j]);
				  System.out.print("-");
				  System.out.printf("%.5lf",x2[j]);
				  System.out.print("i\n");
				}
				  else
				  {
					  System.out.printf("x1=%.5lf",-x1[j]);
					  System.out.print("+");
					  System.out.printf("%.5lf",x2[j]);
					  System.out.print("i;");
				  System.out.printf("x2=%.5lf",-x1[j]);
				  System.out.print("-");
				  System.out.printf("%.5lf",x2[j]);
				  System.out.print("i\n");
				  }
			}
		}
		return 0;
	}
}

