package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double x1;
		double x2;
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
			if (b[i] * b[i] - 4 * a[i] * c[i] > 0)
			{
				x1 = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if (b[i] * b[i] - 4 * a[i] * c[i] == 0)
			{
				x1 = x2 = (-b[i]) / (2 * a[i]);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				x1 = (-b[i]) / (2 * a[i]);
				x2 = Math.sqrt(-b[i] * b[i] + 4 * a[i] * c[i]) / (2 * a[i]);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
			}
		}
	}

}

