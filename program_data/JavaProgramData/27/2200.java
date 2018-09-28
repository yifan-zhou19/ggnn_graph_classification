package <missing>;

public class GlobalMembers
{
	/*
	 * equation.cpp
	 *
	 *  Created on: 2013-10-23
	 *      Author: Mac
	 */

	/*
	 * 9898989.cpp
	 *
	 *  Created on: 2013-9-26
	 *      Author: Mac
	 */


	public static int Main()
	{
		int n;
		double a; //define roots and real part and i part
		double b;
		double c;
		double x1;
		double x2;
		double xr;
		double xi;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		if ((b * b - 4 * a * c) == 0)
		{
			x1 = (-b) / (2 * a);
		System.out.printf("%.5f", "x1=x2=");
		System.out.printf("%.5f", x1);
		System.out.printf("%.5f", "\n");
		}
		else if ((b * b - 4 * a * c) < 0)
		{
			xr = (-b) / (2 * a);
			if (Math.abs(xr) < (1e-6))
			{
				xr = 0;
			}
			xi = Math.sqrt(4 * a * c - b * b) / (2 * a);
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", xr);
			System.out.printf("%.5f", "+");
			System.out.printf("%.5f", xi);
			System.out.printf("%.5f", "i;x2=");
			System.out.printf("%.5f", xr);
			System.out.printf("%.5f", "-");
			System.out.printf("%.5f", xi);
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", "\n");
		}

		else
		{
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			 x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			 if (Math.abs(x1) < (1e-6))
			 {
				 x1 = 0;
			 }
			 if (Math.abs(x2) < (1e-6))
			 {
				 x2 = 0;
			 }
			 System.out.printf("%.5f", "x1=");
			 System.out.printf("%.5f", x1);
			 System.out.printf("%.5f", ";x2=");
			 System.out.printf("%.5f", x2);
			 System.out.printf("%.5f", "\n");
		}
		}
		return 0;
	}
}

