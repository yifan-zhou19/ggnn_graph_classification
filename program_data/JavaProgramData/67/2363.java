package <missing>;

public class GlobalMembers
{
	/*
	 * shit.cpp
	 *
	 *  Created on: 2012-10-15
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n];
		double[] b = new double[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i] = b[i] / a[i];
			if (i != 0)
			{
				if (a[i] - a[0] > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else if (a[0] - a[i] > 0.05)
				{
					System.out.print("worse");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

