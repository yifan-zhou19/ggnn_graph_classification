package <missing>;

public class GlobalMembers
{
	public static final double pi = 3.1415926;

	public static int Main()
	{
		double t;
		double a;
		double b;
		double c;
		double d;
		double x;
		double s;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		s = (a + b + c + d) / 2;
		t = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x * pi / 360) * Math.cos(x * pi / 360);
		if (t < 0)
		{
			System.out.print("Invalid input");
		}
		 else
		 {
			 System.out.printf("%.4f",Math.sqrt(t));
		 }
	}
}

