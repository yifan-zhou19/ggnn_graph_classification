package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-11-1
	 *      Author: AK
	 */
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n >= 1;n--)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			p = b * b - 4 * a * c;
			if (p > 0)
			{
				System.out.print("x1=");
				System.out.printf("%.5f", 0 + (-b + Math.sqrt(p)) / (2 * a));
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", 0 + (-b - Math.sqrt(p)) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			else if (p == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", 0 + (-b) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
			else
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", 0 + (-b) / (2 * a));
				System.out.printf("%.5f", '+');
				System.out.printf("%.5f", Math.sqrt(-p) / (2 * a));
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", 0 + (-b) / (2 * a));
				System.out.printf("%.5f", '-');
				System.out.printf("%.5f", Math.sqrt(-p) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

