package <missing>;

public class GlobalMembers
{
	public static double x1(double a, double b, double c)
	{
		double x11;
		double det = b * b - 4 * a * c;
		if (det >= 0)
		{
			x11 = (-b + Math.sqrt(det)) / (2 * a);
		}
		else
		{
			x11 = Math.sqrt(-det) / (2 * a);
		}
		return (x11);
	}

	public static double x2(double a, double b, double c)
	{
		double x22;
		double det = b * b - 4 * a * c;
		if (det >= 0)
		{
			x22 = (-b - Math.sqrt(det)) / (2 * a);
		}
		else
		{
			x22 = Math.sqrt(-det) / (2 * a);
		}
		return (x22);
	}

	public static int Main()
	{
		int n;
		int i;
		double det;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1 ; i <= n ; i++)
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
		for (i = 1 ; i <= n ; i++)
		{
				//printf("%.5f %.5f %.5f \n" , a[i] , b[i] , c[i]);
			det = b[i] * b[i] - 4 * a[i] * c[i];
			if (det >= 0 && x1(a[i], b[i], c[i]) != x2(a[i], b[i], c[i]))
			{
				System.out.printf("x1=%.5f;x2=%.5f\n", x1(a[i], b[i], c[i]), x2(a[i], b[i], c[i]));
			}
			else if (det >= 0)
			{
				System.out.printf("x1=x2=%.5f\n", x1(a[i], b[i], c[i]));
			}
			else if (b[i] != 0)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", -b[i] / (2 * a[i]), x1(a[i], b[i], c[i]), -b[i] / (2 * a[i]), x2(a[i], b[i], c[i]));
			}
			else
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", b[i] / (2 * a[i]), x1(a[i], b[i], c[i]), b[i] / (2 * a[i]), x2(a[i], b[i], c[i]));
			}
			//printf("%.5f\n %.5f",b[i] / (2 * a[i]) , b[i] );
		}
		return (0);

	}
}

