package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		double a;
		double b;
		double c;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double delta = b * b - 4 * a * c;
		double x1;
		double x2;
		if (delta > 0)
		{
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", x1);
	System.out.printf("%.5f", ";x2=");
	System.out.printf("%.5f", x2);
	System.out.printf("%.5f", "\n");
		}
	else if (delta == 0)
	{
		System.out.printf("%.5f", "x1=x2=");
		System.out.printf("%.5f", (-b / (2 * a)));
		System.out.printf("%.5f", "\n");
	}
	else if (delta < 0)
	{
		if (-b / (2 * a) == -0)
		{
			b = -b;
		}
		delta = -delta;
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", -b / (2 * a));
			System.out.printf("%.5f", "+");
			System.out.printf("%.5f", Math.sqrt(delta) / (2 * a));
			System.out.printf("%.5f", "i;x2=");
			System.out.printf("%.5f", -b / (2 * a));
			System.out.printf("%.5f", "-");
			System.out.printf("%.5f", Math.sqrt(delta) / (2 * a));
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", "\n");

	}
	}

	return 0;
	}
}

