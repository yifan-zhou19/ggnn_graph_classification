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
		double s;
		double ss;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		e = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		s = (a + b + c + d) / 2;
		ss = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e * 3.1415926 / 360) * Math.cos(e * 3.1415926 / 360);
		if (ss >= 0)
		{
			System.out.printf("%.4f",Math.sqrt(ss));
		}
	else
	{
		System.out.print("Invalid input");
	}
	}
}

