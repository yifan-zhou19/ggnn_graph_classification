package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		int i;
		int x;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double a1;
		double b1;
		double c1;
		double d1;
		for (i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x < 19)
			{
				a = a + 1;
			}
			else if (18 < x && x < 36)
			{
				b = b + 1;
			}
			else if (35 < x && x < 61)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1;
			}
		}
		a1 = 100 * a / n;
		b1 = 100 * b / n;
		c1 = 100 * c / n;
		d1 = 100 * d / n;
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", a1);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", b1);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", c1);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", d1);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

