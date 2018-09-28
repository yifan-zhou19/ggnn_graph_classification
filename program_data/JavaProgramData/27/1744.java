package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double x1;
		double x2;
		double a;
		double b;
		double c;
		double d;
		for (int i = 0; i < n; i++)
		{
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = b * b - 4 * a * c;
		if (d == 0)
		{
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			if (x1 != 0.00000)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", "0.00000");
				System.out.printf("%.5f", "\n");
			}
		}
		if (d > 0)
		{
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			if (x1 != 0.00000 && x2 != 0.00000)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ';');
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			if (x1 != 0.00000 && x2 == 0.00000)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ';');
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", "0.00000");
				System.out.printf("%.5f", "\n");
			}
			if (x1 == 0.00000 && x2 != 0.00000)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", "0.00000");
				System.out.printf("%.5f", ';');
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
		}
		if (d < 0)
		{
			if ((-b) / (2 * a) != 0.00000)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", (-b) / (2 * a));
				System.out.printf("%.5f", '+');
				System.out.printf("%.5f", Math.sqrt(Math.abs(d)) / (2 * a));
				System.out.printf("%.5f", "i;");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", (-b) / (2 * a));
				System.out.printf("%.5f", '-');
				System.out.printf("%.5f", Math.sqrt(Math.abs(d)) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
			else
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", "0.00000");
				System.out.printf("%.5f", '+');
				System.out.printf("%.5f", Math.sqrt(Math.abs(d)) / (2 * a));
				System.out.printf("%.5f", "i;");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", "0.00000");
				System.out.printf("%.5f", '-');
				System.out.printf("%.5f", Math.sqrt(Math.abs(d)) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		}
		return 0;
	}

}

