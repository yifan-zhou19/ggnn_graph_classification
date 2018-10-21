package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 *
	 *  Created on: 2012-10-14
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		double x1;
		double x2;
		double delta;
		double x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			{
				delta = b[i] * b[i] - 4 * a[i] * c[i];
				x1 = (-b[i] + Math.sqrt(delta)) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(delta)) / (2 * a[i]);
				if (delta == 0)
				{
					 System.out.printf("%.5f", "x1=x2=");
					 System.out.printf("%.5f", x1);
					 System.out.printf("%.5f", "\n");
				}
			   if (delta > 0)
			   {
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
			   }
			   if (delta < 0)
			   {
					x = (Math.sqrt(-delta)) / (2 * a[i]);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", (-b[i] / (2 * a[i]) == 0?b[i] / (2 * a[i]):-b[i] / (2 * a[i])));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", x);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", (-b[i] / (2 * a[i]) == 0?b[i] / (2 * a[i]):-b[i] / (2 * a[i])));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", x);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
			   }

		}

		}
		return 0;


	}

}

