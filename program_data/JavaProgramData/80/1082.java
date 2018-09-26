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
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int count = 0;
		int i;
		int j;
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (startYear == endYear)
		{
			if (((startYear % 4 == 0) && startYear % 100 != 0) || (startYear % 400 == 0))
			{
				if (startMonth == endMonth)
				{
					count = endDay - startDay;
				}
				else
				{
					for (i = startMonth + 1; i <= endMonth; i++)
					{
						count += month2[i];
					}
					count += month2[startMonth] - startDay;
					count += endDay;
				}
			}
			else
			{
				if (startMonth == endMonth)
				{
					count = endDay - startDay;
				}
				else
				{
					for (i = startMonth + 1; i <= endMonth; i++)
					{
						count += month1[i];
					}
					count += month1[startMonth] - startDay;
					count += endDay;
				}
			}
		}
		else
		{
			for (j = startYear; j <= endYear; j++)
			{
				if (j == startYear)
				{
					if (((j % 4 == 0) && j % 100 != 0) || (j % 400 == 0))
					{
						for (i = startMonth + 1; i <= 12; i++)
						{
							count += month2[i];
						}
						count += month2[startMonth] - startDay;
					}
					else
					{
						for (i = startMonth + 1; i <= 12; i++)
						{
							count += month1[i];
						}
						count += month1[startMonth] - startDay;
					}
				}
				else if (j == endYear)
				{
					if (((j % 4 == 0) && j % 100 != 0) || (j % 400 == 0))
					{
						for (i = 1; i <= endMonth - 1; i++)
						{
							count += month2[i];
						}
						count += endDay;
					}
					else
					{
						for (i = 1; i <= endMonth - 1; i++)
						{
							count += month1[i];
						}
						count += endDay;
					}
				}
				else
				{
					if (((j % 4 == 0) && j % 100 != 0) || (j % 400 == 0))
					{
						count += 366;
					}
					else
					{
						count += 365;
					}
				}
			}
		}
		System.out.print(count);
		return 0;
	}
}

