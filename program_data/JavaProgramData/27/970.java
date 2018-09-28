package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double delta;
	double p;
	double q;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
	a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	delta = b * b - 4 * a * c;
	if (delta > 0)
	{
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
	 x2 = (-b - Math.sqrt(delta)) / (2 * a);
	 System.out.print("x1=");
	 System.out.printf("%.5f", x1);
	 System.out.printf("%.5f", ";");
	 System.out.printf("%.5f", "x2=");
	 System.out.printf("%.5f", x2);
	 System.out.printf("%.5f", "\n");
	}
	if (delta == 0)
	{
		x1 = (-b) / (2 * a);
	 System.out.printf("%.5f", "x1=x2=");
	 System.out.printf("%.5f", x1);
	 System.out.printf("%.5f", "\n");
	}
	if (delta < 0)
	{
		p = (-b) / (2 * a);
	 q = Math.sqrt(-delta) / (2 * a);
	 if (b == 0)
	 {
		 p = 0;
	 }
	 System.out.printf("%.5f", "x1=");
	 System.out.printf("%.5f", p);
	 System.out.printf("%.5f", "+");
	 System.out.printf("%.5f", q);
	 System.out.printf("%.5f", "i;");
	 System.out.printf("%.5f", "x2=");
	 System.out.printf("%.5f", p);
	 System.out.printf("%.5f", "-");
	 System.out.printf("%.5f", q);
	 System.out.printf("%.5f", "i");
	 System.out.printf("%.5f", "\n");
	}
	}
	return 0;
	}
}

