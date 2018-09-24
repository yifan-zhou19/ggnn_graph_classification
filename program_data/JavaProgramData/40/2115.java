package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double s;
		double l;
		double S;
		double x;
		double PI = 3.1415926;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		l = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			s = (a + b + c + d) * 1.0 / 2;
		x = (s - a) * (s - b) * (s - c) * (s - d);
		if (x >= 0)
		{
			l = l * PI / 360;
			S = Math.sqrt(x - a * b * c * d * Math.cos(l) * Math.cos(l));
			System.out.printf("%.4f",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}
}

