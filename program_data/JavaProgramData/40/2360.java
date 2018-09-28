package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double x;
		double s;
		double y;
		double mj;
		final double pi = 3.1415926;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		s = (a + b + c + d) / 2;
		 y = x / 360.0 * pi;
		 if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(y) * Math.cos(y) < 0.getValue() != 0)
		 {
			 System.out.print("Invalid input");
			 System.out.print("\n");
		 }
		 else
		 {
			 mj = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(y) * Math.cos(y));
			System.out.printf("%.4f", mj);
			System.out.printf("%.4f", "\n");
		 }
		return 0;
	}

}

