package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int j;
		double x1;
		double x2;
		double x3;
		double x4;
		double[] a = new double[10000];
		double[] b = new double[10000];
		double[] c = new double[10000];
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
			if ((b[j] * b[j] - 4 * a[j] * c[j]) > 0)
			{
				x1 = (-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				x2 = (-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if ((b[j] * b[j] - 4 * a[j] * c[j]) == 0)
			{
				x1 = -b[j] / (2 * a[j]);
				//x2=-b[j]/(2*a[j]);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				x3 = -b[j] / (2 * a[j]);
				x4 = Math.sqrt(-b[j] * b[j] + 4 * a[j] * c[j]) / (2 * a[j]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x3,x4,x3,x4);
			}
		}
	}
}

