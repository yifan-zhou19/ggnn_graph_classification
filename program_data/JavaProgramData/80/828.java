package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int num = 0;
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int[] Year = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (startYear == endYear)
		{
			if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
			{
					Year[1] = 29;
			}
			else
			{
				Year[1] = 28;
			}
			if (startMonth == endMonth)
			{
				num = num + endDay - startDay;
			}
			else
			{
				for (i = startMonth - 1;i < endMonth;i++)
				{
					if (i == startMonth - 1)
					{
						num = num + Year[i] - startDay;
					}
					else if (i == endMonth - 1)
					{
						num = num + endDay;
					}
					else
					{
						num = num + Year[i];
					}
				}
			}
		}
		else
		{
			for (j = startYear;j <= endYear;j++)
			{
				if (j == startYear)
				{
					if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
					{
						Year[1] = 29;
					}
					else
					{
						Year[1] = 28;
					}
					for (i = startMonth - 1;i < 12;i++)
					{
						if (i == startMonth - 1)
						{
							num = num + Year[i] - startDay;
						}
						else
						{
							num = num + Year[i];
						}
					}
				}
				else if (j == endYear)
				{
					if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
					{
						Year[1] = 29;
					}
					else
					{
						Year[1] = 28;
					}
					for (i = 0;i < endMonth;i++)
					{
						if (i == endMonth - 1)
						{
							num = num + endDay;
						}
						else
						{
							num = num + Year[i];
						}
					}
				}
				else
				{
					if ((j % 4 == 0 && j % 100 != 0) || (j % 400 == 0))
					{
						Year[1] = 29;
					}
					else
					{
						Year[1] = 28;
					}
					for (i = 0;i < 12;i++)
					{
						num = num + Year[i];
					}
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

