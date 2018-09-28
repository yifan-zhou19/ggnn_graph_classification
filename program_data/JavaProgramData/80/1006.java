package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int deltaDay = 0;
		int i = 0;
		int day1 = 0;
		int day2 = 0;
		int day = 0;

		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


		for (i = startYear; i < endYear; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
			day = day + 366;
			}
			else
			{
			day = day + 365;
			}
		}


		i = startYear;
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		{
			for (int j = 1; j < startMonth; j++)
			{
				day1 = day1 + month2[j];
			}
		}
		else
		{
			for (int j = 1; j < startMonth; j++)
			{
				day1 = day1 + month1[j];
			}
		}
		day1 = day1 + startDay;

		i = endYear;
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		{
			for (int j = 1; j < endMonth; j++)
			{
				day2 = day2 + month2[j];
			}
		}
		else
		{
			for (int j = 1; j < endMonth; j++)
			{
				day2 = day2 + month1[j];
			}
		}
		day2 = day2 + endDay;


		deltaDay = day2 - day1 + day;

		System.out.print(deltaDay);


		return 0;
	}

}

