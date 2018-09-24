package <missing>;

public class GlobalMembers
{
	/*
	 * jiweijiu_liaofa.cpp
	 *
	 *  Created on: 2014-1-5
	 *      Author: ??
	 */
	public static double rank(double all,double live)
	{
		return live / all;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[2];
		a[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a[1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double std = rank(a[0], a[1]);
		for (int i = 0;i < n - 1;i++)
		{
			double[] aa = new double[2];
			aa[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			aa[1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double stdd = rank(aa[0], aa[1]);
			if (stdd - std > 0.05)
			{
				System.out.print("better\n");
			}
			else if (std - stdd > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

