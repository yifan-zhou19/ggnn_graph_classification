package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double i;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i = i + 1)
		{
			double y;
			y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (y <= 18)
			{
				a = a + 1;
			}
			else if (y <= 35)
			{
				b = b + 1;
			}
			else if (y <= 60)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1;
			}
		}
		double A;
		double B;
		double C;
		double D;
		A = a / n * 100.0;
		B = b / n * 100.0;
		C = c / n * 100.0;
		D = d / n * 100.0;
		System.out.print("1-18: ");
		System.out.printf("%.2f", A);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", B);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", C);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", D);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

