package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-10-12
	 *      Author: 99003
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
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c; //??delta
			if (delta > 0)
			{ //?????
				x1 = (0.000 - b + Math.sqrt(delta)) / 2.0 / a;
				x2 = (0.000 - b - Math.sqrt(delta)) / 2.0 / a;
				System.out.print("x1=");
				System.out.printf("%.5f",x1);
				System.out.print(";x2=");
				System.out.printf("%.5f",x2);
				System.out.print("\n");
			}
			else if (delta == 0)
			{ //??????
				x1 = (0.00000000000000 - b) / 2 / a;
				System.out.print("x1=x2=");
				System.out.printf("%.5f",x1);
				System.out.print("\n");
			}
			else if (delta < 0)
			{ //??????
				x1 = (0.00000000000000 - b) / 2 / a;
				x2 = Math.sqrt(0.000000000000 - delta) / 2 / a;
				System.out.print("x1=");
				System.out.printf("%.5f",x1);
				System.out.print("+");
				System.out.printf("%.5f",x2);
				System.out.print("i;x2=");
				System.out.printf("%.5f",x1);
				System.out.print("-");
				System.out.printf("%.5f",x2);
				System.out.print("i");
				System.out.print("\n");
			}
			n = n - 1;
		}
		return 0;
	}
}

