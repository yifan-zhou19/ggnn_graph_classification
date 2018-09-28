package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		while (a > 0)
		{
			double b;
			double c;
			double d;
			double f;
			double g;
			f = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = 1;
			c = 2;
			d = 0; //????
			for (g = 1;g <= f;g++)
			{
				d = d + c / b;
				double e;
				e = b;
				b = c;
				c = e + c;

			}
			System.out.printf("%.3f\n",d);

			a = a - 1;
		}





		return 0;
	}

}

