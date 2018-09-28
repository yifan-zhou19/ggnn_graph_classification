package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		int i;
		int n;
		double p;
		double q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		{
			if (b == 0F)
			{
			p = 0.0;
			}
		if (b != 0F)
		{
		p = -b / (2 * a);
		}
		}
		q = b * b - 4 * a * c;
		if (q > 0)
		{
			System.out.print("x1=");
			System.out.printf("%.5f", p + (Math.sqrt(q) / 2 / a));
			System.out.printf("%.5f", ";x2=");
			System.out.printf("%.5f", p - (Math.sqrt(q) / 2 / a));
			System.out.printf("%.5f", "\n");
		}
		if (q == 0)
		{
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", p);
			System.out.printf("%.5f", "\n");
		}
		if (q < 0)
		{
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", p);
			System.out.printf("%.5f", "+");
			System.out.printf("%.5f", (Math.sqrt(-q) / 2 / a));
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", ";x2=");
			System.out.printf("%.5f", p);
			System.out.printf("%.5f", "-");
			System.out.printf("%.5f", (Math.sqrt(-q) / 2 / a));
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", "\n");
		}
		}
		return 0;

	}
}

