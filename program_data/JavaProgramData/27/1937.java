package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double[] a = new double[100];
	double[] b = new double[100];
	double[] c = new double[100];
	double[] x1 = new double[100];
	double[] x2 = new double[100];
	double[] p = new double[100];
	double[] r = new double[100];
	double[] s = new double[100];
	for (m = 0;m < n;m++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[m] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[m] = Double.parseDouble(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		c[m] = Double.parseDouble(tempVar4);
	}
	if (b[m] * b[m] - 4 * a[m] * c[m] > 0)
	{
	x1[m] = (-b[m] + Math.sqrt(b[m] * b[m] - 4 * a[m] * c[m])) / (2 * a[m]);
	x2[m] = (-b[m] - Math.sqrt(b[m] * b[m] - 4 * a[m] * c[m])) / (2 * a[m]);
	}
	else if (b[m] * b[m] - 4 * a[m] * c[m] == 0)
	{
	x1[m] = (-b[m] + Math.sqrt(b[m] * b[m] - 4 * a[m] * c[m])) / (2 * a[m]);
	x2[m] = (-b[m] - Math.sqrt(b[m] * b[m] - 4 * a[m] * c[m])) / (2 * a[m]);
	}
	else
	{
	if (b[m] / (2 * a[m]) == 0)
	{
		p[m] = b[m] / (2 * a[m]);
	}
	else
	{
		p[m] = -b[m] / (2 * a[m]);
	}
	r[m] = Math.sqrt(4 * a[m] * c[m] - b[m] * b[m]) / (2 * a[m]);
	s[m] = -Math.sqrt(4 * a[m] * c[m] - b[m] * b[m]) / (2 * a[m]);
	}
	}
	for (m = 0;m < n;m++)
	{
	if (b[m] * b[m] - 4 * a[m] * c[m] > 0)
	{
	System.out.printf("x1=%.5lf;x2=%.5lf\n",x1[m],x2[m]);
	}
	else if (b[m] * b[m] - 4 * a[m] * c[m] == 0)
	{
	System.out.printf("x1=x2=%.5lf\n",x1[m]);
	}
	else
	{
	System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",p[m],r[m],p[m],s[m]);
	}
	}
	return 0;
	}
}

