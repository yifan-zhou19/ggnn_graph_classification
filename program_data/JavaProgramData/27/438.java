package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		int i;
		double[] delta = new double[100];
		double x1;
		double x2;
		double x11;
		double x12;
		double x21;
		double x22;
		double[] mo = new double[100];
		double[] e = new double[100];

		for (i = 1;i <= n;i++)
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
						 delta[i] = b[i] * b[i] - 4 * a[i] * c[i];
						 e[i] = (b[i] == 0) ?0 : (-b[i]) / (2 * a[i]);
		}

		for (i = 1;i <= n;i++)
		{
						 if (delta[i] > 0)
						 {
									   x1 = e[i] + Math.sqrt(delta[i]) / (2 * a[i]);
									   x2 = e[i] - Math.sqrt(delta[i]) / (2 * a[i]);
									   System.out.printf("x1=%.5lf;x2=%.5lf\n", x1,x2);
									   continue;
						 }
						 else if (delta[i] < 0)
						 {
							   mo[i] = Math.sqrt(-delta[i]);
							   x11 = e[i];
							   x12 = mo[i] / (2 * a[i]);
							   x21 = x11;
							   x22 = mo[i] / (2 * a[i]);
							   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", x11,x12,x21,x22);
							   continue;
						 }
						 else if (delta[i] < Math.pow(10,-8))
						 {
									   x1 = e[i];
									   System.out.printf("x1=x2=%.5lf\n", x1);

						 }

		}
		return 0;
	}


}

