package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double ai;
	double bi;
	double ci;
	double k;
	double x1;
	double x2;
	double d;
	double e;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		ai = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		bi = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		ci = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		k = bi * bi - 4 * ai * ci;
		if (k > 0)
		{
			x1 = (-bi + Math.sqrt(k)) / (2 * ai);
			x2 = (-bi - Math.sqrt(k)) / (2 * ai);
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", ";");
			System.out.printf("%.5f", "x2=");
			System.out.printf("%.5f", x2);
			System.out.printf("%.5f", "\n");
		}
		if (k == 0)
		{
			x1 = x2 = (-bi) / (2 * ai);
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", "\n");
		}
		if (k < 0)
		{
			d = (-bi) / (2 * ai);
			e = (Math.sqrt(-k)) / (2 * ai);
			if (d != 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
			if (d == 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", Math.abs(d));
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", Math.abs(d));
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
	}
	return 0;
	}
}

