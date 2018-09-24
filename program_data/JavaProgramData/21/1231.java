package <missing>;

public class GlobalMembers
{
	/*
	 * integratedexercise1.4.cpp
	 *
	 *  Created on: 2013-12-13
	 *      Author: st
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] a = new int[301];
		int i;

		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		double sum = 0;
		double ave;
		double distance = 0;
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		ave = sum / n;

		int count = 0;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(ave - a[i]) > distance)
			{
				distance = Math.abs(ave - a[i]);
			}
		}

		for (i = 0;i < n;i++)
		{
			if ((distance - Math.abs(ave - a[i]) < 1e-10))
			{
				count++;
			if (count == 1)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
			}
		}

	}

}

