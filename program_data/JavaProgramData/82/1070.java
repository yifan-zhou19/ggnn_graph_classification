package <missing>;

public class GlobalMembers
{
	/*
	 * pressure.cpp
	 *
	 *  Created on: 2012-10-17
	 *      Author: Justin
	 */
	public static int Main()
	{
		int p1;
		int p2;
		int hour;
		int hourmax;
		int n;
		hour = 0;
		hourmax = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			p1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p1 <= 140 && p1 >= 90 && p2 <= 90 && p2 >= 60)
			{
					hour = hour + 1;
				n = n - 1;
			}
			else
			{
				hourmax = Math.max(hour,hourmax);
			hour = 0;
			n = n - 1;
			}
		}
		System.out.print(Math.max(hour,hourmax));
		return 0;
	}
}

