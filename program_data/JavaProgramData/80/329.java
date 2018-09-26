package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] monthday_ping = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] monthday_run = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct cal
	//	{
	//		int year;
	//		int month;
	//		int day;
	//	}
	//	date[2];

		int yy;
		int mm;
		int dd;
		int sum = 0;
		int i;
		date[0].year = ConsoleInput.readToWhiteSpace(true);
		date[0].month = ConsoleInput.readToWhiteSpace(true);
		date[0].day = ConsoleInput.readToWhiteSpace(true);
		date[1].year = ConsoleInput.readToWhiteSpace(true);
		date[1].month = ConsoleInput.readToWhiteSpace(true);
		date[1].day = ConsoleInput.readToWhiteSpace(true);
		if (date[1].year - date[0].year > 0)
		{
		if (date[1].year - date[0].year > 1)
		{
			sum = 365 * (date[1].year - date[0].year - 1);
		}
		for (i = date[0].month;i <= 12;i++)
		{
			sum = sum + monthday_ping[i];
		}
		sum = sum - date[0].day;
		for (i = 1;i < date[1].month;i++)
		{
			sum = sum + monthday_ping[i];
		}
		sum = sum + date[1].day;
		}
		else
		{
			if (date[0].month < date[1].month)
			{
			for (i = date[0].month;i < date[1].month;i++)
			{
				sum = sum + monthday_ping[i];
			}
			sum = sum - date[0].day + date[1].day;
			}
			else
			{
				sum = date[1].day - date[0].day;
			}
		}


		for (i = date[0].year + 1;i < date[1].year;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum++;
			}
		}
		if ((date[0].year % 4 == 0 && date[0].year % 100 != 0) || (date[0].year % 400 == 0))
		{
			if ((date[0].month < 2) || (date[0].month = 2 && date[0].day != 29))
			{
				sum++;
			}
		}
		if ((date[1].year % 4 == 0 && date[1].year % 100 != 0) || (date[1].year % 400 == 0))
		{
			if ((date[1].month = 2) || (date[1].month = 2 && date[1].day != 29))
			{
				sum++;
			}
		}
		System.out.print(sum);
		return 0;
	}


}

