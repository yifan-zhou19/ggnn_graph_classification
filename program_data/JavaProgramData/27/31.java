package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int j;
		double a;
		double b;
		double c;
		double delta;
		double[] o = new double[100];
		double[] p = new double[100];
		double[] q = new double[100];
		double realpart;
		double imagpart;
		double x1;
		double x2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0; j < n; j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			o[j] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p[j] = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			q[j] = Double.parseDouble(tempVar4);
		}
		}
		for (j = 0; j < n; j++)
		{
		a = o[j];
		b = p[j];
		c = q[j];
		delta = b * b - 4 * a * c;
			if (delta > Math.pow(10, -8))
			{
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
			}
			else if (Math.abs(delta) <= Math.pow(10, -8))
			{
			x1 = x2 = -b / (2 * a);
			System.out.printf("x1=x2=%.5lf\n", x1, x1);
			}
			else
			{
			realpart = -b / (2 * a);
			if (realpart == 0)
			{
				realpart = Math.abs(realpart);
			}
			imagpart = Math.sqrt(-delta) / (2 * a);
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", realpart, imagpart, realpart, imagpart);
			}
		}
	}

}

