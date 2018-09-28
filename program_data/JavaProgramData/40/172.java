package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double a;
		double b;
		double c;
		double d;
		double k;
		double m;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow((Math.cos(3.1415926 * k / 360)),2) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
	m = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow((Math.cos(3.1415926 * k / 360)),2));
	System.out.printf("%.4f",m);
		}
	return 0;
	}

}

