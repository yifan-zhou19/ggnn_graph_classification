package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012889_3.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: ???
	 *        ??: ???????????
	 */



	public static int Main()
	{
		int[] monp = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] monr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year1;
		int year2;
		int mon1;
		int mon2;
		int day1;
		int day2;
		int np = 0;
		int nr = 0;
		int i;
		int num = 0;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = year1 + 1;i < year2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				nr++;
			}
			else
			{
				np++;
			}
		}
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			for (i = 1;i < mon1;i++)
			{
				num += monr[i];
			}
			num += day1;
			if (year1 < year2)
			{
				num = 366 - num;
			}
			else
			{
				num = -num;
			}
		}
		else
		{
			for (i = 1;i < mon1;i++)
			{
				num += monp[i];
			}
			num += day1;
			if (year1 < year2)
			{
				num = 365 - num;
			}
			else
			{
				num = -num;
			}
		}
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			for (i = 1;i < mon2;i++)
			{
				num += monr[i];
			}
			num += day2;
		}
		else
		{
			for (i = 1;i < mon2;i++)
			{
				num += monp[i];
			}
			num += day2;
		}
		num += nr * 366 + np * 365;
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

