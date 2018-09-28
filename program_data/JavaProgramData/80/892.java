package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int total = 0;
		int i;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (startYear == endYear)
		{
			total -= startDay;
			total += endDay;
			if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0) && (startMonth <= 2) && (endMonth > 2))
			{
				day[1]++;
			}
			for (i = startMonth; i < endMonth - 1; i++)
			{
				total += day[i];
			}
		}
		else
		{
			total = (endYear - startYear - 1) * 365;
			for (int year = startYear + 1; year < endYear;year++)
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					total++;
				}
			}
			total -= startDay;
			total += endDay;
			for (i = startMonth - 1; i < 12;i++)
			{
				total += day[i];
			}
			if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0) && (startMonth <= 2))
			{
				total++;
			}
			for (i = 0; i < endMonth - 1;i++)
			{
				total += day[i];
			}
			if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0) && (endMonth > 2))
			{
				total++;
			}
		}
		System.out.print(total);
		System.out.print("\n");

		return 0;
	}
}

