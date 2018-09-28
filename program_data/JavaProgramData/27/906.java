package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????.cpp
	 *
	 *  Created on: 2013-9-30
	 *      Author: 111
	 */

	public static int Main()
	{
		int n; //????
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double shibu;
		double xubu;
		double delt;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++) //?n?????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delt = b * b - 4 * a * c; //delt????
			if (delt > 0)
			{
				x1 = (-b + Math.sqrt(delt)) / (2 * a);
				x2 = (-b - Math.sqrt(delt)) / (2 * a); //??????????
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (delt == 0)
				{ //??????????
					x1 = -b / (2 * a);
					x2 = -b / (2 * a);
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "\n");
				}
				else
				{
					shibu = -b / (2 * a); //??????
					xubu = Math.sqrt(-delt) / (2 * a);
					if (shibu == -0)
					{
						shibu = 0;
					}
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", shibu);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", xubu);
					System.out.printf("%.5f", "i;");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", shibu);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", xubu);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
			}
		}
		return 0;
	}

}

