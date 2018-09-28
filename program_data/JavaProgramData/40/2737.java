package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double aq;
		double s;
		double re;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		aq = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		if (a + b + c > d && a + c + d > b && a + b + d > c && b + c + d > a)
		{
			s = (a + b + c + d) / 2;
			re = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(aq * Pi / 360) * Math.cos(aq * Pi / 360));
			System.out.printf("%.4lf",re);
		}
		else
		{
			System.out.print("Invalid input");
		}
	}
}

