package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double d;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Double.parseDouble(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Double.parseDouble(tempVar4);
	}
	d = b * b - 4.0 * a * c;
	if (d > 0)
	{
	x1 = (-b + Math.sqrt(d)) / (2.0 * a);
	x2 = (-b - Math.sqrt(d)) / (2.0 * a);
	System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	}
	else if (d == 0)
	{
		System.out.printf("x1=x2=%.5lf\n",-b / (2.0 * a));
	}
	else
	{
	double p = Math.sqrt(-d) / (2.0 * a);
	if (b / (2 * a) != 0)
	{
	System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-b / (2.0 * a),p,-b / (2.0 * a),p);
	}
	else
	{
	System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",b / (2.0 * a),p,b / (2.0 * a),p);
	}
	}
	}
	return 0;
	}





}

