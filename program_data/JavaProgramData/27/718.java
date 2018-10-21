package <missing>;

public class GlobalMembers
{
	/*
	 * g9.cpp
	 *?????????
	 *  Created on: 2012-10-10
	 *      Author: ???
	 */
	public static int Main()
	{
		double a;
		double b;
		double c;
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++) //????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double d = b * b - 4 * a * c; //??????
			if (d > 0) //??if??
			{
					double x1;
					double x2;
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);

			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", ";");
			System.out.printf("%.5f", "x2=");
			System.out.printf("%.5f", x2);
			System.out.printf("%.5f", "\n");
			} //??????0?

			 if (d == 0)
			 {
					double x1;
					double x2;
			x1 = -b / (2 * a);
			x2 = x1;
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", "\n");
			 } //????=0?
			 if (d < 0)
			 {
				 d = -d;
				 if (b != 0)
				 {
					 System.out.printf("%.5f", "x1=");
					 System.out.printf("%.5f", (-b) / (2 * a));
					 System.out.printf("%.5f", "+");
					 System.out.printf("%.5f", Math.sqrt(d) / (2 * a));
					 System.out.printf("%.5f", "i");
					 System.out.printf("%.5f", ";");
					 System.out.printf("%.5f", "x2=");
					 System.out.printf("%.5f", (-b) / (2 * a));
					 System.out.printf("%.5f", "-");
					 System.out.printf("%.5f", Math.sqrt(d) / (2 * a));
					 System.out.printf("%.5f", "i");
					 System.out.printf("%.5f", "\n");
				 }
			else
			{
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", b);
			System.out.printf("%.5f", "+");
			System.out.printf("%.5f", Math.sqrt(d) / (2 * a));
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", ";");
			System.out.printf("%.5f", "x2=");
			System.out.printf("%.5f", b);
			System.out.printf("%.5f", "-");
			System.out.printf("%.5f", Math.sqrt(d) / (2 * a));
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", "\n");
			}
			 }

		} //??????0?
		return 0;
	}


}

