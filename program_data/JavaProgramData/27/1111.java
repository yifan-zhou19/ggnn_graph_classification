package <missing>;

public class GlobalMembers
{
	/*
	 * practice.cpp
	 *
	 *  Created on: 2014-5-23
	 *      Author: de
	 */

	public static int Main()
	{
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double i;
		int cases;
		cases = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < cases;j++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0)
			{
				if (b == 0)
				{
					x1 = (Math.sqrt(0 - 4 * a * c)) / (2 * a);
					x2 = (0 - Math.sqrt(0 - 4 * a * c)) / (2 * a);
				}
				else
				{
					x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			if (b * b - 4 * a * c == 0)
			{
				if (b == 0)
				{
					x1 = 0.0;
				}
				else
				{
					x1 = (-b / (2 * a));
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			if (b * b - 4 * a * c < 0)
			{
				if (b == 0)
				{
					x1 = 0.0;
					i = Math.sqrt(4 * a * c) / (2 * a);
				}
				else
				{
					x1 = (-b / (2 * a));
				i = Math.sqrt(4 * a * c - b * b) / (2 * a);
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", i);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", i);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}

		}
		return 0;
	}

}

