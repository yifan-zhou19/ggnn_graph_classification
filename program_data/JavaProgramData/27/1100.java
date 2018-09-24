package <missing>;

public class GlobalMembers
{
	/*
	 * return.cpp
	 *
	 *  Created on: 2014-1-25
	 *      Author: ???
	 */
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b == 0)
			{
				b = -b;
			}
			d = b * b - 4 * a * c;
			if (d == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", (-b) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			else if (d > 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", (-b + Math.sqrt(d)) / (2 * a));
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", (-b - Math.sqrt(d)) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			else
			{
				double xd = Math.sqrt(-d) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", (-b) / (2 * a));
				System.out.printf("%.5f", '+');
				System.out.printf("%.5f", xd);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", (-b) / (2 * a));
				System.out.printf("%.5f", '-');
				System.out.printf("%.5f", xd);
				System.out.printf("%.5f", 'i');
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

