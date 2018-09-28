package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int g;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double[] a = new double[100];
	double[] b = new double[100];
	double[] c = new double[100];
	double x1;
	double x2;
	double disc;
	double rp;
	double ip;
	for (g = 0;g <= n - 1;g++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[g] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[g] = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c[g] = Double.parseDouble(tempVar4);
		}
	}
	for (g = 0;g <= n - 1;g++)
	{
	disc = b[g] * b[g] - 4 * a[g] * c[g];
	if (Math.abs(disc) <= 1e-6)
	{
	System.out.printf("x1=x2=%.5lf\n",-b[g] / (2 * a[g]));
	}
	else
	{
	if (disc > 1e-6)
	{
		x1 = (-b[g] + Math.sqrt(disc)) / (2 * a[g]);
		x2 = (-b[g] - Math.sqrt(disc)) / (2 * a[g]);
		System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	}
	else
	{
	if (b[g] == 0)
	{
		rp = 0;
	ip = Math.sqrt(-disc) / (2 * a[g]);
		System.out.printf("x1=%.5lf+%.5lfi;",rp,ip);
		System.out.printf("x2=%.5lf-%.5lfi\n",rp,ip);
	}
	else
	{
		rp = -b[g] / (2 * a[g]);
		ip = Math.sqrt(-disc) / (2 * a[g]);
		System.out.printf("x1=%.5lf+%.5lfi;",rp,ip);
		System.out.printf("x2=%.5lf-%.5lfi\n",rp,ip);
	}
	}
	}
	}
	}
}

