package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float s;
		float ans;
		double m;
		double n;
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		d = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		s = (a + b + c + d) / 2;
		m = (n / 2) * 3.1415926 / 180;
		ans = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m));
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m)) < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{

			System.out.printf("%.4f",ans);
		}
		return 0;
	}
}

