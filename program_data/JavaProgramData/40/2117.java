package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double A;
		double S;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		A = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		final double s = (a + b + c + d) / 2;
		final double pi = 3.1415926;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(A / 180 * pi / 2),2)) < 0)
		{
			System.out.print("Invalid input");
			System.out.print("\n");
		}
		else
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(A / 180 * pi / 2),2));
		System.out.printf("%.4f", S);
		System.out.printf("%.4f", "\n");
		}

	}
}

