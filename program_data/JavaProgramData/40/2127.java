package <missing>;

public class GlobalMembers
{
	public static final double PI = 3.1415926;

	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		e = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double s = 0;
		double t = (a + b + c + d) / 2;
		s = Math.sqrt((t - a) * (t - b) * (t - c) * (t - d) - a * b * c * d * Math.pow(Math.cos(e * PI / 360),2));
		if (s >= 0)
		{
			System.out.printf("%.4lf",s);
		}
			else
			{
				System.out.print("Invalid input");
			}
		return 0;
	}
}

