package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int a;
		int b;
		int c;
		int d;
		int i;
		double e;
		double f;
		double g;
		double h;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x >= 1 && x <= 18)
			{
				a = a + 1;
			}
			if (x >= 19 && x <= 35)
			{
				b = b + 1;
			}
			if (x >= 36 && x <= 60)
			{
				c = c + 1;
			}
			if (x >= 61)
			{
				d = d + 1;
			}
		}
		e = (float)a / (float)n * 100;
		f = (float)b / (float)n * 100;
		g = (float)c / (float)n * 100;
		h = (float)d / (float)n * 100;
		System.out.print("1-18: ");
		System.out.printf("%.2f", e);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", f);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", g);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", h);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

