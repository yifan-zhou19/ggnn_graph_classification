package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double x;
	double y;
	int k;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= k;i++)
	{
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	d = b * b - 4 * a * c;
	if (d >= 0)
	{
		if (d <= 0)
		{
		y = -b / (2 * a);
	System.out.printf("%.5f", "x1=x2=");
	System.out.printf("%.5f", y);
	System.out.printf("%.5f", "\n");
		}
	else
	{
	d = Math.sqrt(d);
	x = (-b + d) / (2 * a);
	y = (-b - d) / (2 * a);
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", x);
	System.out.printf("%.5f", ";x2=");
	System.out.printf("%.5f", y);
	System.out.printf("%.5f", "\n");
	}
	}
	else
	{
	d = Math.sqrt(-d) / (2 * a);
	b = -b / (2 * a);
	if (b == 0)
	{
	System.out.printf("%.5f", "x1=0.00000+");
	System.out.printf("%.5f", d);
	System.out.printf("%.5f", "i");
	System.out.printf("%.5f", ";x2=0.00000-");
	System.out.printf("%.5f", d);
	System.out.printf("%.5f", "i");
	System.out.printf("%.5f", "\n");
	}
	else
	{
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", b);
	System.out.printf("%.5f", "+");
	System.out.printf("%.5f", d);
	System.out.printf("%.5f", "i");
	System.out.printf("%.5f", ";x2=");
	System.out.printf("%.5f", b);
	System.out.printf("%.5f", "-");
	System.out.printf("%.5f", d);
	System.out.printf("%.5f", "i");
	System.out.printf("%.5f", "\n");
	}
	}
	}
	return 0;
	}
}

