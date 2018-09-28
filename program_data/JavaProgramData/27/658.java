package <missing>;

public class GlobalMembers
{
	/*
	 * 004.cpp
	 *
	 *  Created on: 2012-9-28
	 *  Author: ???
	 *  ??:???????????????
	 */

	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		double x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			if (delta >= 0)
			{ //??????
				if (delta > 0)
				{
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					if (x1 == 0)
					{
						x1 = 0;
					}
					if (x2 == 0)
					{
						x2 = 0;
					}
					System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}
				else
				{
					x1 = (-b) / (2 * a);
					if (x1 == 0)
					{
						x1 = 0;
					}
					System.out.printf("x1=x2=%.5f\n", x1);
				}
			}
			else
			{
				x1 = (-b) / (2 * a);
				x = Math.sqrt(-delta) / (2 * a);
				if (x1 == 0)
				{
					x1 = 0;
				}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x,x1,x);
			}
		}
		return 0;
	}
}

