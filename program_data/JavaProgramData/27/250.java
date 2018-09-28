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
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
	a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	if (Math.sqrt(b * b - 4 * a * c) > 0)
	{
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", (-b + 1 - 1 + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.printf("%.5f", ";x2=");
	System.out.printf("%.5f", (-b + 1 - 1 - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.printf("%.5f", "\n");
	}
	else if (Math.sqrt(b * b - 4 * a * c) == 0)
	{
	System.out.printf("%.5f", "x1=x2=");
	System.out.printf("%.5f", (-b + 1 - 1 + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	System.out.printf("%.5f", "\n");
	}
	else
	{
	System.out.printf("%.5f", "x1=");
	System.out.printf("%.5f", (-b + 1 - 1) / (2 * a));
	System.out.printf("%.5f", "+");
	System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
	System.out.printf("%.5f", "i;x2=");
	System.out.printf("%.5f", (-b + 1 - 1) / (2 * a));
	System.out.printf("%.5f", "-");
	System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
	System.out.printf("%.5f", "i");
	System.out.printf("%.5f", "\n");
	}
	}
	return 0;
	}
}

