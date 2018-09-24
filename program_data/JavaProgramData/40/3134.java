package <missing>;

public class GlobalMembers
{
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
		e = (e / 180 * 3.1415926) / 2;
		double s;
		double r;
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e) < 0.getValue() != 0)
		{
		   System.out.print("Invalid input");
		}
		else
		{
		r = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e));
		System.out.printf("%.4lf", r);
		}
		return (0);
	}

}

