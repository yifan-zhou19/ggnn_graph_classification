package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2012-9-29
	 *      Author: 12162
	 *      ????????
	 */

	public static int i;
	public static int n;
	public static double a;
	public static double b;
	public static double c;
	public static double j;
	public static double[] x = new double[2];
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b == 0) //??0???
			{
				b = -b;
			}

			j = b * b - 4 * a * c;


			//???????
			if (j > 0)
			{
				x[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.print("x1=");
				System.out.printf("%.5f", x[0]);
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5f", x[1]);
				System.out.print("\n");
			}
			if (j == 0)
			{
				System.out.print("x1=x2=");
				System.out.printf("%.5f", -b / (2 * a));
				System.out.print("\n");
			}
			if (j < 0)
			{

				System.out.print("x1=");
				System.out.printf("%.5f", -b / (2 * a));
				System.out.print("+");
				System.out.printf("%.5f",Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.print("i");
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5f", -b / (2 * a));
				System.out.printf("%.5f",-Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.print("i");
				System.out.print("\n");
			}

		}
	return 0;
	}
}

