package <missing>;

public class GlobalMembers
{
	/*
	 * sibianxingmianji.cpp
	 *
	 *  Created on: 2010-11-17
	 *      Author: Administrator
	 */
	public static double S(double a,double b,double c,double d,double e)
	{
		double s = (a + b + c + d) / 2;
		double square = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(e * 3.1415926 / (2 * 180)),2.0);
		return square;
	}
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
		double y = S(a, b, c, d, e);
		if (y < 0)
		{
			System.out.print("Invalid input");
			System.out.print("\n");
		}
		else
		{
			System.out.printf("%.4f", Math.sqrt(y));
			System.out.printf("%.4f", "\n");
		}
		return 0;
	}

}

