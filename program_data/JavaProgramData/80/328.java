package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int day1 = 0;
		int day2 = 0;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] nory = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] aby = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int year;
		int i;
		for (year = 0;year < sy;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				day1 = day1 + 366;
			}
			else
			{
				day1 = day1 + 365;
			}
		}
			year = sy;
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				for (i = 0;i < sm - 1;i++)
				{
					day1 = day1 + aby[i];
				}
			}
				else
				{
					for (i = 0;i < sm - 1;i++)
					{
					day1 = day1 + nory[i];
					}
				}
			day1 = day1 + sd;

			for (year = 0;year < ey;year++)
			{
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					{
						day2 = day2 + 366;
					}
					else
					{
						day2 = day2 + 365;
					}
			}
					year = ey;
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					{
						for (i = 0;i < em - 1;i++)
						{
							day2 = day2 + aby[i];
						}
					}
						else
						{
							for (i = 0;i < em - 1;i++)
							{
							day2 = day2 + nory[i];
							}
						}
					day2 = day2 + ed;
			System.out.print(day2 - day1);
			System.out.print("\n");
			return 0;

	}

}

