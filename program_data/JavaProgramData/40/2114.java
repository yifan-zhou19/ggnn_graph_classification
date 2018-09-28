package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double angle;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		angle = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double s;
		double temp1;
		double temp2;
		double pi = 3.1415926;
		s = (a + b + c + d) / 2;
		temp1 = (s - a) * (s - b) * (s - c) * (s - d);
		temp2 = angle / 360 * pi;
		temp2 = Math.cos(temp2);
		temp2 = temp2 * temp2;
		temp2 = a * b * c * d * temp2;
		temp1 = temp1 - temp2;
		if (temp1 < 0)
		{
			System.out.print("Invalid input");
			System.out.print("\n");
		}
		else
		{
			temp1 = Math.sqrt(temp1);
			System.out.printf("%.4f\n",temp1);
		}
		return 0;
	}
}

