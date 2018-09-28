package <missing>;

public class GlobalMembers
{
	/*
	 * qmfx02.cpp
	 *
	 *  Created on: 2011-1-1
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a;
		double b;
		double x;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		x = b / a;
		while (n > 1)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b / a - x > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (b / a - x < -0.05.getValue() != 0)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if (b / a - x >= -0.05 && b / a - x <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
			n--;
		}
		return 0;
	}

}

