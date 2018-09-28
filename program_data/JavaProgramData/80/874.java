package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2013-1-13
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[] yday = {365, 366};
		int leap = 0;
		int day1 = 0;
		int day2 = 0;
		int i;
		int[][] mday =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		leap = (y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0);
		for (i = 1; i < m1; i++)
		{
			day1 += mday[leap][i];
		}
		day1 += d1;
		for (i = y1; i < y2; i++)
		{
			leap = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
			day2 += yday[leap];
		}
		leap = (y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0);
		for (i = 1; i < m2; i++)
		{
			day2 += mday[leap][i];
		}
		day2 += d2;
		day2 = day2 - day1;
		System.out.print(day2);
		System.out.print("\n");

	}

}

