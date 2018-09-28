package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x1;
		double x2;
	int n;
	int t = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (t = 0;t < n;t++)
	{
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	d = b * b - 4 * a * c;
	if (d > 0)
	{
		x1 = (-b + Math.sqrt(d)) / (2 * a);
	x2 = (-b - Math.sqrt(d)) / (2 * a);
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", x1);
	System.out.printf("%.5f", ";x2=");
	System.out.printf("%.5f", x2);
	System.out.printf("%.5f", "\n");
	}
	else if (d == 0)
	{
		x1 = (-b) / (2 * a);
	System.out.printf("%.5f", "x1=x2=");
	System.out.printf("%.5f", x1);
	System.out.printf("%.5f", "\n");
	}
	else
	{
		e = Math.sqrt(-d) / (2 * a);
	f = (-b) / (2 * a);
	if (f == 0)
	{
	f = Math.abs(f);
	}
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", f);
	System.out.printf("%.5f", "+");
	System.out.printf("%.5f", e);
	System.out.printf("%.5f", "i;x2=");
	System.out.printf("%.5f", f);
	System.out.printf("%.5f", "-");
	System.out.printf("%.5f", e);
	System.out.printf("%.5f", "i");
	System.out.printf("%.5f", "\n");
	}
	}
	return 0;
	}

}

