package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n; i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((x >= 1) && (x <= 18))
			{
				a = a + 100.0 / n;
			}
			if ((x >= 19) && (x <= 35))
			{
				b = b + 100.0 / n;
			}
			if ((x >= 36) && (x <= 60))
			{
				c = c + 100.0 / n;
			}
			if ((x >= 61) && (x <= 100))
			{
				d = d + 100.0 / n;
			}
		}
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", a);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", b);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", c);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", d);
		System.out.printf("%.2f", "%");
		return 0;
	}
}

